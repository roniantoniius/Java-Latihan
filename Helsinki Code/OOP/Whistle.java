package OOP;

public class Whistle {
    private String sound;

    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }

    public void suaraApa(){
        System.out.println("The whistle sounds like: " + this.sound);
    }
}
