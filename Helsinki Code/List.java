import java.util.ArrayList;
import java.util.Scanner;
public class List {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> daftar = new ArrayList<>();

        while (true){
            if (daftar.size() > 4) {
                break;
            }
            System.out.println("Masukkan daftar nama ");
            String angka = scanner.nextLine();
            daftar.add(angka);
        }
        System.out.println("Nama ketiga adalah " + daftar.get(2));
        scanner.close();
    }
}
