package OOP;
import java.util.Scanner;

public class UseFilm {
    
    public static void main(String[] args){
        Film chipmunk = new Film("Alvin dan chipmunk imutt", 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Umur kamu berapa? ");
        int umur = scanner.nextInt();

        System.out.println();

        if (umur > chipmunk.ageRating()){
            System.out.println("Kamu bisa menonton film " + chipmunk.name());
        } else {
            System.out.println("Maaf kamu tidak bisa menonton film " + chipmunk.name());
        };

        scanner.close();
    }
}
