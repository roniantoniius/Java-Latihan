package OOP;

public class UsePaymentCard {
    public static void main(String[] args){
        PaymentCard card1 = new PaymentCard(400.5);
        System.out.println(card1);

        card1.eatAffordably();
        System.out.println(card1);

        card1.eatHeartily();
        card1.eatAffordably();
        System.out.println(card1);

        card1.addMoney(2000.0);
        System.out.println(card1);
    }
}
