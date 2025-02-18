/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Comparator;
public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card kartu1, Card kartu2){
        int jenisKartu = Integer.compare(kartu1.getSuit().ordinal(), kartu2.getSuit().ordinal());
        if (jenisKartu == 0){
            return Integer.compare(kartu1.getValue(), kartu2.getValue());
        }
        return jenisKartu;
    }
}
