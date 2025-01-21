package OOP;
import java.util.Scanner;
import java.util.ArrayList;

public class UseBooks {
    public static void main(String[] args){
        ArrayList<Books> bukuBuku = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Masukkan judul, penulis, halaman, dan tahun terbit yang dipisah dengan koma ok.");
            System.out.println("Masukkan judul, penulis, halaman, dan tahun terbit: ");
            String judulHalamanTahun = scanner.nextLine();
            if (judulHalamanTahun.isEmpty()){
                break;
            }
            String[] list = judulHalamanTahun.split(",");
            String judul = list[0];
            String penulis = list[1];
            int halaman = Integer.valueOf(list[2]);
            int tahunTerbit = Integer.valueOf(list[3]);
            Books baru = new Books(judul, penulis, halaman, tahunTerbit);
            if (bukuBuku.contains(baru)){
                System.out.println("Buku sudah ada di dalam list.");
                continue; // continue akan menghentikan iterasi saat ini dan melanjutkan ke iterasi berikutnya
            }
            bukuBuku.add(baru);
        }

        System.out.println("Informasi apa yang ingin ditampilkan? (semua/judul)");
        String pilihan = scanner.nextLine();
        if (pilihan.equals("semua")){
            for (Books buku: bukuBuku){
                System.out.println(buku);
            }
        } else if (pilihan.equals("judul")){
            for (Books buku: bukuBuku){
                System.out.println(buku.getJudul());
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}
