package OOP_6;
import java.util.ArrayList;
public class Menu {
    private ArrayList<String> menuMenu;

    public Menu(){
        this.menuMenu = new ArrayList<>();
    }

    public void tambahMenu(String menu){
        if (this.menuMenu.contains(menu)){
            System.out.println("Menu sudah ada");
        } else {
            menuMenu.add(menu);
            System.out.println("Menu berhasil ditambahkan");
        }
    }

    public void printMenu(){
        for (String menu: menuMenu){
            System.out.println(menu);;
        }
    }

    public void hapusMenu(){
        this.menuMenu.clear();
        System.out.println("Semua menu berhasil dihapus");
    }
}
