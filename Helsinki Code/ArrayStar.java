public class ArrayStar {
    public static void printStar(int[] bintang){
        for (int i = 0; i < bintang.length; i++){
            for (int j = 0; j < bintang[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[] jumlahBintang = {5, 4, 3, 2, 1, 0};
        printStar(jumlahBintang);
    }
}
