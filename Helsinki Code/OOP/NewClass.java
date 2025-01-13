package OOP;

public class NewClass {
    public static void main(String[] args){
        Person orangKe1 = new Person("Roni");
        Person orangKe2 = new Person("mamah");
        Person orangKe3 = new Person("Bapa");
        Person orangKe4 = new Person("Zipan");
        Person orangKe5 = new Person("Klara");
        Person orangKe6 = new Person("Abang");
        Whistle suaraBulbul = new Whistle("Nyaa nyaa!");
        Door pintu = new Door();
        Product belanja1 = new Product("Beras", 10000.0, 2);
        Product belanja2 = new Product("Gula", 5000.0, 3);
        Product belanja3 = new Product("Minyak", 15000.0, 1);

        orangKe1.printOrang();
        System.out.println("");
        orangKe1.makinTua();
        orangKe1.makinTua();
        orangKe1.ambilUmur();
        orangKe1.printOrang();
        orangKe2.printOrang();
        orangKe3.printOrang();
        orangKe4.printOrang();
        orangKe5.printOrang();
        orangKe6.printOrang();
        suaraBulbul.suaraApa();
        pintu.ketukPintu();
        belanja1.cetakProduk();
        belanja2.cetakProduk();
        belanja3.cetakProduk();
    }
}
