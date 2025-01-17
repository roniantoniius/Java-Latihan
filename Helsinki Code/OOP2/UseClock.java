package OOP2;

public class UseClock {
    public static void main(String[] args){
        Clock jamDinding = new Clock();
        while (true){
            System.out.println(jamDinding);
            jamDinding.advance();
        }
    }
}
