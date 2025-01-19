package OOP;

public class PaymentCardDumb {
    private Double balance;

    public PaymentCardDumb (double openingBalance){
        this.balance = openingBalance;
    }

    public double balance(){
        return this.balance;
    }

    public void addMoney(double tambah){
        this.balance += tambah;
    }

    public boolean takeMoney(double jumlah){
        if (this.balance >= jumlah){
            this.balance -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
}
