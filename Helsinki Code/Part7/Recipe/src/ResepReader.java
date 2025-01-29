import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResepReader {
    public static void readResepFromFile(ArrayList<Resep> daftarResep) {
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
        } finally {
            scanner1.close();
        }
    }
}