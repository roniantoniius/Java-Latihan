package OOP;

public class PaymentTerminal {
    private double money; // harga makanan yang terjual keseluruhan
    private int affordableMeals; // jumlah makanan murah yang terjual
    private int healthyMeals; // jumlah makanan sehat yang terjual

    public PaymentTerminal(){
        this.money = 150.0;
        this.affordableMeals = 0;
        this.healthyMeals = 0;
    }

    public double eatAffordably(PaymentCardDumb card){
        if (card.balance() >= 2.5){
            this.money += 2.5; // penjualan makanan ditambahkan
            this.affordableMeals += 1; // jumlah makanan murah yang terjual ditambahkan
            return card.balance() - 2.5; // kembalian
        } else {
            return card.balance(); // gajadi jual makanan ini
        }
    }

    public double eatHealthy(PaymentCardDumb card){
        if (card.balance() >= 4.3){
            this.money += 4.3; // penjualan makanan ditambahkan
            this.healthyMeals += 1; // jumlah makanan sehat yang terjual ditambahkan
            return card.balance() - 4.3; // kembalian
        } else {
            return card.balance(); // gajadi jual makanan ini
        }
    }

    public void addMoneyCard(PaymentCardDumb card, double sum){
        if (sum > 0){
            card.addMoney(sum);
            this.money += sum;
        }
    }

    public String toString(){
        return "money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals + ", number of sold healthy meals: " + this.healthyMeals;
    }
}
