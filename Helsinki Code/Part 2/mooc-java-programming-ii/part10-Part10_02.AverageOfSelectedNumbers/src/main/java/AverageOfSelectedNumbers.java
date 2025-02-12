
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> daftar = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String angka = scanner.nextLine();
            if(angka.equals("end")){
                break;
            }
            daftar.add(angka);
        }
        Double rataRataPositif = daftar.stream()
                .mapToInt(arg0 -> Integer.valueOf(arg0))
                .filter(arg1 -> arg1 > 0)
                .average()
                .getAsDouble();
        
        Double rataRataNegatif = daftar.stream()
                .mapToInt(arg0 -> Integer.valueOf(arg0))
                .filter(arg1 -> arg1 < 0)
                .average()
                .getAsDouble();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String perintah = scanner.nextLine();
        if(perintah.equals("n")){
            System.out.println("Average of the negative numbers: " + rataRataNegatif);
        } else if(perintah.equals("p")){
            System.out.println("Average of the positive numbers: " + rataRataPositif);
        }
    }
}
