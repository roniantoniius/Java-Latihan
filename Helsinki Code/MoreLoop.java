import java.util.Scanner;

public class MoreLoop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih angka ");

        int jumlah = 0;
        int adaBerapa = 0;
        int ganjil = 0;
        int genap = 0;

        while (true){
            int angka = scanner.nextInt();
            if (angka == -1){
                break;
            };

            if (angka % 2 == 0){
                genap++;
            } else {
                ganjil++;
            }
            adaBerapa++;
            jumlah = jumlah + angka;
        }
        System.out.println("Jumlah " + jumlah);
        System.out.println("ada " + adaBerapa);
        System.out.println("rata-rata adalah " + (double) jumlah / adaBerapa);
        System.out.println("Ganjil " + ganjil);
        System.out.println("Genap " + genap);
        scanner.close();
    };
};