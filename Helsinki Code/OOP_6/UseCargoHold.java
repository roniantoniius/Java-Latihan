package OOP_6;

public class UseCargoHold {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);
        Item berat = suitcase.heaviestItem();
        System.out.println("Barang paling berat adalah " + berat);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(suitcase);
        hold.addSuitcase(pekkasCase);
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
