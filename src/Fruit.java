// Fruit is a sub class of Item (super class)
public class Fruit extends Item {
    private String type;
    
    public Fruit(String type, String nama_produk, int kuantitas) {
        super(nama_produk, kuantitas);
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override
    public String toString() {
        return "Fruit: " + getName() + ", Kuantitas: " + getKuantitas() + ", Type: " + getType();
    }
}
