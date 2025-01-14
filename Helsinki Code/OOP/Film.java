package OOP;

public class Film {
    private String name;
    private int ageRating;

    public Film(String initialName, int initialAgeRating){
        this.name = initialName;
        this.ageRating = initialAgeRating;
    }

    public String name(){
        return this.name;
    }

    public int ageRating(){
        return this.ageRating;
    }
}
