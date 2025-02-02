/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.HashMap;
import java.util.ArrayList;
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        return new ArrayList<>(this.storage.getOrDefault(storageUnit, new ArrayList<>()));
    }
    public void remove(String storageUnit, String item){
        ArrayList<String> lis = this.storage.get(storageUnit);
        if (lis!=null){
            lis.remove(item);
            if (lis.isEmpty()){
                this.storage.remove(storageUnit);
            }
        }
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> lis = new ArrayList<>();
        for (String keySet: this.storage.keySet()){
            ArrayList<String> items = this.storage.get(keySet);
            if (items != null && !items.isEmpty()){
                lis.add(keySet);
            }
        }
        
        return lis;
    }
}
