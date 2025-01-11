import java.util.Scanner;
import java.util.ArrayList;

public class List4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> daftarAngka = new ArrayList<>();
        int index = daftarAngka.size();

        while (true){
            System.out.println("angka: ");
            int angka = scanner.nextInt();
            daftarAngka.add(angka);

            if (daftarAngka.get(index) == -1){
                break;
            }
            index++;
        }

        System.out.println("Cari angka berapa?");
        int cari = scanner.nextInt();

        for (int i = 0; i < daftarAngka.size(); i++){
            if (daftarAngka.get(i) == cari){
                System.out.println("Angka " + cari + " ditemukan pada index ke-" + i);
            }
        }

        scanner.close();
    }
}
