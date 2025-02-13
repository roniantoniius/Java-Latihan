
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.println("Masukkan file dengan akhiran .txt");
        String namaFile = scanner.nextLine();
        List<Book> hasil = readBooks(namaFile);
        if (hasil.isEmpty()) {
            System.out.println("File tidak ditemukan atau kosong.");
        } else {
            System.out.println("Isi file:");
            hasil.forEach(System.out::println);
        }
    }
    public static List<Book> readBooks(String file){
        List<Book> lemari = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(baris -> baris.split(","))
                    .filter(panjang -> panjang.length >= 4)
                    .map(buku -> new Book(buku[0], Integer.valueOf(buku[1]), Integer.valueOf(buku[2]), buku[3]))
                    .forEach(bukus -> lemari.add(bukus));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lemari;
    }

}
