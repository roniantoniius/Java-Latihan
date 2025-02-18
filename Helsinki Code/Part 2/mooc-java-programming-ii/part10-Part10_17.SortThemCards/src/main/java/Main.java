
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
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

//        ArrayList<Card> cards = new ArrayList<>();
//
//        cards.add(new Card(3, Suit.SPADE));
//        cards.add(new Card(2, Suit.DIAMOND));
//        cards.add(new Card(14, Suit.SPADE));
//        cards.add(new Card(12, Suit.HEART));
//        cards.add(new Card(2, Suit.SPADE));
//
//        Collections.sort(cards, new BySuitInValueOrder());
//
//        cards.stream().forEach(c -> System.out.println(c));
//        
        
        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sortBySuit();

        hand.print();
    }
}
