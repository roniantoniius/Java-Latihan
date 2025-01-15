package OOP;
import java.util.Scanner;
import java.util.ArrayList;

public class UsePersonArray {
    public static void main(String[] args){
        ArrayList<Person> peoplePeople = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama, umur, tinggi, dan berat yang dipisah dengan koma ok.");
        while(true){
            System.out.println("Masukkan nama, umur, tinggi, dan berat: ");
            String namaUmur = scanner.nextLine();
            if (namaUmur.isEmpty()){
                break;
            }
            String[] list = namaUmur.split(",");
            String nama = list[0];
            int tinggi = Integer.valueOf(list[2]);
            int berat = Integer.valueOf(list[3]);
            Person baru = new Person(nama);
            baru.makinTua();
            baru.makinTua();
            baru.setTinggi(tinggi);
            baru.setBerat(berat);
            peoplePeople.add(baru);
        }
        System.out.println();
        System.out.println("Jumlah orang adalah " + peoplePeople.size());
        System.out.println("Yang terdiri dari ");
        for (Person orang: peoplePeople){
            System.out.println(orang);
        }
        scanner.close();
    }
}
