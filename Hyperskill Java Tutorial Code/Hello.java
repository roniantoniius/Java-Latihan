import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gift prize about you give? ");
        int hadiah = scanner.nextInt();
        int pajak1 = 100, pajak2 = 1700, pajak3 = 4700, pajak4 = 22100, pajak5 = 142100;
        double rate_pajak1 = 0.08, rate_pajak2 = 0.1, rate_pajak3 = 0.12, rate_pajak4 = 0.15, rate_pajak5 = 0.17;

        if (hadiah >= 1000000){
            System.out.println("Your tax gift is " + (pajak5 + (hadiah - 1000000) * rate_pajak5));
        } else if (hadiah >= 200000 && hadiah <= 999999){
            System.out.println("Your tax gift is " + (pajak4 + (hadiah - 200000) * rate_pajak4));
        } else if(hadiah >= 55000 && hadiah <= 199999){
            System.out.println("Your tax gift is " + (pajak3 + (hadiah - 55000) * rate_pajak3));
        } else if(hadiah >= 25000 && hadiah <= 54999){
            System.out.println("Your tax gift is " + (pajak2 + (hadiah - 25000) * rate_pajak2));
        } else if(hadiah >= 5000 && hadiah <= 24999){
            System.out.println("Your tax gift is " + (pajak1 + (hadiah - 5000) * rate_pajak1));
        } else {
            System.out.println("Your tax of gift is completely Free!");
        }

        scanner.close();
}
}