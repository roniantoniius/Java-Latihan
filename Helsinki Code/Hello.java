import java.util.Scanner;

public class Hello {
    public static void main(String[] args) { // ini adalah main method dari class Hello
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan hadiah yang kamu mau: ");
        int hadiah = scanner.nextInt();

        int pajak1 = 100, pajak2 = 400, pajak3 = 1000, pajak4 = 5000;
        double rate_pajak1 = 0.05, rate_pajak2 = 0.1, rate_pajak3 = 0.15, rate_pajak4 = 0.2;
        
        if (hadiah > 1000000) {
            System.out.println("Pajak kamu adalah " + (pajak4 + (hadiah - 1000000) * rate_pajak1));
        } else if (hadiah > 750000 && hadiah < 1000000) {
            System.out.println("Pajak kamu adalah " + (pajak3 + (hadiah - 750000) * rate_pajak2));
        } else if (hadiah > 500000 && hadiah < 750000) {
            System.out.println("Pajak kamu adalah " + (pajak2 + (hadiah - 500000) * rate_pajak3));
        } else if (hadiah > 250000 && hadiah < 500000) {
            System.out.println("Pajak kamu adalah " + (pajak1 + (hadiah - 250000) * rate_pajak4));
        } else {
            System.out.println("Pajak kamu adalah " + hadiah * rate_pajak1);
        }
        scanner.close();
    }
}