package OOP;

public class Debt {
    private Double initialBalance;
    private Double interest;

    public Debt(Double awalBalance, Double awalInterestRate){
        this.initialBalance = awalBalance;
        this.interest = awalInterestRate;
    }

    public void printBalance(){
        System.out.println("Balance: " + this.initialBalance);
    };

    public void waitOneYear(){
        this.initialBalance = this.initialBalance * this.interest;
    };
}
