
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(num -> System.out.println(num));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> daftar = numbers.stream()
                .filter(angka -> {
                    if(angka % 2 == 0){
                        return true;
                    } else if(angka % 3 == 0){
                        return true;
                    } else if(angka % 5 == 0){
                        return true;
                    } else {
                        return false;
                    }
                })
                .collect(Collectors.toCollection(ArrayList::new));
        return daftar;
    }

}
