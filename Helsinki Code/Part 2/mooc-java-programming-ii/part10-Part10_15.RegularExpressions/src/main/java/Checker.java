

public class Checker {
    private String kata;
    public Checker(){
        this.kata = "";
    }
    public Checker(String kata){
        this.kata = kata;
    }
    public String getKata(){
        return this.kata;
    }
    public boolean isDayOfWeek(String periksa){
        if (periksa.matches("(mon|tue|wed|thu|fri|sat|sun)")){
            return true;
        } else {
            return false;
        }
    }
    public boolean allVowels(String periksa){
        if (periksa.matches("(a|e|i|o|u)*")){
            return true;
        } else {
            return false;
        }
    }
    public boolean timeOfDay(String periksaLagiAduh){
        if (periksaLagiAduh.matches("[0-2][0-9]:[0-5][0-9]:[0-5][0-9]")){
            String[] waktu = periksaLagiAduh.split(":");
            int jam = Integer.parseInt(waktu[0]);
            int menit = Integer.parseInt(waktu[1]);
            int detik = Integer.parseInt(waktu[2]);
            if (jam >= 24 || menit >= 60 || detik >= 60){
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}