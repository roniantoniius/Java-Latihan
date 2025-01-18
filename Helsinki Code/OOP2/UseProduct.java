package OOP2;
import java.util.ArrayList;
public class UseProduct {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Buku"));
        products.add(new Product("Pensil", "drawer"));
        products.add(new Product("Penghapus", 4));

        for (Product produk: products){
            System.out.println(produk + ", ");
        }
    }
}
