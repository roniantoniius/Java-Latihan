import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
public class Sort {
    public static void sortIntArray(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString((array)));
    }
    public static void sortStrArray(String[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sortIntArrList(ArrayList<Integer> integers){
        Collections.sort(integers);
        System.out.println(integers);
    }
    public static void sortStrArrList(ArrayList<String> strings){
        Collections.sort(strings);
        System.out.println(strings);
    }
}
