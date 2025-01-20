package OOP;

public class UseAparment {
    public static void main(String[] args){
        Aparment apart1 = new Aparment(2, 36, 1000000);
        Aparment apart2 = new Aparment(3, 45, 1500000);

        System.out.println("Apakah apartemen 1 lebih besar dari apartemen 2? " + apart1.largerThan(apart2));
        System.out.println("Selisih harga kedua apartemen adalah " + apart1.priceDifference(apart2));
        System.out.println("Apakah apartemen 1 lebih mahal dari apartemen 2? " + apart1.moreExpensive(apart2));
    }
}
