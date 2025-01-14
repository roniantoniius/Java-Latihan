package OOP;
import java.util.Scanner;


public class Hitung {
    public static void main(String[] args){
        Multiplier kaliEmpat = new Multiplier(3);

        System.out.println(kaliEmpat.getNilai() + " dikali 12 menjadi " + kaliEmpat.pengkalian(12));

        Multiplier kaliDuaBelas = new Multiplier(12);
        System.out.println(kaliDuaBelas.getNilai() + " dikali 3 menjadi " + kaliDuaBelas.pengkalian(3));
        System.out.println(kaliDuaBelas.getNilai() + " dikali 4 menjadi " + kaliDuaBelas.pengkalian(4));

        System.out.println();
        System.out.println();

        Statistics statistik = new Statistics();
        Statistics statistikGenap = new Statistics();
        Statistics statistikGanjil = new Statistics();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Masukkan angka: ");
            int angka = scanner.nextInt();
            if (angka == -1){
                break;
            } else if (angka % 2 == 0){
                statistikGenap.tambah(angka);
            } else {
                statistikGanjil.tambah(angka);
            }
            statistik.tambah(angka);
        }
        System.out.println("Jumlah data: " + statistik.getCount());
        System.out.println("Total: " + statistik.jumlahKan());
        System.out.println("Rata-rata: " + statistik.rataRata());

        System.out.println("Jumlah data genap: " + statistikGenap.getCount());
        System.out.println("Total genap: " + statistikGenap.jumlahKan());

        System.out.println("Jumlah data ganjil: " + statistikGanjil.getCount());
        System.out.println("Total ganjil: " + statistikGanjil.jumlahKan());

        scanner.close();
    }
}
