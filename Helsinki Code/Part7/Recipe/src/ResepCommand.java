import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ResepCommand {
    public static void findName(ArrayList<Resep> resep, String cari){
        for (Resep reseps: resep){
            if (reseps.getNamaResep().equals(cari)){
                System.out.println(reseps);
            }
        }
    }
    public static void findWaktu(ArrayList<Resep> resep, int waktu){
        // 1. Convert lamaMasak jadi ArrayList dan memiliki info index dan valuenya
        // 2. Sort integer tersebut
        // 3. findd dengan binary search
        ArrayList<Pair> daftar = new ArrayList<>();
        for (int i = 0; i < resep.size(); i++){
            daftar.add(new Pair(i, resep.get(i).getLamaMasak()));
        }
        daftar.sort(Comparator.comparingInt(Pair::getValue));
        int index = binarySearch(daftar, waktu);
        if (index != -1){
            System.out.println("Resep dengan waktu " + waktu + " menit telah ditemukan!");
            System.out.println(resep.get(daftar.get(index).getIndex()));
        } else {
            System.out.println("Tidak ada resep makanan dengan lama masak " + waktu + " menit.");
        }

    }
    public static int binarySearch(ArrayList<Pair> pairs, int target){
        int begin = 0;
        int end = pairs.size() - 1;
        while (begin <= end){
            int tengah = begin + (end - begin) / 2;
            if (pairs.get(tengah).getValue() == target){
                return tengah;
            } else if (pairs.get(tengah).getValue() < target){
                begin = tengah + 1;
            } else {
                end = tengah - 1;
            }
        }
        return -1;
    }
    public static ArrayList<Integer> findBahan(ArrayList<Resep> resep, String bahanBahan) {
        ArrayList<Integer> hasil = new ArrayList<>(); // List untuk menyimpan semua indeks yang cocok

        for (int j = 0; j < resep.size(); j++) {
            if (resep.get(j).getBahanBahan().contains(bahanBahan)) {
                hasil.add(j); // Tambahkan indeks resep ke dalam hasil
            }
        }

        return hasil; // Mengembalikan daftar indeks yang mengandung bahan
    }
}
