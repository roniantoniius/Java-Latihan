
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> daftarName = new HashMap<>();
        daftarName.put("matthew's", "matt");
        daftarName.put("michael's", "mix");
        daftarName.put("arthur's", "artie");
        System.out.println(daftarName.get("matthew's"));
    }

}
