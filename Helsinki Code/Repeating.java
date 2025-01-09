public class Repeating {
    public static void main(String[] args){
        int percobaan = 0;
        int jumlah = 0;
        while (percobaan <= 2000) {
            System.out.println(jumlah);
            jumlah++;
            System.out.println(jumlah);
            percobaan++;
        }
    }
}