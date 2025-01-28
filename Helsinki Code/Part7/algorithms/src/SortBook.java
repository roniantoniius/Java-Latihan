import java.util.ArrayList;
public class SortBook {
    private ArrayList<Book> books;
    public SortBook(){
        this.books = new ArrayList<>();
    }
    public void add(int id, String name){
        books.add(new Book(id, name));
    }
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }
    public void sortById() {
        // Simple Bubble Sort to sort books by id
        for (int i = 0; i < books.size() - 1; i++) {
            for (int j = 0; j < books.size() - 1 - i; j++) {
                if (books.get(j).getId() > books.get(j + 1).getId()) {
                    // Swap books[j] and books[j + 1]
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
    }
    public void printBooks(){
        for (Book book: this.books){
            System.out.println(book);
        }
    }
    public ArrayList<Book> getBooks(){
        return this.books;
    }
    public static int binarySearch(ArrayList<Book> books, int searchId){
        int awal = 0;
        int akhir = books.size() - 1;
        while (awal <= akhir){
            int tengah = (akhir + awal) / 2;
            if (books.get(tengah).getId() == searchId){
                return tengah;
            }
            if (books.get(tengah).getId() < searchId){
                awal = tengah + 1;
            }
            if (books.get(tengah).getId() > searchId){
                akhir = tengah - 1;
            }
        }
        return -1;
    }
}
