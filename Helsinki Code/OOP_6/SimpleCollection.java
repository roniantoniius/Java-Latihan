package OOP_6;
import java.util.ArrayList;
public class SimpleCollection {
    private String teks;
    private ArrayList<String> daftarTeks;

    public SimpleCollection(){
        this.daftarTeks = new ArrayList<>();
    }

    public void add(String teks){
        this.daftarTeks.add(teks);
    }

    public String getTeks(){
        return this.teks;
    }

    public String longest(){
        if (this.daftarTeks.isEmpty()){
            return null;
        }

        String awal = this.daftarTeks.get(0);
        for (String daftar: daftarTeks){
            if (awal.length() < daftar.length()){
                awal = daftar;
            }
        }

        return awal;
    }
}
