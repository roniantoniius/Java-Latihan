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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> diction;
    public DictionaryOfManyTranslations(){
        this.diction = new HashMap<>();
    }
    public void add(String user, String translation){
        this.diction.putIfAbsent(user, new ArrayList<>());
        this.diction.get(user).add(translation);
    }
    public ArrayList<String> translate(String word) {
        return new ArrayList<>(this.diction.getOrDefault(word, new ArrayList<>()));
    }
    public void remove(String word){
        this.diction.remove(word);
    }
}
