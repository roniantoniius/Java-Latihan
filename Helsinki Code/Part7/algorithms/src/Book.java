public class Book {
    private int id;
    private String name;
    public Book(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "Buku " + this.name + " memiliki id: " + this.id;
    }
}
