import java.util.Scanner;

public class Recurring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        
        System.out.println("angka kedua: ");
        int angka2 = scanner.nextInt();

        int jumlah = angka1 + angka2;
        double akar = Math.sqrt(jumlah);

        System.out.println("Akar dari " + angka1 + " Ditambah dengan " + angka2 + " adalah " + akar);
        scanner.close();
    }
}