import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> daftarAngka = new ArrayList<>();

        int index = daftarAngka.size();

        while (true){
            System.out.println("angka: ");
            int angka = scanner.nextInt();
            daftarAngka.add(angka);

            if (daftarAngka.get(index) == 0){
                break;
            }
            index++;
        }

        System.out.println("Dari angka ");
        int angkaAwal = scanner.nextInt();
        System.out.println("Sampai angka ");
        int angkaAkhir = scanner.nextInt();

        for (int i = angkaAwal; i <= angkaAkhir; i++){
            System.out.print("[" + daftarAngka.get(i) + "] ");
        }
        scanner.close();
    }
}
