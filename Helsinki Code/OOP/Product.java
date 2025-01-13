package OOP;

public class Product {
    private Double harga;
    private String namaProduk;
    private int kuantitas;

    public Product(String initialNama, Double initialHarga, int initialKuantitas){
        this.harga = initialHarga;
        this.namaProduk = initialNama;
        this.kuantitas = initialKuantitas;
    }

    public void cetakProduk(){
        System.out.println("Produk " + this.namaProduk + " seharga " + this.harga + " dengan kuantitas " + this.kuantitas);
    }
}
