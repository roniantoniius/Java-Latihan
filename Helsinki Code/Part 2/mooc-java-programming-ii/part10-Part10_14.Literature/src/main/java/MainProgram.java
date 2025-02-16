import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Literature> rakBukuSains = new ArrayList<>();
        while (true){
            System.out.println("Input the name of the book, empty stops: ");
            String namas = scanner.nextLine();
            if (namas.isEmpty()){
                break;
            }
            System.out.println("Input the age recommendation: ");
            int umurs = scanner.nextInt();
            scanner.nextLine();
            rakBukuSains.add(new Literature(namas, umurs));
        }
        if (rakBukuSains.size() > 0){
            System.out.println(rakBukuSains.size() + " books in total.");
            Comparator<Literature> comparator = Comparator
                    .comparing(Literature::getUmur)
                    .thenComparing(Literature::getName);
            Collections.sort(rakBukuSains, comparator);
            for (Literature buku: rakBukuSains){
                System.out.println(buku);
            }
        }
    }

}
