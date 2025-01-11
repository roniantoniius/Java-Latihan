import java.util.ArrayList;
import java.util.Scanner;

public class List2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarNama = new ArrayList<>();
        int index = daftarNama.size();

        while(index >= 0){
            System.out.println("Masukkan daftar nama ");
            String nama = scanner.nextLine();
            daftarNama.add(nama);
            if (daftarNama.get(index) == ""){
                index = -2;
            }
            index ++;
        }

        System.out.println("Daftar ke-1 " + daftarNama.get(0));
        System.out.println("Daftar terakhir " + daftarNama.get(daftarNama.size() - 2));

        scanner.close();
    }
}
