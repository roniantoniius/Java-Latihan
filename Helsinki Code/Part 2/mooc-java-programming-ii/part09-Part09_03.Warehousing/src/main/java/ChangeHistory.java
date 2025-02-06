/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> status;
    public ChangeHistory(){
        this.status = new ArrayList<>();
    }
    public void add(double status){
        this.status.add(status);
    }
    public void clear(){
        this.status.clear();
    }
    public double maxValue(){
        double maksimum = this.status.get(0);
        if (this.status.isEmpty()){
            return 0.0;
        } else{
            for (double stats: this.status){
                if (stats > maksimum){
                    maksimum = stats;
                }
            }
        }
        return maksimum;
    }
    public double minValue(){
        double min = this.status.get(0);
        if (this.status.isEmpty()){
            return 0.0;
        } else {
            for (double stats: this.status){
                if (min > stats){
                    min = stats;
                }
            }
        }
        return min;
    }
    public double average(){
        if(this.status.isEmpty()){
            return 0.0;
        }
        double sums = 0;
        for(double stats: this.status){
            sums += stats;
        }
        return sums / this.status.size();
    }
    @Override
    public String toString(){
        return this.status.toString();
    }
}
