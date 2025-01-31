/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.HashMap;
import java.util.Objects;

public class IOU {    
    private HashMap<String, Double> hashmap;
    
    public IOU(){
        this.hashmap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.hashmap.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return this.hashmap.getOrDefault(toWhom, 0.0);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.hashmap);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final IOU other = (IOU) obj;
        if (!Objects.equals(this.hashmap, other.hashmap)) {
            return false;
        }
        return true;
    }
}