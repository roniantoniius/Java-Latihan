package OOP;

public class Books {
    private String judul;
    private int halaman;
    private int tahunTerbit;

    public Books(String judul, int halaman, int tahunTerbit){
        this.judul = judul;
        this.halaman = halaman;
        this.tahunTerbit = tahunTerbit;
    }

    public String toString(){
        return this.judul + " - " + this.halaman + " halaman - " + this.tahunTerbit;
    }

    public String getJudul(){
        return this.judul;
    }
}
