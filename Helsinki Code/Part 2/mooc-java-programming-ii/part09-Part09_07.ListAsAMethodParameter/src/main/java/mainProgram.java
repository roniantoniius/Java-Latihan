
import java.util.List;
import java.util.ArrayList;
public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> names = new ArrayList<>();
        names.add("Ron");
        names.add("iAnto");
        names.add("nius");
        System.out.println(returnSize(names));
    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List<String> daftar){
        return daftar.size();
    }
}
