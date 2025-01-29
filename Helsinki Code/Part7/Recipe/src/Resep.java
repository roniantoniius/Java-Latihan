import java.util.ArrayList;
public class Resep {
    private String namaResep;
    private int lamaMasak;
    private ArrayList<String> bahanBahan;

    public Resep(String namaResep, int lamaMasak, ArrayList<String> bahanBahan){
        this.namaResep = namaResep;
        this.lamaMasak = lamaMasak;
        this.bahanBahan = bahanBahan;
    }

    public String getNamaResep(){
        return this.namaResep;
    }

    public int getLamaMasak(){
        return this.lamaMasak;
    }

    public ArrayList<String> getBahanBahan(){
        return this.bahanBahan;
    }

    @Override
    public String toString(){
        return "Resep: {\n" +
                "'namaMakan': '" + namaResep + "',\n" +
                "'lamaMasak': " + lamaMasak + ", \n" +
                "'bahanBahan': " + bahanBahan +
                "}";
    }
}
