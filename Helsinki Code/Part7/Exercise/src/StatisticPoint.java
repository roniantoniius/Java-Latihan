import java.util.ArrayList;

public class StatisticPoint {
    private ArrayList<Integer> daftarNilai;
    private int nilai;
    public StatisticPoint(){
        this.daftarNilai = new ArrayList<>();
        this.nilai = 0;
    }
    public void add(int nilai){
        this.daftarNilai.add(nilai);
    }
    public int getNilai(){
        return this.nilai;
    }
    public int average(){
        int sum = 0;
        for (int i=0; i < this.daftarNilai.size(); i++){
            sum += this.daftarNilai.get(getNilai());
        }
        return sum / this.daftarNilai.size();
    }
    public String toString(){
        return "Nilai " + this.nilai;
    }
    public void print(){
        for (int value: this.daftarNilai){
            System.out.println(value);
        }
    }
}
