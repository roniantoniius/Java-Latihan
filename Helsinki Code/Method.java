import java.util.Scanner;

public class Method {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan anga: ");
        int angka = scanner.nextInt();

        System.out.println("Dibagi dengan: ");
        int angka2 = scanner.nextInt();
        
        bagi(angka, angka2);
        scanner.close();
    };

    public static void bagi(int numOfSapa, int angka){
        for (int i = numOfSapa; i <= angka; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}