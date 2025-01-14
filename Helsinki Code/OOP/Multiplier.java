package OOP;

public class Multiplier {
    private int nilai;

    public Multiplier(int nilai){
        this.nilai = nilai;
    }

    public int pengkalian(int nilai){
        return this.nilai * nilai;
    }

    public int getNilai(){
        return this.nilai;
    }
}
