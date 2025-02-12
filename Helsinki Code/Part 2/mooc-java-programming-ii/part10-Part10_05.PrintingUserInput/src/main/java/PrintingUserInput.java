
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> korpus = new ArrayList<>();
        while(true){
            String teks = scanner.nextLine();
            if(teks.isEmpty()){
                break;
            }
            korpus.add(teks);
        }
        String gabung = korpus.stream()
                .reduce("", (sebelum, sekarang) -> sebelum + sekarang + "\n");
        System.out.println(gabung);
    }
}
