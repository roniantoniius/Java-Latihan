package OOP;
import java.util.ArrayList;
public class UseBirdList {
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<Bird>();
        birds.add(new Bird("Merpati"));
        Bird merak = new Bird("Merak");
        birds.add(new Bird("Merpati"));
        birds.add(new Bird("Burung Hantu"));

        if (birds.contains(merak)){
            System.out.println("Merak ada di dalam list");
        } else {
            System.out.println("Merak tidak ada di dalam list");
        }
        for (Bird bird : birds){
            System.out.println(bird);
        }

        System.out.println();

        birds.add(merak);
        if (birds.contains(merak)){
            System.out.println("Merak ada di dalam list");
        } else {
            System.out.println("Merak tidak ada di dalam list");
        }
    }
}
