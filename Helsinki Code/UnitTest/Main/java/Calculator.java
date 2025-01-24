package UnitTest.Main.java;

public class Calculator {
    private int number;
    public Calculator(){
        this.number = 0;
    }
    public void add(int number){
        this.number += number;
    }
    public void subtract(int number){
        this.number += number;
    }
    public int getValue(){
        return this.number;
    }
}
