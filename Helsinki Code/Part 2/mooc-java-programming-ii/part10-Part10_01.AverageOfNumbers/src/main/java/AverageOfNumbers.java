
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> daftar = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String perintah = scanner.nextLine();
            if(perintah.equals("end")){
                break;
            }
            daftar.add(perintah);
        }
        
        double rataRata = daftar.stream()
                .mapToInt(angka -> Integer.valueOf(angka))
                .average()
                .getAsDouble();
                
        System.out.println("average of the numbers: " + rataRata);
    }
}