package OOP_6;

public class UseMenu {
    public static void main(String[] args){
        Menu daftarMenu = new Menu();
        daftarMenu.tambahMenu("Nasi Goreng");
        daftarMenu.tambahMenu("Mie Goreng");
        daftarMenu.printMenu();
        daftarMenu.hapusMenu();

        daftarMenu.tambahMenu("Nasi Goreng Katsu");
        daftarMenu.printMenu();
    }
}
