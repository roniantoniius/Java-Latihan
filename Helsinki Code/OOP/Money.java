package OOP;

public class Money {
    private final int euros; // penggunaan final artinya nilai ini tidak bisa diubah (immutable)
    private final int cents;

    public Money(int euros, int cents){
        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if (this.euros < compared.euros){
            return true;
        }

        if (this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser){
        Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        if (newMoney.euros < 0){
            newMoney = new Money(0, 0);
        }
        return newMoney;
    }

    public String toString(){
        String kosong = "";
        if (cents <= 100){
            kosong = "0";
        }

        return euros + "." + kosong + cents + "e";
    }
}
