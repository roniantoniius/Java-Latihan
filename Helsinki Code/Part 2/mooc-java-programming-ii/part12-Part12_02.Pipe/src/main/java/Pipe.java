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
public class Pipe<T> {
    private ArrayList<T> daftar;
    public Pipe(){
        this.daftar = new ArrayList<>();
    }
    public void putIntoPipe(T value){
        this.daftar.add(value);
    }
    public T takeFromPipe(){
        if (this.daftar.isEmpty()){
            return null;
        }
        T sekarang = this.daftar.get(0);
        this.daftar.remove(0);
        return sekarang;
    }
    public boolean isInPipe(){
        if (this.daftar.isEmpty()){
            return false;
        }
        return true;
    }
}
