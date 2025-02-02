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

public class VehicleRegistry {
    // Hanya ada satu instance variable, bersifat private.
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }
    
    // Jika plate belum terdaftar, masukkan data dan return true, jika sudah return false.
    public boolean add(LicensePlate plate, String owner){
        if (this.registry.containsKey(plate)) {
            return false;
        }
        this.registry.put(plate, owner);
        return true;
    }
    
    // Mengembalikan owner yang terdaftar pada plate (secara otomatis null jika tidak ada).
    public String get(LicensePlate plate){
        return this.registry.get(plate);
    }
    
    // Jika plate ditemukan, hapus dan kembalikan true, jika tidak ditemukan return false.
    public boolean remove(LicensePlate plate){
        if (this.registry.containsKey(plate)) {
            this.registry.remove(plate);
            return true;
        }
        return false;
    }
    
    // Method yang mencetak informasi license plate (tanpa nama owner)
    public void printLicensePlates(){
        for (LicensePlate plate : this.registry.keySet()){
            System.out.println(plate);
        }
    }
    
    // Method yang mencetak owner (tanpa mencetak duplikat)
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : this.registry.values()){
            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }
        for (String owner : owners){
            System.out.println(owner);
        }
    }
}