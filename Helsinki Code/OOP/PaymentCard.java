package OOP;

public class PaymentCard {
    private Double balance;

    public PaymentCard (Double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably(){
        if (this.balance >= 2.6){
            this.balance -= 2.6;
        } else {
            this.balance += 0.0;
        }
    }

    public void eatHeartily(){
        if (this.balance >= 4.6){
            this.balance -= 4.6;
        } else {
            this.balance += 0.0;
        }
    }

    public void addMoney (Double amount){
        if (amount > 0){
            this.balance += amount;
        } else {
            this.balance += 0.0;
        }
    }
}
