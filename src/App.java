public class App {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item item = new Item("Buku", 10);
        // Fruit buah = new Fruit("Fuji", "Apel", 210);
        // Weapon weapon = new Weapon("Gun", "Vandal", 1, 160);

        inventory.addItem(item);
        inventory.addItem("Apel", 210, "Fuji");
        inventory.addItem("Vandal", 12, 160, "Rifle Gun");

        inventory.showItems();
    }
}
