// file to read the longest string in Object List
package OOP_6;

public class UseSimpleCollection {
    public static void main(String[] args){
        SimpleCollection kumpulanTeks = new SimpleCollection();
        kumpulanTeks.add("Roni");
        kumpulanTeks.add("Yulisasda");
        kumpulanTeks.add("Lagi dengerin musik laufey");
        kumpulanTeks.add("ada udang dibalik sepatumu");
        kumpulanTeks.add("Skripsi cape banget woi!!");

        System.out.println("Teks yang paling panjang dari setiap teks yang kamu masukkan adalah: '" + kumpulanTeks.longest() + "'.");
    }
}
