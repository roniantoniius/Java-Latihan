package OOP;

public class Bird {
    private String name;

    public Bird(String name){
        this.name = name;
    }

    public boolean equals(Object compare){
        if (this == compare){
            return true;
        }

        if (!(compare instanceof Bird)){
            return false;
        }

        Bird compareBird = (Bird) compare;

        return this.name.equals(compareBird.name);
    }

}
