import java.util.Scanner;
import java.util.ArrayList;

public class List5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> daftarAngka = new ArrayList<>();
        int index = daftarAngka.size();
        
        while(true){
            System.out.println("Angka: ");
            int angka = scanner.nextInt();
            daftarAngka.add(angka);
            if (daftarAngka.get(index) == 9999){
                break;
            }
            index++;
        }
        
        int kecil = daftarAngka.get(0);
        for (int i = 0; i < daftarAngka.size(); i++){
            if (daftarAngka.get(i) < kecil){
                kecil = daftarAngka.get(i);
            }
        }
        System.out.println("Angka terkecil adalah " + kecil);
        scanner.close();
    }
}
