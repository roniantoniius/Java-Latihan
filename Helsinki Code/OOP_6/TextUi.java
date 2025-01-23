package OOP_6;
import java.util.Scanner;
public class TextUi {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    public TextUi(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    public void start(){
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Words: ");
                String words = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                this.simpleDictionary.add(words, translation);
            } else if (command.equals("translate")) {
                System.out.println("Terjemah dari kata apa? ");
                String words = scanner.nextLine();
                this.simpleDictionary.translate(words);
            }
        }
    }
}
