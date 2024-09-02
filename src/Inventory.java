import java.util.ArrayList;

// Inventory class for storing items like items, fruits and weapons
// implement OOP concept of inheritance
public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(String nama_produk, int kuantitas, String type) {
        items.add(new Fruit(type, nama_produk, kuantitas));
    }

    public void addItem(String nama_produk, int kuantitas, int damage, String type) {
        items.add(new Weapon(type, nama_produk, kuantitas, damage));
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

}