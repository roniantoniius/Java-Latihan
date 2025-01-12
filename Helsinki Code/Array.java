import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] daftarAngka = new int[5];
        int index = 0;

        while (true) {
            if (index >= 5){
                break;
            }
            System.out.println("angka: ");
            int angka = scanner.nextInt();
            daftarAngka[index] = angka;
            index++;
        }
        System.out.println("Pilih angka : ");
        int pilih1 = scanner.nextInt();
        System.out.println("Pilih angka : ");
        int pilih2 = scanner.nextInt();

        int pembantu = daftarAngka[pilih1];
        daftarAngka[pilih1] = daftarAngka[pilih2];
        daftarAngka[pilih2] = pembantu;

        int indeks = 0;

        while (indeks < daftarAngka.length){
            System.out.println(daftarAngka[indeks]);
            indeks++;
        }

        System.out.println("Panjang arraynya adalah " + daftarAngka.length);
        scanner.close();
    }
}
