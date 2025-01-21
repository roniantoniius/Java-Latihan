package OOP;

public class UseMoney {
    public static void main(String[] args){
        Money a = new Money(310, 45);
        Money b = new Money(48, 79);

        Money c = a.plus(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = a.plus(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Money d = a.minus(b);
        System.out.println(d);

        System.out.println(a.lessThan(d));
    }
}
