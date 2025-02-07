import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Set<String> names = new HashSet<>();
        names.add("Ron");
        names.add("dsa");
        names.add("DEES");
        
        System.out.println(returnSize(names));
    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    public static int returnSize(Set daftar){
        return daftar.size();
    }

}
