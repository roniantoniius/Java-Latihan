
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        
        Dog bobi = new Dog("Bobi");
        bobi.bark();
        
        Cat bulbul = new Cat("Bulbul");
        bulbul.eat();
        bulbul.purr();
        
        Cat kucing = new Cat();
        kucing.eat();
        
        NoiseCapable dogs = new Dog();
        dogs.makeNoise();
        
        NoiseCapable cats = new Cat();
        cats.makeNoise();
    }

}
