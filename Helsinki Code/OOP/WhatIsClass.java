package OOP;

public class WhatIsClass { // ini adalah class utama
    public static void printNeatly(int[] daftar){ //
        for (int i = 0; i < daftar.length; i++){ // ini adalah method yaitu perintah dari class printNeatly
            System.out.print(daftar[i] + ", ");
        }
    }

    public static void main(String[] args){
        int[] daftarAngka = {23, 34, 325, 12};
        printNeatly((daftarAngka));
    }
}
