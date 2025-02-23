/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Pair<K, V> {
    private K kunci;
    private V nilai;
    public Pair(K key, V value){
        this.kunci = key;
        this.nilai = value;
    }
    public K getKey(){
        return this.kunci;
    }
    public V getValue(){
        return this.nilai;
    }
    public void setValue(V nilai){
        this.nilai = nilai;
    }
}
