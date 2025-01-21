package OOP_6;
import java.util.ArrayList;
public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> daftarBoleh; // merupkaan sebuah objek variabel list instance yang mengandung daftar orang-orang yang diperbolehkan untuk naik

    public AmusementParkRide(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
        this.daftarBoleh = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < this.minimumHeight) {
            return false;
        }

        this.visitors++;
        this.daftarBoleh.add(person);
        return true;
    }

    public double hitungRataTinggi(){
        if (daftarBoleh.isEmpty()){
            return -1;
        }

        int jumlah = 0;
        for (Person orang: daftarBoleh){
            jumlah += orang.getHeight();
        }

        return 1.0 * jumlah / daftarBoleh.size();
    }
    public void removeAmusement(){
        this.daftarBoleh.clear();
    }
    public Person getTallest(){
        if (this.daftarBoleh.isEmpty()){
            return null;
        }

        Person orangAwal = this.daftarBoleh.get(0);

        for (Person orang: this.daftarBoleh){
            if(orangAwal.getHeight() < orang.getHeight()){
                orangAwal = orang;
            }
        }

        return orangAwal;
    }
    public String toString() {
        String printOutput = this.name + ", minimum height requirement: " + this.minimumHeight + ", visitors: " + this.visitors + "\n";

        if (daftarBoleh.isEmpty()){
            return printOutput + "Tidak ada yang menaiki wahana ini!";
        }

        String listPerson = "";
        for (Person orang: daftarBoleh){
            listPerson += orang.getName() + "\n";
        }

        return printOutput + "\n" + "ada yang menaiki wahana ini: \n" + listPerson;
    }
}