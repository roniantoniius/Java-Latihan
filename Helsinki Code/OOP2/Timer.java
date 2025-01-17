package OOP2;

public class Timer {
    private int value;
    private int limit;

    public Timer(int limit){
        this.limit = limit;
        this.value = 0;
    }
    public void advance(){
        this.value++;
        if(this.value >= this.limit){
            this.value = 0;
        }
    }
    public int value(){
        return this.value;
    }

    public String toString(){
        if (this.value < 10){
            return "0" + String.valueOf(this.value);
        }
        return "" + this.value;
    }
}
