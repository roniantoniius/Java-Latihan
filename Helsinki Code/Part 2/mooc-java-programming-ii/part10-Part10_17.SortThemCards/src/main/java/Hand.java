/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class Hand implements Comparable<Hand> {
    private List<Card> tangan;
    public Hand(){
        this.tangan = new ArrayList<>();
    }
    public void add(Card card){
        this.tangan.add(card);
    }
    public int jumlahIn(){
        int jumlah = 0;
        for (Card kartu: this.tangan){
            jumlah += kartu.getValue();
        }
        return jumlah;
    }
    public void print(){
        Iterator<Card> iterator = tangan.iterator();
        while (iterator.hasNext()){
            Card kartu = iterator.next();
            System.out.println(kartu);
        }
    }
    public void sort(){
        this.tangan.stream()
                .sorted((sekarang, nanti) -> {
                    return sekarang.compareTo(nanti);
                })
                .forEach(System.out::println);
    }
    
    public void sortBySuit(){
        Collections.sort(this.tangan, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand tanganOrang) {
        int jumlahSekarang = jumlahIn();
        int jumlahNanti = tanganOrang.jumlahIn();
        return jumlahSekarang - jumlahNanti;
    }
}
