package OOP2;

public class Clock {
    private ClockHand detik;
    private ClockHand menit;
    private ClockHand jam;
    private Timer miliDetik;

    public Clock(){
        this.detik = new ClockHand(60);
        this.menit = new ClockHand(60);
        this.jam = new ClockHand(24);
        this.miliDetik = new Timer(100);
    }

    public void advance(){
        this.miliDetik.advance();
        if (this.miliDetik.value() == 0){
            this.detik.advance();
            if (this.detik.value() == 0){
                this.menit.advance();
                if (this.menit.value() == 0){
                    this.jam.advance();
                }
            }
        }
    }

    public String toString(){
        return this.jam + ":" + this.menit + ":" + this.detik;
    }
}
