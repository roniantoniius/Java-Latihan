package Berkas;
import java.util.Scanner;
import java.nio.file.Paths;

public class ReadFileList {
    public static void main(String[] args){
        Scanner scanners = new Scanner(System.in);
        String folder = "D:\\Semester 7\\13. Ultimate Java\\Java-Latihan\\Helsinki Code\\Berkas\\";

        while (true){
            System.out.println("Masukkan nama yang akan kita cari dalam file tersebut: ");
            String nama = scanners.nextLine();
            if (nama.equals("keluar")){
                break;
            }
            System.out.println("Masukkan nama file yang akan kita lihat isinya beserta formatnya (files.txt): ");
            String file = scanners.nextLine();

            try (Scanner scanner = new Scanner(Paths.get(folder + file))) {
                boolean found = false;
                while (scanner.hasNextLine()){
                    String isi = scanner.nextLine();
                    if (isi.equals(nama)){
                        found = true;
                        System.out.println("Nama ada dalam daftar");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Nama tidak ada dalam daftar");
                }
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanners.close();
    }
}
