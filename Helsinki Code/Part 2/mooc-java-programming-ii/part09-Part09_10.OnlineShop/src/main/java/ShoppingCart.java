/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
public class ShoppingCart implements StoreInter {
    private Map<String, Item> belanja;
    public ShoppingCart(){
        this.belanja = new HashMap<>();
    }
    public void add(String product, int price){
        if (!this.belanja.containsKey(product)){
            this.belanja.put(product, new Item(product, 1, price));
        } else {
            Item item = this.belanja.get(product);
            item.increaseQuantity();
        }
    }
    @Override
    public int price(){
        int harTot = 0;
        for (Item prod: this.belanja.values()){
            harTot += prod.price();
        }
        return harTot;
    }
    public void print(){
        // print a product name and the quantity
        for (Item prod: this.belanja.values()){
            System.out.println(prod.getItem() + ": " + prod.getQty());
        }
    }
}
