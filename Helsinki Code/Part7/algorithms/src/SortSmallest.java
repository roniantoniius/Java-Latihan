import java.util.Arrays;

public interface SortSmallest {
    static void main(String[] args){
        int[] angka = {41, 32, 13, 46, 23, 11, 31, 80, 42, 18, 20, 5};
        System.out.println("Array sebelum diurut yaitu: ");
        System.out.print(Arrays.toString(angka));
        System.out.println();
        MainProgram.urut(angka);
        System.out.println();
        if (Periksa.periksaYu(angka)){
            System.out.println("Algoritma sorting baik");
        } else {
            System.out.println("Sayang sekali algoritma belum baik");
        }
    }
}
