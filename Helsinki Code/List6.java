import java.util.ArrayList;

public class List6 {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        System.out.println("Is the first found? " + list.contains("First")); // contains memeriksa apakah mengandung, dengan output Boolean
        
        boolean found = list.contains("Second");
        if (found) {
            System.out.println("Second was found");
        }
        
        // or more simply
        if (list.contains("Second")) {
            System.out.println("Second can still be found");
        }
    }
}
