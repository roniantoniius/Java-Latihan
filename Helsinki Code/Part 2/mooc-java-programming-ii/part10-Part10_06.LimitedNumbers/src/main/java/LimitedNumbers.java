
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> daftar = new ArrayList<>();
        while(true){
            Integer angkas = scanner.nextInt();
            if (angkas.equals(-1)){
                break;
            }
            daftar.add(angkas);
        }
        List<Integer> daftars = daftar.stream()
                .filter(angka -> angka > 0 && angka <= 5)
                .collect(Collectors.toList());
        for (Integer daf: daftars){
            System.out.println(daf);
        }
    }
}
