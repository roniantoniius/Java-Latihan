package OOP_6;
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> daftar;

    public Stack(){
        this.daftar = new ArrayList<>();
    }

    public boolean isEmpty(){
        return this.daftar.isEmpty();
    }

    // adding some value to the top of the list (newest)
    public void add(String value){
        this.daftar.add(value);
    }

    // public ArrayList<String> values() - returns the values ​​contained in the stack as a list
    public ArrayList<String> values(){
        return this.daftar;
    }

    // take value from the top of the list (newest)
    public String take(){
        String value = this.daftar.get(this.daftar.size()-1);
        this.daftar.remove(this.daftar.size()-1);
        return value;
    }
}