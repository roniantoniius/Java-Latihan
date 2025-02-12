
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> daftar = new ArrayList<>();
        System.out.println("Masukkan angka atau 'end'");
        while(true){
            String perintah = scanner.nextLine();
            if(perintah.equals("end")){
                break;
            }
            Integer perintahs = Integer.valueOf(perintah);
            daftar.add(perintahs);
        }
        List<Integer> baru = positive(daftar);
        for (Integer bar: baru){
            System.out.println(bar);
        }

    }
    public static List<Integer> positive(List<Integer> names){
        List<Integer> daftar = names.stream()
                .filter(positif -> positif > 0)
                .collect(Collectors.toList());
        return daftar;
    }

}
