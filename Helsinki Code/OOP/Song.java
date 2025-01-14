package OOP;

public class Song {
    private String name;
    private int length;

    public Song(String initialName, int initialLength){
        this.name = initialName;
        this.length = initialLength;
    }

    public String nama(){
        return this.name;
    }

    public int length(){
        return this.length;
    }
}
