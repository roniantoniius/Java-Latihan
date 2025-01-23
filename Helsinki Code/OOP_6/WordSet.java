package OOP_6;
import java.util.ArrayList;
public class WordSet {
    private ArrayList<String> words;
    public WordSet() {
        this.words = new ArrayList<>();
    }
    public void add(String word){
        this.words.add(word);
    }
    public boolean contains(String word){
        return this.words.contains(word);
    }
    // palindrome method ini mencari jumlah kata yang isinya sama dari depan dan belakang (riri, kakak)
    public int palindrome(){
        int hitung = 0;
        for (String kata: this.words){
            if (isPalindrome(kata)){
                hitung++;
            }
        }
        return hitung;
    }
    public boolean isPalindrome(String kataKata){
        int akhir = kataKata.length() - 1;
        int i = 0;
        while (i < kataKata.length() / 2){
            if (kataKata.charAt(i) != kataKata.charAt(akhir - 1)){
                return false;
            }
            i++;
        }
        return true;
    }
}
