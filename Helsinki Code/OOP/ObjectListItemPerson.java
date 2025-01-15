package OOP;
import java.util.Scanner;
import java.util.ArrayList;

public class ObjectListItemPerson {
    public static void main(String[] args){
        ArrayList<Person> orangOrang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
    
        while (true){
            System.out.println("Masukkan nama: ");
            String nama = scanner.nextLine();
            if(nama.isEmpty()){
                break;
            };
            orangOrang.add(new Person(nama));
        }
        System.out.println();
        System.out.println("Jumlah orang adalah " + orangOrang.size());
        System.out.println("Yang terdiri dari ");
        for (Person orang: orangOrang){
            System.out.println(orang);
        }
        scanner.close();
    }

}
