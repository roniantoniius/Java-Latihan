package UnitTest.Main.java;
import java.util.Scanner;
import java.util.ArrayList;
public class First {
    public static void main(String[] args){
        String input = "one\n" + "two\n"  +
                        "three\n" + "four\n" +
                        "five\n" + "one\n"  +
                        "six\n";
        Scanner sc = new Scanner(input);
        ArrayList<String> list = new ArrayList<String>();
        while (true){
            System.out.println("Masukkan nama angka: ");
            String nama = sc.nextLine();
            if (list.contains(nama)){
                break;
            }
            list.add(nama);
        }
        System.out.println("[PASS] First Test: Name doesnt contain in a list");
        if (list.contains("six")){
            System.out.println("[FAILED] First Test: A value that should not have been added to the group was added to it.");
        }
        sc.close();
    }
}
