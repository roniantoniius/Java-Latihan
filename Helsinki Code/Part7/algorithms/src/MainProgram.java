import java.util.Arrays;

public class MainProgram {
    public static int smallestCuy(int[] array, int mulai){
        // mencari indeks dari nilai terkecil dalam array
        // [1,4,5,2,3], misal mulai ada di indeks 1 (4).
        int palingKecil = mulai;
        for (int i = mulai; i < array.length; i++){
            if (array[palingKecil] > array[i]){
                palingKecil = i;
            }
        }
        return palingKecil;
    }
    public static void swap(int[] array, int indeks1, int indeks2){
        int temp = array[indeks1];
        array[indeks1] = array[indeks2];
        array[indeks2] = temp;
    }
    public static void urut(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            System.out.println("Percobaan ke-" + i + " :");
            int kecil = smallestCuy(array, i);
            swap(array, i, kecil);
            System.out.println(Arrays.toString(array));
        }
    }
}
