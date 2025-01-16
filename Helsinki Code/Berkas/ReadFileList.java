package Berkas;
import java.util.Scanner;
import java.nio.file.Paths;

public class ReadFileList {
    public static void main(String[] args){
        Scanner scanners = new Scanner(System.in);
        String folder = "D:\\Semester 7\\13. Ultimate Java\\Java-Latihan\\Helsinki Code\\Berkas\\daftartamu.txt";
        System.out.println("Selamat Pagi, dengan siapa disini? ");

        while (true){
            String nama = scanners.nextLine();
            if (nama.equals("keluar")){
                break;
            }
            try (Scanner scanner = new Scanner(Paths.get(folder))) {
                while (scanner.hasNextLine()){
                    String isi = scanner.nextLine();
                    if (isi.equals(nama)){
                        System.out.println("Nama ada dalam daftar");
                        break;
                    } else {
                        System.out.println("Nama tidak ada dalam daftar");
                        break;
                    }
                }
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanners.close();
    }
}
