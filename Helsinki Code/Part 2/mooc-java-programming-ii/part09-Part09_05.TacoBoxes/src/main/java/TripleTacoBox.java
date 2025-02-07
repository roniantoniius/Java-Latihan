/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class TripleTacoBox implements TacoBox {
    private int tacos = 3;
    public TripleTacoBox(){
        this.tacos = tacos;
    }
    @Override
    public int tacosRemaining(){
        return this.tacos;
    }
    public void add(int berapaYa){
        this.tacos += berapaYa;
    }
    @Override
    public void eat(){
        if (this.tacos <= 0){
            this.tacos = 0;
        } else if(this.tacos > 0){
            this.tacos -= 1;
        }
    }
}
