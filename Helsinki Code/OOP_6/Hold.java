package OOP_6;
import java.util.ArrayList;
public class Hold {
    private int maksBobot;
    private int bobotSekarang;
    private ArrayList<Suitcase> koper;
    public Hold(int maksBobot){
        this.maksBobot = maksBobot;
        this.koper = new ArrayList<>();
        this.bobotSekarang = 0;
    }
    public void addSuitcase (Suitcase suitcase){
        this.koper.add(suitcase);
        this.bobotSekarang += suitcase.totalWeight();
        if (this.bobotSekarang > this.maksBobot){
            this.bobotSekarang -= suitcase.totalWeight();
        }
    }
    public String printItems(){
        String teks = "";
        for (Suitcase kotak: this.koper){
            teks = kotak + "\n";
        }
        return teks;
    }
    public String toString(){
        return this.koper.size() + " suitcases with " + this.bobotSekarang + " kg.";
    }
}
