package Berkas;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class ReadFileCsv {
    public static void main (String[] args) {
        Scanner scanners = new Scanner(System.in);
        String folder = "D:\\Semester 7\\13. Ultimate Java\\Java-Latihan\\Helsinki Code\\Berkas\\";
        ArrayList<Esport> esport = new ArrayList<>();
        int games = 0;
        int menang = 0;
        int kalah = 0;
        
        while (true) {
            System.out.println("Input file name: ");
            String file = scanners.nextLine();
            if (file.equals("keluar")) {
                break;
            }

            System.out.println("Input team name: ");
            String team = scanners.nextLine();

            try (Scanner scanner = new Scanner(Paths.get(folder + file))) {
                while (scanner.hasNextLine()) {
                    String baris = scanner.nextLine();
                    String[] bagian = baris.split(",");
                    String home = bagian[0];
                    String away = bagian[1];
                    int homeScore = Integer.valueOf(bagian[2]);
                    int awayScore = Integer.valueOf(bagian[3]);
                    esport.add(new Esport(home, away, homeScore, awayScore));
                }

                for (int i = 0; i < esport.size(); i++) {
                    if (esport.get(i).getHome().equals(team) || esport.get(i).getAway().equals(team)) {
                        games++;
                        if (esport.get(i).getHome().equals(team) && esport.get(i).Score() > 0) {
                            menang++;
                        } else if (esport.get(i).getAway().equals(team) && esport.get(i).Score() < 0) {
                            menang++;
                        } else {
                            kalah++;
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + menang);
        System.out.println("Losses: " + kalah);
        scanners.close();
    }
}
