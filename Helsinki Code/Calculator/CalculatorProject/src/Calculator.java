public class Calculator {
    private int value;
    public int add(int values){
        return this.value += values;
    }
    public Calculator(){
        this.value = 0;
    }
    public int getValue(){
        return this.value;
    }
    public int substract(int values){
        return this.value -= values;
    }
}