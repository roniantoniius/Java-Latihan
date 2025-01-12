
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hitung = 0;
        int umur = 0;
        String[] nama = new String[5];

        while (true){
            System.out.println("Masukkan nama,umur: ");
            String teks = scanner.nextLine();
            if (teks.equals("")) break;

            String[] daftarUmur = teks.split(",");
            umur = umur + Integer.valueOf(daftarUmur[1]);
            nama[hitung] = daftarUmur[0];
            hitung = hitung + 1;
        }
        String namaTerpanjang = nama[0];
        for (int i = 0; i < hitung; i++){
            if (nama[i].length() > namaTerpanjang.length()){
                namaTerpanjang = nama[i];
            }
        }
        System.out.println("Nama terpanjang: " + namaTerpanjang);
        System.out.println("Rata-rata umur: " + umur/hitung);
        scanner.close();
    }
}
