import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class BirdCommandDB {
    public static void main(String[] args){
        ArrayList<BirdWatcher> daftarBurung = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);
        try {
            System.out.println("Masukkan fill database burung dengan format .txt: ");
            String menuju = scanner1.nextLine();
            File file = new File("D:\\Semester 7\\13. Ultimate Java\\Java-Latihan\\Helsinki Code\\Part7\\BigYear\\src\\" + menuju);
            Scanner scanners = new Scanner(file);
            while (scanners.hasNextLine()){
                String namaBurung = scanners.nextLine().trim();
                if (namaBurung.isEmpty()) continue;
                String namaLatino = scanners.nextLine().trim();
                daftarBurung.add(new BirdWatcher(namaBurung, namaLatino));
            }
            scanners.close();
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] File tidak ditemukan: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] Format lama masak tidak valid: " + e.getMessage());
        }

        System.out.println("Selamat Datang di BirDB Zoo, Daftar perintah:");
        System.out.println("1. 'tambah': Menambah spesies burung baru ke database BirDB Zoo.");
        System.out.println("2. 'observasi': Menambah satu kali observasi atau kunjungan.");
        System.out.println("3. 'semua': Menampilkan setiap spesies burung pada BirDB Zoo.");
        System.out.println("4. 'satu': Menampilkan satu spesies burung pada BirDB Zoo");
        System.out.println("5. 'berhenti': Mematikan Program.");

        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        label:
        while (true){
            String perintah = scanner2.nextLine();
            switch (perintah) {
                case "tambah":
                    System.out.println("Nama:");
                    String nama = scanner3.nextLine();
                    System.out.println("Nama Latin:");
                    String namaLatin = scanner4.nextLine();
                    daftarBurung.add(new BirdWatcher(nama, namaLatin));
                    break;
                case "observasi":
                    System.out.println("Burung:");
                    String burung = scanner3.nextLine();
                    System.out.println("Jumlah Observasi:");
                    int obs = scanner4.nextInt();
                    BirdMethod.observasi(daftarBurung, burung, obs);
                    break;
                case "semua":
                    for (BirdWatcher burungs : daftarBurung) {
                        System.out.println(burungs);
                    }
                    break;
                case "berhenti":
                    System.out.println("Program dihentikan.");
                    break label;
                case "satu":
                    System.out.println("Nama burung: ");
                    String cari = scanner3.nextLine();
                    BirdMethod.findName(daftarBurung, cari);
                    break;
            }
        }
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}
