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
public class OneItemBox extends Box {
    private ArrayList<Item> items;
    public OneItemBox(){
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(!this.items.isEmpty()){ // method untuk memastikan bahwa dalam class OneItemBox hanya ada satu box
            return;
        }
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        if(this.items.contains(item)){
            return true;
        }
        return false;
    }
    
}
