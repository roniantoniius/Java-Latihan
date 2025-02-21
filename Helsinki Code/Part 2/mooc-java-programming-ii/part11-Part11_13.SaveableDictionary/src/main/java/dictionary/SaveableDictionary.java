/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author ASUS
 */
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
public class SaveableDictionary {
    private HashMap<String, String> kamus;
    private HashMap<String, String> kamusTerbalik;
    private String file;
    public SaveableDictionary(String file){
        this.file = file;
        this.kamus = new HashMap<>();
        this.kamusTerbalik = new HashMap<>();
    }
    public SaveableDictionary(){
        this.file = null;
        this.kamus = new HashMap<>();
        this.kamusTerbalik = new HashMap<>();
    }
    public String ambilFile(){
        return this.file;
    }
    public boolean load(){
        try (Scanner reader = new Scanner(Paths.get(ambilFile()))) {
            while (reader.hasNextLine()) {
                String content = reader.nextLine();
                String[] parts = content.split(":");
                this.add(parts[0].trim(), parts[1].trim());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    public void add(String words, String translation){
        this.kamus.putIfAbsent(words, translation);
        this.kamusTerbalik.putIfAbsent(translation, words);
    }
    public String translate(String word){
        if (this.kamus.getOrDefault(word, null) == null){
            return this.kamusTerbalik.getOrDefault(word, null);
        }
        return this.kamus.getOrDefault(word, null);
    }
    public void delete(String word){
        if (this.kamus.containsKey(word)){
            this.kamusTerbalik.remove(this.kamus.get(word));
            this.kamus.remove(word);
        }
        if (this.kamusTerbalik.containsKey(word)){
            this.kamus.remove(this.kamusTerbalik.get(word));
            this.kamusTerbalik.remove(word);
        }
    }
    public boolean save(){
        try {
            PrintWriter tulis = new PrintWriter(ambilFile());
            for (String kata: this.kamus.keySet()){
                tulis.println(kata + ":" + this.kamus.get(kata));
            }
            tulis.close();
            return true;
        } catch (Exception e){
            System.out.println("Error: " + e);
            return false;
        }
    }
}
