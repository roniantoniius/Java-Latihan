package OOP2;

public class Counter {
    private int startvalue;
    public Counter(int startvalue){
        this.startvalue = startvalue;
    }

    public Counter(){
        this.startvalue = 0;
    }
    public int value(){
        return this.startvalue;
    }

    public void increase(){
        this.startvalue++;
    }

    public void increase(int increaseAmount){
        if (increaseAmount > 0){
            this.startvalue += increaseAmount;
        }
    }

    public void decrease(){
        this.startvalue--;
    }

    public void decrease(int decreaseAmount){
        if (decreaseAmount > 0){
            this.startvalue -= decreaseAmount;
        }
    }
}
