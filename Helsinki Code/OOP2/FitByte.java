package OOP2;

public class FitByte {
    private int age;
    private int restingHeartRate;

    public FitByte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public Double maximumHeartRate(){
        return 206.3 - (0.711 * this.age);
    }

    public Double targetHeartRate(double percentageHeartOfMaximum){
        return (this.maximumHeartRate() - this.restingHeartRate) * (percentageHeartOfMaximum) + this.restingHeartRate;
    }

    
}
