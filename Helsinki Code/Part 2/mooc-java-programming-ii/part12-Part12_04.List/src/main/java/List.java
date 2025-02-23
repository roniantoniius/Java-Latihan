/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class List<T> {
    private T[] daftar;
    private int indeksTambah;
    public List(){
        this.daftar = (T[]) new Object[10];
        this.indeksTambah = 0;
    }
    public void add(T nilai){
        if (this.indeksTambah == this.daftar.length){
            grow();
        }
        this.daftar[this.indeksTambah] = nilai;
        this.indeksTambah++;
    }
    public void grow(){
        int tambahIndeks = this.daftar.length + this.daftar.length / 2;
        T[] baru = (T[]) new Object[tambahIndeks];
        for (int i = 0; i < this.daftar.length; i++){
            baru[i] = this.daftar[i];
        }
        this.daftar = baru;
    }
    public boolean contains(T nilai){
        return indexOfValue(nilai) >= 0;
    }
    public int indexOfValue(T nilai){
        for (int i = 0; i < this.indeksTambah; i++){
            if (this.daftar[i].equals(nilai)){
                return i;
            }
        }
        return -1;
    }
    public void moveToTheLeft(int indeksHapus){
        for (int i = indeksHapus; i < this.indeksTambah; i++){
            this.daftar[i] = this.daftar[i + 1];
        }
    }
    public void remove(T nilai){
        int indeksHapus = indexOfValue(nilai);
        if (indeksHapus < 0){
            return;
        }
        moveToTheLeft(indeksHapus);
        this.indeksTambah--; // hapus satu yang belakang
    }
    public T value(int indeks){
        if (indeks < 0 || indeks >= this.indeksTambah){
            throw new ArrayIndexOutOfBoundsException("Index " + indeks + " outside of [0, " + this.indeksTambah + "]");
        }
        return this.daftar[indeks];
    }
    public int size(){
        return this.indeksTambah;
    }
}
