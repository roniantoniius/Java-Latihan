package OOP;

public class Gauge {
    private int value;

    public Gauge(){
        this.value = 0;
    }

    public void increase(){
        if (this.value <= 5){
            this.value = this.value + 1;
        }
    };

    public void decrease(){
        if (this.value >= 0){
            this.value = this.value - 1;
        }
    };

    public int value(){
        return this.value;
    }

    public Boolean full(){
        return this.value == 5;
    }
}
