import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        System.out.println("Masukkan file dengan akhiran .txt");
        String file = scanner.nextLine();
        List<String> hasil = read(file);
        
        // Menampilkan hasil
        if (hasil.isEmpty()) {
            System.out.println("File tidak ditemukan atau kosong.");
        } else {
            System.out.println("Isi file:");
            hasil.forEach(System.out::println);
        }
    }

    public static List<String> read(String file) {
        List<String> yaho = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .forEach(baris -> yaho.add(baris));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return yaho;
    }
}