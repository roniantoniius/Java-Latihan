package Berkas;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
public class ReadFileNumber {
    public static void main(String[] args){
        String folder = "D:\\Semester 7\\13. Ultimate Java\\Java-Latihan\\Helsinki Code\\Berkas\\";
        Scanner scanners = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("File? ");
            String file = scanners.nextLine();
            if (file.equals("exit")) {
                break;
            }

            System.out.println("Batas bawah? ");
            int bawah = Integer.valueOf(scanners.nextLine());

            System.out.println("Batas atas? ");
            int atas = Integer.valueOf(scanners.nextLine());

            try (Scanner scanner = new Scanner(Paths.get(folder + file))) {
                while (scanner.hasNextLine()) {
                    int isi = Integer.valueOf(scanner.nextLine());
                    
                    if (isi >= bawah && isi <= atas) {
                        numbers.add(isi);
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Numbers: " + numbers.size());
        scanners.close();
    }
}
