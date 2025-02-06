/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity){
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        int jumlahBobot = 0;
        for (Item daftar: this.items){
            jumlahBobot += daftar.getWeight();
        }
        if (item.getWeight() == 0){
            this.items.add(item);
        }
        if (jumlahBobot < this.capacity){
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item daftar: this.items){
            if (daftar.equals(item)){
                return true;
            }
        }
        return false;
    }
    
}
