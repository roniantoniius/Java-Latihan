/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor {
    private List<Integer> daftarNilai;
    private List<Sensor> daftar;
    public AverageSensor(){
        this.daftarNilai = new ArrayList<>();
        this.daftar = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd){
        this.daftar.add(toAdd);
    }
    public List<Integer> readings(){
        return this.daftarNilai;
    }

    @Override
    public boolean isOn() {
        for (Sensor sens: this.daftar){
            if (!sens.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sens : this.daftar) {
            sens.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sens : this.daftar) {
            sens.setOff();
        }
    }

    @Override
    public int read() {
        if (isOn()){
            double rataRata = this.daftar.stream()
                .mapToInt(angka -> angka.read())
                .average()
                .getAsDouble();
            this.daftarNilai.add(((int) rataRata));
            return (int) rataRata;
        }
        throw new IllegalStateException("There is no sensor or average sensor status is off.");
    }
    
}
