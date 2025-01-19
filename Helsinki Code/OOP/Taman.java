package OOP;

public class Taman {
    private String nama;
    private int minimalTinggi;
    private int pengunjung;

    public Taman(String nama, int minimalTinggi){
        this.nama = nama;
        this.minimalTinggi = minimalTinggi;
        this.pengunjung = 0;
    }

    public boolean cekPengunjung(Person person){
        if (person.getHeight() <= this.minimalTinggi){
            this.pengunjung += 1;
            return false;
        }
        return true;
    }

    public String toString(){
        return "Taman " + this.nama + " memiliki " + this.pengunjung + " pengunjung, dengan minimal tinggi " + this.minimalTinggi + " cm";
    }
}
