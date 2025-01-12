import java.util.ArrayList;
import java.util.Scanner;
public class ListMethod {
    public static void cetak(ArrayList<String> list){
        for (String catat: list){
            System.out.println(catat);
        }
    }

    public static void main(String[] args){
        ArrayList<String> daftar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while (true){
            System.out.println("Masukkan nama: ");
            String nama = scanner.nextLine();
            daftar.add(nama);
            if (daftar.get(index).equals("stop")){
                break;
            }
            index++;
        }
        cetak(daftar);
        scanner.close();
    }
}
