/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class HashMap<K, V> {
    // Berisikan sebuah array dengan tipe data List yang berisi Object Pair key dan value
    
    // class variabel
    private List<Pair<K, V>>[] hashPeta;
    private int indeksSekarang;
    
    // constructor
    public HashMap(){
        this.hashPeta = new List[32];
        this.indeksSekarang = 0;
    }
    
    // method untuk mengambil nilai (value) pada suatu array berdasarkan key
    public V get(K kunci){
        
//      mencari indeks yang merupakan hashValue dari key (dari ini yang kita cari valuenya)
        int hashValue = Math.abs(kunci.hashCode() % this.hashPeta.length);
        if (this.hashPeta[hashValue] == null){
            return null;
        }
        // mengambil isi dari array hashPeta yang merupakan satu List berisi object Pair
        List<Pair<K, V>> nilaiPadaIndeks = this.hashPeta[hashValue];
        
        // perulangan untuk mencari value pada list object Pair
        for (int i = 0; i < nilaiPadaIndeks.size(); i++){
            if (nilaiPadaIndeks.value(i).getKey().equals(kunci)){
                return nilaiPadaIndeks.value(i).getValue();
            }
        }
        return null;
    }
    
    public List<Pair<K, V>> getListBasedOnKey(K kunci){
        int hashValue = Math.abs(kunci.hashCode() % this.hashPeta.length);
        if (this.hashPeta[hashValue] == null){
            return null;
        }
        // mengambil isi dari array hashPeta yang merupakan satu List berisi object Pair
        return this.hashPeta[hashValue];
    }
    
    public int getIndexOfKey(List<Pair<K, V>> listSebelum, K kunci){
        for (int i = 0; i < listSebelum.size(); i++){
            if (listSebelum.value(i).getKey().equals(kunci)){
                return i;
            }
        }
        return -1;
    }
    
    public void add(K kunci, V nilai){
//        int hashValue = Math.abs(kunci.hashCode() % this.hashPeta.length);
//        if (hashPeta[hashValue] == null){
//            hashPeta[hashValue] = new List<>();
//        }
        List<Pair<K, V>> nilaiPadaIndeks = getListBasedOnKey(kunci);
        int indeks = getIndexOfKey(nilaiPadaIndeks, kunci);
//        for (int i = 0; i < nilaiPadaIndeks.size(); i++){
//            if (nilaiPadaIndeks.value(i).getKey().equals(kunci)){
//                indeks = i;
//                break;
//            }
//        }
        if (indeks < 0){
            nilaiPadaIndeks.add(new Pair<>(kunci, nilai));
            this.indeksSekarang++;
        } else {
            nilaiPadaIndeks.value(indeks).setValue(nilai);
        }
        
        if (1.0 * this.indeksSekarang / this.hashPeta.length > 0.75){
            grow();
        }
    }
    private void grow(){
        List<Pair<K, V>>[] arrayBaru = new List[this.hashPeta.length * 2];
        for (int i = 0; i < this.hashPeta.length; i++){
            copy(arrayBaru, i);
        }
        this.hashPeta = arrayBaru;
    }
    private void copy(List<Pair<K, V>>[] arrayBaru, int dariIndeks){
        for (int i = 0; i < this.hashPeta[dariIndeks].size(); i++){
            Pair<K, V> nilaiSekarang = this.hashPeta[dariIndeks].value(i);
            
            // bikin hashValue untuk indeks baru di array baru, karena ingin growth kan
            int hashValue = Math.abs(nilaiSekarang.getKey().hashCode() % arrayBaru.length);
            if (arrayBaru[hashValue] == null){
                arrayBaru[hashValue] = new List<>();
            }
            arrayBaru[hashValue].add(nilaiSekarang);
        }
    }
    
    public V remove(K kunci){
        List<Pair<K, V>> nilaiPadaIndeks = getListBasedOnKey(kunci);
        if (nilaiPadaIndeks.size() == 0){
            return null;
        }
        int indeks = getIndexOfKey(nilaiPadaIndeks, kunci);
        if (indeks < 0){
            return null;
        }
        Pair<K, V> isi = nilaiPadaIndeks.value(indeks);
        nilaiPadaIndeks.remove(isi);
        return isi.getValue();
    }
}
