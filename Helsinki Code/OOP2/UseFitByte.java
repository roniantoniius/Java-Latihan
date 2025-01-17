package OOP2;

public class UseFitByte {
    public static void main(String[] args){
        FitByte asisten = new FitByte(30, 60);
        double persen = 0.5;

        while (persen < 1.0){
            double hasil = asisten.targetHeartRate(persen);
            System.out.println("Target heart rate at " + (persen * 100) + "% of your maximum is " + hasil);
            persen += 0.1;
        }
    }
}
