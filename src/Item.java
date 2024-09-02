public class Item {
    private String nama_produk;
    private int kuantitas;

    public Item(String nama_produk, int kuantitas) {
        this.nama_produk = nama_produk;
        this.kuantitas = kuantitas;
    }

    // method getter
    public String getName() {
        return nama_produk;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    @Override
    public String toString() {
        return "Item: " + getName() + ", Kuantitas: " + getKuantitas();
    }
}
