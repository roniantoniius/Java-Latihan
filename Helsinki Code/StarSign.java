public class StarSign {

    // method untuk menampilkan string bintang sebanyak input jumlah
    public static void bintangPrint(int angka){
        System.out.println("*".repeat(angka));
    }

    // method untuk menampilkan kumpulan bintang dalam bentuk kotak dengan perulangan yang dimulai dari 0 dengan print bintang sebanyak input kotak, jadi perulangannya cuman untuk space
    public static void bintangKotak(int kotak){
        for (int i = 0; i < kotak; i++){
            System.out.println("*".repeat(kotak));
        }
    }

    // method untuk menampilkan bintang dalam persegi panjang, jadi perulangan untuk bikin space kosong untuk tempat bintang, nah nanti yang diprint itu sebanyak panjang dan bintangnya adalah lebar
    public static void bintangPersegi(int panjang, int lebar){
        for (int i = 0; i < panjang; i++){
            System.out.println("*".repeat(lebar));
        }
    }

    // methon untuk bintang segitiga siku-siku, jadi perulangan untuk buat space kosong dengan batas tinggi dari segitiga yang merupakan space kosong, nah nanti yang diprint itu bintang sebanyak tinggi - i (space kosong) karena bintangnya akan bertambah sedikit demi sedikit. Jadi for loop pakai println untuk enter kebawah sebanyak i kali.
    public static void bintangSegitigaSikuSiku(int tinggi){
        for (int i = 0; i < tinggi; i++){
            System.out.println("*".repeat(tinggi - i));
        }
    }

    // method untuk bikin bintang siku-siku tapi terbalik, caranya perulangan untuk space kosong ke bawah tapi sebanyak i (jumlah baris segitiga bintangnya) dan selagi itu kita print (bukan ln) space (" ") sebanyak i kali. Lalu ada perulangan baru setelah print space (" ") yaitu perulangan yang dimulai dari 0 sampai dengan selisih dari tinggi segitiga dengan i (Saat ini) dan kita print bintangnya sekali aja. Jadi bintangnya akan bertambah sedikit demi sedikit. Setelah perulangan satu baris bintang selesai atau sebelum nilai i berganti itu kita cetak baris bari dengan println.
    public static void bintangSegitigaTerbalik(int size){
        for (int i = size; i > 0; i--){
            System.out.print(" ".repeat(i));
            for (int j = 0; j < size - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // method untuk bikin pohon natal dan batangnya.
    // 1. Untuk perulangan pertama tentang pembuatan pohon natalnya, jadi ada perulangan untuk membuat space kosong yang dimulai dari 1 dengan batasan lebih kecil sama dengan size yang dimasukkan, jadi perulangannya akan berhenti saat i = size. Lalu ada perulangan didalamnya untuk print space (" ") sebanyak size - i (space kosong saat ini) dengan batasan lebih besar dari 0 dan nilai space akan berkurang satu per satu, karena semakin banyak bintang ke bawahnya, berarti untuk perulangan pertama itu akan ada empat space kosong dan satu bintang. Selanjutnya ada perulangan untuk print bintang ("*") yang dimulai dari 1 dengan batasan lebih kecil sama dengan i (space kosong) dan nilai bintang akan bertambah satu.

    // 2. Untuk batang pohonnya, jadi ada perulangan untuk membuat space kosong yang dimulai dari 1 dengan batasan lebih kecil sama dengan size - 1, jadi perulangannya akan berhenti saat i = size - 1. Lalu ada perulangan didalamnya untuk print space (" ") sebanyak size - 3 (space kosong saat ini) dengan batasan lebih besar dari 0 dan nilai space akan berkurang satu per satu, karena semakin banyak bintang ke bawahnya, berarti untuk perulangan pertama itu akan ada empat space. Selanjutnya ada perulangan untuk print bintang ("|") yang dimulai dari 1 dengan batasan lebih kecil sama dengan 2 (bintang batang pohon) dan nilai bintang akan bertambah satu.
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
