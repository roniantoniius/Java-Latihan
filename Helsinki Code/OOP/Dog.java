package OOP;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String initialName, String initialBreed, int initialAge){
        this.name = initialName;
        this.breed = initialBreed;
        this.age = initialAge;
    }

    public String toString(){
        return this.name + ", " + this.breed + ", " + this.age;
    }

    public void bark(){
        System.out.println("woof woof");
    }

    public void wagTail(){
        System.out.println("tail wagging");
    }

    public void printDog(){
        System.out.println("Name: " + this.name + " Breed: " + this.breed + " Age: " + this.age);
    }
    
}