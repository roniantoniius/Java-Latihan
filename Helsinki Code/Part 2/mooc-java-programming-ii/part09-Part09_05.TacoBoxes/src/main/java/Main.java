
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox tacoTiga = new TripleTacoBox();
        System.out.println(tacoTiga.tacosRemaining());
        tacoTiga.add(2);
        tacoTiga.eat();
        tacoTiga.eat();
        tacoTiga.eat();
        System.out.println(tacoTiga.tacosRemaining());
        
        CustomTacoBox muchosTacos = new CustomTacoBox(23);

        System.out.println(muchosTacos.tacosRemaining());
        muchosTacos.eat();
        System.out.println(muchosTacos.tacosRemaining());
    }
}
