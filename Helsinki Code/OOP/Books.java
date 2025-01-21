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

    public String getJudul(){
        return this.judul;
    }

    public boolean equals(Object compare){
        if (this == compare){
            return true;
        }

        if (!(compare instanceof Books)){
            return false;
        }

        Books compareBooks = (Books) compare;

        return this.judul.equals(compareBooks.judul) && this.penulis.equals(compareBooks.penulis) && this.halaman == compareBooks.halaman && this.tahunTerbit == compareBooks.tahunTerbit;
    }

    public String toString(){
        return "Judul: " + this.judul + "\nPenulis: " + this.penulis + "\nHalaman: " + this.halaman + "\nTahun Terbit: " + this.tahunTerbit;
    }

}
