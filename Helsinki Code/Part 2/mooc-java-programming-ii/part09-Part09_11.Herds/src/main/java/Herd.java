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
public class Herd implements Movable{
    private ArrayList<Movable> kumpulan;
    public Herd(){
        this.kumpulan = new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        this.kumpulan.add(movable);
    }
    @Override
    public String toString(){
        String hasil = "";
        for (Movable kumpul: this.kumpulan){
            hasil += kumpul.toString();
            hasil += "\n";
        }
        return hasil;
    }
    @Override
    public void move(int dx, int dy){
        for (Movable kumpul: this.kumpulan){
            kumpul.move(dx, dy);
        }
    }
}
