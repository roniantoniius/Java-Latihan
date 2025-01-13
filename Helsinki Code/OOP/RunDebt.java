package OOP;

public class RunDebt {
    public static void main(String[] args){
        Debt kredit = new Debt(15000000.0, 1.15);
        kredit.printBalance();
        kredit.waitOneYear();
        kredit.printBalance();

        for (int i = 0; i < 20; i++){
            kredit.waitOneYear();
        }

        kredit.printBalance();
    }
}
