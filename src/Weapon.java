public class Weapon extends Item {
    private int damage;
    private String type;

    public Weapon(String type, String nama_produk, int kuantitas, int damage) {
        super(nama_produk, kuantitas);
        this.damage = damage;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Weapon: " + getName() + ", Kuantitas: " + getKuantitas() + ", Damage: " + getDamage() + ", Type: " + getType();
    }
    
}
