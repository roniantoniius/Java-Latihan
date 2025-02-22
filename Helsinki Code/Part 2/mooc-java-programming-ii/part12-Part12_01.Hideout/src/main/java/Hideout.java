/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Hideout<T> {
    private T simpan;
    public void putIntoHideout(T toHide){
//        if (this.simpan.toString().isEmpty()){
//            this.simpan = toHide;
//        }
        this.simpan = toHide;
    }
    public T takeFromHideout(){
        if (this.simpan == null){
            return null;
        }
        T baru = this.simpan;
        this.simpan = null;
        return baru;
    }
    public boolean isInHideout(){
        if (this.simpan == null){
            return false;
        }
        return true;
    }
}
