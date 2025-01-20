package OOP;

public class Pet {
    private String name;
    private String species;

    public Pet(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String getName(){
        return this.name;
    }

    public String getSpecies(){
        return this.species;
    }



    public String toString(){
        return this.name + " adalah " + this.species;
    }
}
