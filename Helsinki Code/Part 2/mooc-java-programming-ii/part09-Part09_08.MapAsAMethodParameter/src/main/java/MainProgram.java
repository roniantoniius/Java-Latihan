
import java.util.HashMap;
import java.util.Map;
public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String, String> namaNama = new HashMap<>();
        namaNama.put("Depan", "Roni");
        namaNama.put("Tengah", "Antonius");
        namaNama.put("Akhir", "Sinabutar");
        System.out.println(returnSize(namaNama)); 
        for (String nama: namaNama.keySet()){
            System.out.println(nama + ": " + namaNama.get(nama));
        }
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map daftar){
        return daftar.size();
    }
}
