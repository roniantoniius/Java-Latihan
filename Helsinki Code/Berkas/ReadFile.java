package Berkas;
import java.util.Scanner;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args){
        String folder = "D:\\Semester 7\\13. Ultimate Java\\Java-Latihan\\Helsinki Code\\Berkas\\";

        Scanner scanners = new Scanner(System.in);
        while (true){
            System.out.println("Masukkan nama file yang akan kita lihat isinya beserta formatnya (files.txt): ");
            String file = scanners.nextLine();
            if (file.equals("exit")){
                break;
            }
            try (Scanner scanner = new Scanner(Paths.get(folder + file))) {
                while (scanner.hasNextLine()){
                    String isi = scanner.nextLine();
                    System.out.println(isi);
                }
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }   
        }
        scanners.close();
    }
}
