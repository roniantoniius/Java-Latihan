package OOP_6;
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private WordSet wordSet;
    public UserInterface(Scanner scanner, WordSet wordSet){
        this.scanner = scanner;
        this.wordSet = wordSet;
    }
    public void start(){
        while (true){
            System.out.println("Masukkan nama ");
            String nama = scanner.nextLine();
            if (this.wordSet.contains(nama)){
                break;
            }
            this.wordSet.add(nama);
        }
        System.out.println("Kamu memasukkan nama yang sama dua kali!");
        System.out.println(this.wordSet.palindrome() + " dari nama-nama yang palindrome"); // palindrome adalah kata yang sama jika dibaca dari depan dan belakang
    }
}
