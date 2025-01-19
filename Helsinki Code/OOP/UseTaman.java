package OOP;
import java.util.Scanner;
public class UseTaman {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Masukkan nama taman: ");
            String namaTaman = scanner.nextLine();
            if (namaTaman.equals("exit")){
                break;
            }
            System.out.println("Masukkan minimal tinggi pengunjung: ");
            int minimalTinggi = scanner.nextInt();

            System.out.println("Masukkan nama pengunjung: ");
            String namaPengunjung = scanner.next();
            System.out.println("Masukkan tinggi pengunjung (cm): ");
            int tinggiPengunjung = scanner.nextInt();

            Person pengunjung = new Person(namaPengunjung, tinggiPengunjung, 0, 0);
            Taman taman = new Taman(namaTaman, minimalTinggi);

            if (taman.cekPengunjung(pengunjung)){
                System.out.println("Selamat datang di " + taman.toString());
            } else {
                System.out.println("Maaf, anda tidak bisa masuk ke " + taman.toString());
            }

            System.out.println(taman);
        }
        scanner.close();
    }
}
