/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author ASUS
 */
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
public class Dictionary {
    private HashMap<String, String> kamus;
    private List<String> kunci;
    public Dictionary(){
        this.kamus = new HashMap<>();
        this.kunci = new ArrayList<>();
        add("sana", "word");
    }
    public String get(String word){
        return this.kamus.get(word);
    }
    public void add(String word, String translation){
        if (!this.kamus.containsKey(word)){
            this.kunci.add(word);
        }
        this.kamus.put(word, translation);
    }
    public String getRandomWord(){
        Random acak = new Random();
        return this.kunci.get(acak.nextInt(this.kunci.size()));
    }
}
