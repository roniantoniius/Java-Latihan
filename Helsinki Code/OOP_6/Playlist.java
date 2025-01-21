package OOP_6;
import java.util.ArrayList;
public class Playlist {
    private ArrayList<String> laguLagu;

    public Playlist(){
        this.laguLagu = new ArrayList<>();
    }

    public void tambahLagu(String lagu){
        this.laguLagu.add(lagu);
    }

    public void hapusLagu(String lagu){
        this.laguLagu.remove(lagu);
    }

    public void printLagu(){
        for (String lagu: this.laguLagu){
            System.out.println(lagu);
        }
    }
}