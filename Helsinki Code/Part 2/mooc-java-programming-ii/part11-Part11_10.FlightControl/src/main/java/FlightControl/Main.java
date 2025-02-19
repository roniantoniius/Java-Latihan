package FlightControl;
import java.util.Scanner;
import FlightControl.ui.TextUI;
import FlightControl.logic.FlightControl;
public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl kijang = new FlightControl(); 
        Scanner scanner = new Scanner(System.in);
        TextUI tampilan = new TextUI(kijang, scanner);
        tampilan.start();
    }
}
