public class StarSign {
    public static void bintangPrint(int angka){
        System.out.println("*".repeat(angka));
    }

    public static void bintangKotak(int kotak){
        for (int i = 0; i < kotak; i++){
            System.out.println("*".repeat(kotak));
        }
    }

    public static void bintangPersegi(int panjang, int lebar){
        for (int i = 0; i < panjang; i++){
            System.out.println("*".repeat(lebar));
        }
    }

    public static void bintangSegitigaSikuSiku(int tinggi){
        for (int i = 0; i < tinggi; i++){
            System.out.println("*".repeat(tinggi - i));
        }
    }

    public static void bintangSegitigaTerbalik(int size){
        for (int i = size; i > 0; i--){
            System.out.print(" ".repeat(i));
            for (int j = 0; j < size - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void christmasTree(int size){
        for (int i = 1; i <= size; i++){
            for (int j = size - i; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= size - 1; i++){
            System.out.print(" ");
            for (int j = size - 3; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 2; k > 0; k--){
                System.out.print("| ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        // bintangPrint(4);
        // bintangPrint(7);

        // bintangKotak(7);

        // bintangPersegi(4, 9);

        // bintangSegitigaSikuSiku(5);

        christmasTree(5);
    }
}
