package OOP_6;
import java.util.ArrayList;
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    private int currentWeight;
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.currentWeight = 0;
    }
    public void addItem(Item item){
        this.items.add(item);
        this.currentWeight += item.getWeight();
        if (this.currentWeight > this.maxWeight){
            this.currentWeight -= item.getWeight();
        }
    }
    public int totalWeight(){
        return this.currentWeight;
    }
    public String printItems(){
        String daftar = "";
        for (Item daftars: this.items){
            daftar = daftars + "\n";
        }
        return daftar;
    }
    public Item heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }
        Item item = this.items.get(0);
        for (Item var: this.items){
            if (item.getWeight() < var.getWeight()){
                item = var;
            }
        }
        return item;
    }
    public String toString(){
        if (items.isEmpty()){
            return "no items (0 kg).";
        }
        return this.items.size() + " item, dengan jumlah bobot " + this.currentWeight + " kg.";
    }
}
