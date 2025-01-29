public class BirdWatcher {
    private String name;
    private String latino;
    private int obs;
    public BirdWatcher(String name, String latin){
        this.name = name;
        this.latino = latin;
        this.obs = 0;
    }
    public void observasi(int jumlah){
        this.obs = this.obs + jumlah;
    }
    public String getName(){
        return this.name;
    }
    public String getLatino(){
        return this.latino;
    }
    public int getObs(){
        return this.obs;
    }
    @Override
    public String toString(){
        return "Burung " + name + " (" + latino + "): " + obs + " kali observasi";
    }
}
