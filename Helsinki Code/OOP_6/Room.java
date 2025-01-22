package OOP_6;
import java.util.ArrayList;
public class Room {
    private ArrayList<Person> orangOrang;
    public Room(){
        this.orangOrang = new ArrayList<>();
    }
    public void add(Person orang){
        this.orangOrang.add(orang);
    }
    public boolean isEmpty(){
        return this.orangOrang.isEmpty();
    }
    public ArrayList<Person> getPerson(){
        if (this.orangOrang.isEmpty()){
            return null;
        }
        return this.orangOrang;
    }
    public Person shortest(){
        if (this.orangOrang.isEmpty()){
            return null;
        }
        Person orang = this.orangOrang.get(0);
        for (Person daftar: this.orangOrang){
            if (daftar.getHeight() < orang.getHeight()){
                orang = daftar;
            }
        }
        return orang;
    }
    public Person take(){
        // ambil indeks atau lokasi dari shortest yang ada di list
        Person min = shortest(); // untuk memanggill method dengan type Object yang serupa, kita tidak perlu menyebut si Lisstnya lagi
        int index = this.orangOrang.indexOf(min);
        if (index != -1){
            this.orangOrang.remove(index);
            return min;
        }
        return null;
    }
}