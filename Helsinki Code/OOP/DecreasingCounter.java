package OOP;

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue){
        this.value = initialValue;
    }

    public void cetakNilai(){
        System.out.println("Nilai: " + this.value);
    }

    public void kuranginNilai(){
        if (this.value > 0){
            this.value = this.value - 1;
        }
    }

    public void resetNilai(){
        this.value = 0;
    }
}
