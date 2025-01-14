package OOP;

public class UseGauge {
    public static void main(String[] args){
        Gauge gauge = new Gauge();

        while(!gauge.full()){
            System.out.println("Amunisi masih belum penuh dengan nilai " + gauge.value());
            gauge.increase();
        }

        System.out.println("Amunisi sudah penuh dengan nilai " + gauge.value());
        gauge.decrease();
        System.out.println("Amunisi dikurangi sehingga menjadi " + gauge.value());
    }
}
