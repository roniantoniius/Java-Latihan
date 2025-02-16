/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Literature {
    private String namaBuku;
    private int umur;
    public Literature(String namaBuku, int umur){
        this.namaBuku = namaBuku;
        this.umur = umur;
    }
    public String getName(){
        return this.namaBuku;
    }
    public int getUmur(){
        return this.umur;
    }
    @Override
    public String toString(){
        return getName() + " (recommended for " + getUmur() + " year-olds or older";
    }
}
