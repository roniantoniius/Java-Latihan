package OOP_6;
import java.util.Scanner;
public class UseDictionary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary simpleDictionary = new SimpleDictionary();
        TextUi textUi = new TextUi(scanner, simpleDictionary);
        textUi.start();
        System.out.println(simpleDictionary.translate("yasasi"));
    }
}
