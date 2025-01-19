package OOP;

public class UsePaymentDumb {
    public static void main(String[] args){
        // card adalah saldo kita
        PaymentCardDumb card = new PaymentCardDumb(50);
        System.out.println(card);

        card.addMoney(550);
        System.out.println(card);

        PaymentTerminal kantin = new PaymentTerminal();
        double kembalian = kantin.eatAffordably(card);
        System.out.println("Kembalian: " + kembalian);
        
        
        kantin.addMoneyCard(card, 300);
        System.out.println(card);
        
        kembalian = kantin.eatAffordably(card);
        System.out.println("Kembalian: " + kembalian);
        
        card.takeMoney(460);
        System.out.println(card);
        
        kembalian = kantin.eatHealthy(card);
        System.out.println("Kembalian: " + kembalian);
        
        card.takeMoney(110);
        System.out.println(card);

        System.out.println(kantin);
    }
}
