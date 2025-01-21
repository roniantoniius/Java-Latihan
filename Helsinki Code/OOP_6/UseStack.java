package OOP_6;

public class UseStack {
    public static void main(String[] args){
        Stack daftarList = new Stack();
        System.out.println(daftarList.isEmpty());
        System.out.println(daftarList.values());
        daftarList.add("Ro");
        daftarList.add("Ra");
        daftarList.add("Ru");
        System.out.println(daftarList.isEmpty());
        System.out.println(daftarList.values());

        String ambil = daftarList.take();

        daftarList.add("Re");
        daftarList.add("Wo");
        daftarList.add("Wa");
        daftarList.add("Wu");
        while (!daftarList.isEmpty()){
            System.out.println(daftarList.take());
        }
        System.out.println(ambil);
    }
}
