package OOP;

public class UsePersonNull {
    public static void main(String[] args){
        Person aku = new Person("Roni Antonius");
        System.out.println(aku);
        
        Person roni = aku;
        roni.makinTua();
        roni.makinTua();
        System.out.println(roni);

        aku = new Person("Roni aja");
        System.out.println(aku);

        roni = null;
        roni.makinTua();
        System.out.println(roni);
    }
}
