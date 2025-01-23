package OOP_6;
import java.util.Scanner;
public class UseUserInterface {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        WordSet wordSet = new WordSet();
        UserInterface userIn = new UserInterface(scanner, wordSet);
        userIn.start();
    }
}
