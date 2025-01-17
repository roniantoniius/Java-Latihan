package OOP;

public class Books {
    private String judul;
    private String penulis;
    private int halaman;
    private int tahunTerbit;

    public Books(String judul, String penulis, int halaman, int tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.halaman = halaman;
        this.tahunTerbit = tahunTerbit;
    }

    public String toString(){
        return "Judul: " + this.judul + "\nPenulis: " + this.penulis + "\nHalaman: " + this.halaman + "\nTahun Terbit: " + this.tahunTerbit;
    }

    public String getJudul(){
        return this.judul;
    }
}
