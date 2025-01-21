package OOP_6;
import java.util.ArrayList;
public class Package {
    private ArrayList<Gift> daftarGift;
    public Package(){
        this.daftarGift = new ArrayList<>();
    }
    public void addGift(Gift gift){
        this.daftarGift.add(gift);
    }
    public int totalWeight(){
        int total = 0;
        for (Gift hadiah: this.daftarGift){
            total += hadiah.getWeight();
        }
        return total;
    }
    public String toString(){
        if (daftarGift.isEmpty()){
            return "Tidak ada hadiah di misteri box ini :(";
        }

        String daftarHadiah = "";
        for(Gift hadiah2: this.daftarGift){
            daftarHadiah += hadiah2.getName() + "\n";
        }

        return "Misteri box ini punya beberapa hadiah lhoo: " + daftarHadiah;
    }
}
