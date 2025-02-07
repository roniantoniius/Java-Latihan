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
public class Warehouse {
    private Map<String, Integer> harga;
    private Map<String, Integer> stok;
    public Warehouse(){
        this.harga = new HashMap<>();
        this.stok = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock){
        this.harga.put(product, price);
        this.stok.put(product, stock);
    }
    public int price(String product){
        return this.harga.getOrDefault(product, -99);
    }
    public int stock(String product){
        return this.stok.getOrDefault(product, 0);
    }
    public boolean take(String product){
        if (this.stok.containsKey(product) && this.stok.get(product) > 0) {
            this.stok.put(product, this.stok.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }
    public Set<String> products(){
        Set daftar = new HashSet<>();
        for (String nama: this.harga.keySet()){
            daftar.add(nama);
        }
        return daftar;
    }
}
