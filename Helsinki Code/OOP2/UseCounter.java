package OOP2;
import java.util.ArrayList;
public class UseCounter {
    public static void main(String[] args){
        ArrayList<Counter> counters = new ArrayList<Counter>();
        counters.add(new Counter(10));
        counters.add(new Counter());
        counters.add(new Counter(5));

        // decrease

        
        for (Counter counter: counters){
            counter.decrease();
            System.out.println(counter.value() + ", ");
            counter.increase(2);
            System.out.println(counter.value() + ", ");
        }
    }
}
