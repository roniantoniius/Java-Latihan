import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.nio.file.Paths;
import java.util.Scanner;

public class SortDapus {
    public static void main(String[] args){
        String folder = "D:\\Semester 7\\13. Ultimate Java\\Java-Latihan\\Helsinki Code\\Berkas\\dapus.csv";
        ArrayList<String> listDapus = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Selamat datang di program daftar dapus: (1: dapus into list + sort abjad, 2: dapus list into csv, 3: print setiap dapus , 4: exit)");
            int tugas = scanner.nextInt();
            if (tugas == 1){
                try (Scanner scanners = new Scanner(Paths.get(folder))){
                    while (scanners.hasNextLine()){
                        String dapus = scanners.nextLine();
                        listDapus.add(dapus);
                    }
                } catch (Exception e){
                    System.out.println("[ERROR] Waduh ada error: " + e);
                }
                Collections.sort(listDapus);
            } else if (tugas == 2){
                try (FileWriter writer = new FileWriter("dapus_bersih.csv")){
                    for (String dap: listDapus){
                        writer.write(dap + "\n");
                    }
                    System.out.println("[PASS]: Daftar Dapus sudah berhasil disimpan ke 'dapus_bersih.csv'.");
                } catch (IOException e){
                    e.printStackTrace();
                }
            } else if (tugas == 4){
                System.out.println("[PASS] Program sudah selesai!");
                break;
            } else if (tugas == 3) {
                for (String str: listDapus){
                    System.out.println(str);
                }
            } else {
                System.out.println("[ERROR] Perintah tidak diketahui, coba perintah lain! (1-3)");
            }
        }
        scanner.close();
    }
}