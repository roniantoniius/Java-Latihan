public interface BooksSort {
    static void main(String[] args){
        SortBook books = new SortBook();
        books.add(124, "N");
        books.add(92, "Bukuuk");
        books.add(6, "Baakkku");
        books.add(35, "Wakakaku");
        books.add(22, "oakr");
        books.add(314, "Kokoasa");
        books.add(438, "Mockingbird");
        books.add(487, "Amvosng");
//        books.add(2314, "safaf");
        books.printBooks();
        System.out.println();
        System.out.println("Sort buku dengan bubble sort");
        books.sortById();
        System.out.println("\n Buku setelah diurutkan berdasarkan id dri yang terkecil");
        books.printBooks();

        System.out.println("Mencari buku dengan id 314");
        int searchId = 314;
        int index = SortBook.linearSearch(books.getBooks(), searchId);
        if (index == -1){
            System.out.println("\n Buku dengan id " + searchId + " tidak ditemukan");
        } else {
            System.out.println("\n Buku dengan id " + searchId + " telah ditemukan dengan hasil " + books.getBooks().get(index));
        }
        System.out.println();
        System.out.println("Mencari buku dengan id 487 dengan binary");
        int searchId2 = 487;
        int indexBinary = SortBook.binarySearch(books.getBooks(), searchId2);
        if (indexBinary == -1){
            System.out.println("\n Buku dengan id " + searchId2 + " tidak ditemukan menggunakan binary search");
        } else {
            System.out.println("\n Buku dengan id " + searchId2 + " telah ditemukan dengan binary search dengan hasil " + books.getBooks().get(indexBinary));
        }
    }
}
