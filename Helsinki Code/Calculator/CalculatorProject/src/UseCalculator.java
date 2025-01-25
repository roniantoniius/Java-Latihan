import java.util.Scanner;
public class UseCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true){
            System.out.println("Masukkan perintah (0-2), angka kamu sekarang adalah " + calculator.getValue() + ": ");
            int perintah = scanner.nextInt();
            if (perintah == 0){
                break;
            } else if (perintah == 1){
                System.out.println("Menambah angka dengan berapa? ");
                int angka = scanner.nextInt();
                if (angka < 0){
                    System.out.println("Hmm coba masukkan angka > 0 (bilangan positif)");
                } else {
                    calculator.add(angka);
                }
            } else if (perintah == 2){
                System.out.println("Dikurangi dengan berapa? ");
                int angka = scanner.nextInt();
                if (angka < 0){
                    System.out.println("Coba lagi masukkan angka bilangan positif!");
                } else {
                    calculator.substract(angka);
                }
            }
        }
        scanner.close();
    }
}
