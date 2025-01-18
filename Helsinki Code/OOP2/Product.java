package OOP2;

public class Product {
    private String nama;
    private String lokasi;
    private int berat;

    public Product(String nama, String lokasi, int berat){ // constructor
        this.nama = nama;
        this.lokasi = lokasi;
        this.berat = berat;
    }

    public Product(String nama){
        this(nama, "shelf", 1);
    }

    public Product(String nama, String lokasi){
        this(nama, lokasi, 1);
    }

    public Product(String nama, int berat){
        this(nama, "shelf", berat);
    }

    @Override
    public String toString(){ // method untuk print
        return nama + "(" + berat + " kg) dapat ditemukan pada " + lokasi;
    }
}
