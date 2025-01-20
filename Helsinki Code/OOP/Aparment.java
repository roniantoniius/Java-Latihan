package OOP;

public class Aparment {
    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int totalPrice;

    public Aparment(int rooms, int squares, int pricePerSquare){
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.totalPrice = squares * pricePerSquare;
    }

    public boolean largerThan(Aparment compare){
        if (this.squares > compare.squares){
            return true;
        }
        return false;
    }

    public int priceDifference(Aparment compare){
        return Math.abs(this.totalPrice - compare.totalPrice);
    }

    public boolean moreExpensive(Aparment compare){
        if (this.totalPrice > compare.totalPrice){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Apartemen ini memiliki " + this.rooms + " kamar, luas " + this.squares + " m^2, dan harga per meter persegi " + this.pricePerSquare + ". Total harga apartemen ini adalah " + this.totalPrice;
    }
}
