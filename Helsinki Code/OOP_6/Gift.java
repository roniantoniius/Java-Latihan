package OOP_6;

public class Gift {
    private String name;
    private double weight;

    public Gift(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public double getWeight(){
        return this.weight;
    }

    public String toString(){
        return "Hadiah kamu adalah " + this.getName() + " dengan berat " + this.getWeight() + " kg";
    }
}
