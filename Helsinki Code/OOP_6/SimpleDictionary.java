package OOP_6;
import java.util.ArrayList;
public class SimpleDictionary {
    private ArrayList<String> dictionary;
    private String kata;
    private String terjemahan;
    public SimpleDictionary() {
        this.dictionary = new ArrayList<>();
    }
    public void add(String kata, String terjemahan){
        this.kata = kata;
        this.terjemahan = terjemahan;
        this.dictionary.add(this.kata + " = " + this.terjemahan);
    }
    public String translate(String kata){
        for (String duaKat: this.dictionary){
            String[] daftarKata = duaKat.split(" = ");
            if (daftarKata[0].equals(kata)){
                return daftarKata[1];
            }
        }
        return "Kata " + kata + " tidak ditemukan";
    }
}
