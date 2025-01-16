package Berkas;

public class Esport {
    private String home;
    private String away;
    private int homeScore;
    private int awayScore;

    public Esport(String home, String away, int homeScore, int awayScore){
        this.home = home;
        this.away = away;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    public String toString(){
        return "Home: " + this.home + " Away: " + this.away + " Home Score: " + this.homeScore + " Away Score: " + this.awayScore;
    }
    public String getHome(){
        return this.home;
    }
    public String getAway(){
        return this.away;
    }
    public int Score(){
        return this.homeScore - this.awayScore;
    }
}
