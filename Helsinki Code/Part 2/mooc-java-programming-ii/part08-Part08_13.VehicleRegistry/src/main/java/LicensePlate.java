
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber){
        this.liNumber = liNumber;
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
    public String getPlate(){
        return this.liNumber;
    }
    @Override
    public String toString(){
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.liNumber);
        hash = 29 * hash + Objects.hashCode(this.country);
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
        // tipe datanya bukan object inputnya
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LicensePlate other = (LicensePlate) obj;
        if (!Objects.equals(this.liNumber, other.liNumber)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        return true;
    }

}
