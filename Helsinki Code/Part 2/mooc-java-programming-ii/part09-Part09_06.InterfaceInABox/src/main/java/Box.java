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
public class Box implements Packable {
    private ArrayList<Packable> capacity;
    private double maks;
    public Box(double maks){
        this.capacity = new ArrayList<>();
        this.maks = maks;
    }
    public void add(Packable packabl){
        if (weight() + packabl.weight() > this.maks){
            return;
        } else {
            this.capacity.add(packabl);
        }
    }
    @Override
    public double weight(){
        if (this.capacity.size() == 0){
            return 0;
        }
        double jumlah = 0;
        for (Packable pack: this.capacity){
            jumlah += pack.weight();
        }
        
        return jumlah;
    }
    public String toString(){
        return "Box: " + this.capacity.size() + " items, total weight " + weight() + " kg";
    }
}
