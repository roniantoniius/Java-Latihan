package OOP;

public class Room {
    private String code;
    private int numberOfSeats;

    public Room(String classCode, int numberOfSeats){
        this.code = classCode;
        this.numberOfSeats = numberOfSeats;
    }

    public String toString(){
        return this.code + ", seats: " + this.numberOfSeats;
    }
}
