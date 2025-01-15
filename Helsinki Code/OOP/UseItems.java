package OOP;
import java.util.Scanner;
import java.util.ArrayList;

public class UseItems {
    public static void main(String[] args){
        ArrayList<Items> barangBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Masukan barang apa? ");
            String barang = scanner.nextLine();
            if (barang.isEmpty()){
                break;
            }
            barangBarang.add(new Items(barang));
        }
        System.out.println();
        System.out.println("Jumlah barang adalah " + barangBarang.size());
        System.out.println("Yang terdiri dari ");
        for (Items barangs: barangBarang){
            System.out.println(barangs);
        }
        scanner.close();
    }    
}
