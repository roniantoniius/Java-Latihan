
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> angkas = new ArrayList<>();
        while(true){
            System.out.println("Masukkan angka:");
            int angka = scanner.nextInt();
            if (angka == 0){
                break;
            } else if (angka < 1){
                continue;
            } else {
                angkas.add(angka);
            }
        }
        int sum = 0;
        if (angkas.isEmpty()){
            System.out.println("Cannot calculate the average");
        } else {
            for (int angka: angkas){
                sum += angka;
            }
            double avg = (double) sum / angkas.size();
            System.out.println(avg);
        }
    }
}
