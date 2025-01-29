import java.util.ArrayList;

public class StatisticPoint {
    private ArrayList<Integer> daftarNilai;
    private ArrayList<Integer> nilai;
    public StatisticPoint(){
        this.daftarNilai = new ArrayList<>();
        this.nilai = new ArrayList<>();
    }
    public void add(int nilai){
        this.daftarNilai.add(pointToGrade(nilai));
        this.nilai.add(nilai);
    }
    public int pointToGrade(int nilai){
        int grade = 0;
        if (nilai < 50){
            grade = 0;
        } else if (nilai < 60){
            grade = 1;
        } else if (nilai < 70){
            grade = 2;
        } else if (nilai < 80){
            grade = 3;
        } else if (nilai < 90){
            grade = 4;
        } else if (nilai <= 100){
            grade = 5;
        } else {
            grade = 0;
        }
        return grade;
    }
    public int jumlahGrade(int grade){
        int count = 0;
        for (int i: this.daftarNilai){
            if (i == grade){
                count++;
            }
        }
        return count;
    }
    public int average(){
        int sum = 0;
        if (this.nilai.isEmpty()){
            return 0;
        }
        for (int nilai : this.nilai) {
            sum += nilai; // Menambahkan setiap nilai ke sum
        }
        return sum / this.nilai.size();
    }
    public String toString(){
        return "Nilai " + this.nilai;
    }
    public int passing(int pass){
        int count = 0;
        if (this.nilai.isEmpty()){
            return 0;
        }
        for (int nilai: this.nilai){
            if (nilai >= pass){
                count++;
            }
        }
        return 100 * count / this.nilai.size();
    }
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
