import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class InpuResepReaad {
    public static void main(String[] args) {
        ArrayList<Resep> daftarResep = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);

        try {
            System.out.println("Masukkan file resep dengan format .txt: ");
            String menuju = scanner1.nextLine();
            File file = new File("D:\\Semester 7\\13. Ultimate Java\\Java-Latihan\\Helsinki Code\\Part7\\Recipe\\src\\" + menuju);
            Scanner scanners = new Scanner(file);

            while (scanners.hasNextLine()) {
                String namaMakan = scanners.nextLine().trim();
                if (namaMakan.isEmpty()) continue;
                int lamaMasak = Integer.parseInt(scanners.nextLine().trim());
                ArrayList<String> bahanBahan = new ArrayList<>();

                while (scanners.hasNextLine()) {
                    String bahan = scanners.nextLine().trim();
                    if (bahan.isEmpty()) break;
                    bahanBahan.add(bahan);
                }
                daftarResep.add(new Resep(namaMakan, lamaMasak, bahanBahan));
            }
            scanners.close();
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] File tidak ditemukan: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] Format lama masak tidak valid: " + e.getMessage());
        }
        System.out.println("Perintah:");
        System.out.println("1. 'daftar': Melihat daftar setiap resep.");
        System.out.println("2. 'cari': Mencari resep berdasarkan nama.");
        System.out.println("3. 'cari waktu': Mencari daftar resep berdasarkan waktu.");
        System.out.println("4. 'bahan': Mencari daftar resep berdasarkan bahan");
        System.out.println("5. 'berhenti': Mematikan Program.");

        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        label:
        while (true){
            String perintah = scanner2.nextLine();
            switch (perintah) {
                case "bahan":
                    System.out.println("Resep dengan bahan apa yang kamu cari?");
                    String bahans = scanner3.nextLine();
                    ArrayList<Integer> hasil = ResepCommand.findBahan(daftarResep, bahans);
                    if (hasil.isEmpty()){
                        System.out.println("Resep dengan bahan " + bahans + " tidak ditemukan.");
                    } else {
                        for (int result: hasil){
                            System.out.println(daftarResep.get(result));
                        }
                    }
                    break;
                case "cari waktu":
                    System.out.println("Resep dengan berapa lama?");
                    int cariWaktu = scanner3.nextInt();
                    ResepCommand.findWaktu(daftarResep, cariWaktu);
                    break;
                case "daftar":
                    for (Resep resep : daftarResep) {
                        System.out.println(resep);
                    }
                    break;
                case "berhenti":
                    System.out.println("Program dihentikan.");
                    break label;
                case "cari":
                    System.out.println("Nama menu: ");
                    String cari = scanner3.nextLine();
                    ResepCommand.findName(daftarResep, cari);
                    break;
            }
        }
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}