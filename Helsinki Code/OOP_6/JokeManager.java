package OOP_6;
import java.util.ArrayList;
public class JokeManager {
    private ArrayList<String> candaan;
    public JokeManager(){
        this.candaan = new ArrayList<>();
    }
    public void addJoke(String canda){
        this.candaan.add(canda);
    }
    public String drawJoke(){
        if (this.candaan.isEmpty()){
            return "No jokes available.";
        }
        int index = (int) (Math.random() * this.candaan.size());
        return this.candaan.get(index);
    }
    public void printJokes(){
        for (String joke: this.candaan){
            System.out.println(joke);
        }
    }
}
