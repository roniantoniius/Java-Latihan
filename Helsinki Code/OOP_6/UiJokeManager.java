package OOP_6;
import java.util.Scanner;
public class UiJokeManager {
    private JokeManager jokeManager;
    private Scanner scanner;
    public UiJokeManager(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    public void start(){
        while (true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")){
                break;
            }
            if (command.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokeManager.addJoke(joke);
            }
            if (command.equals("2")){
                System.out.println("Drawing a joke.");
                System.out.println(this.jokeManager.drawJoke());
            }
            if (command.equals("3")){
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }
        }
    }
}
