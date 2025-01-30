
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Masukkan angka");
            String angka = scanner.nextLine();
            if (angka.equals("end")){
                break;
            }
            int angka2 = Integer.valueOf(angka);
            int result = angka2 * angka2 * angka2;
            System.out.println(result);
        }
    }
}