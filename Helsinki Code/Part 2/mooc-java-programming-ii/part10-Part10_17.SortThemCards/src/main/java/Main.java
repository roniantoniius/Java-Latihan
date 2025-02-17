
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // test your code here
//        List<Card> dek = new ArrayList<>();
//        dek.add(new Card(2, Suit.DIAMOND));
//        dek.add(new Card(14, Suit.SPADE));
//        dek.add(new Card(14, Suit.CLUB));
//        dek.add(new Card(12, Suit.HEART));
//        dek.stream()
//                .sorted((sekarang, nanti) -> {
//                    return sekarang.compareTo(nanti);
//                })
//                .forEach(System.out::println);

        Hand hand1 = new Hand();

        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));
        
        Hand hand2 = new Hand();

        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));
        
        int comparison = hand1.compareTo(hand2);

        if (comparison < 0) {
            System.out.println("better hand is");
            hand2.print();
        } else if (comparison > 0){
            System.out.println("better hand is");
            hand1.print();
        } else {
            System.out.println("hands are equal");
        }
    }
}
