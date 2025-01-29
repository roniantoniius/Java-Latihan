import java.util.ArrayList;

public class BirdMethod {
    public static void observasi(ArrayList<BirdWatcher> burung, String burungs, int obs){
        for (BirdWatcher daftarBurung: burung){
            if (daftarBurung.getName().equals(burungs)){
                daftarBurung.observasi(obs);
            }
        }
    }
    public static void findName(ArrayList<BirdWatcher> burung, String name){
        for (BirdWatcher daftarBurung: burung){
            if (daftarBurung.getName().equals(name)){
                System.out.println(daftarBurung);
            }
        }
    }
}
