
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String namaFile = "literacy.csv";
        List<Orang> daftarOrang = new ArrayList<>();
        List<String> bacaFile = bacaCsv(namaFile);
        bacaFile.stream()
                .map(sekarang -> sekarang.split(","))
                .map(next -> new Orang(benerinGender(next[2].trim()), next[3].trim(), Integer.valueOf(next[4].trim()), Double.valueOf(next[5].trim())))
                .forEach(Orang -> daftarOrang.add(Orang));
        
        daftarOrang.stream()
                .sorted((sekarang, nanti) -> {
                    return sekarang.compareTo(nanti);
                })
                .forEach(System.out::println);
    }
    public static List<String> bacaCsv(String sumber){
        List<String> daftar = new ArrayList<>();
        try {
            File file = new File(sumber);
            Scanner skaner = new Scanner(file);
            while (skaner.hasNextLine()){
                String baca = skaner.nextLine();
                daftar.add(baca);
            }
            skaner.close();
        } catch (FileNotFoundException e){
            System.out.println("Error" + e.getMessage());
        }
        return daftar;
    }
    public static String benerinGender(String jk){
        return jk.contains("female") ? "female" : "male";
    }
}