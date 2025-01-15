package OOP;

public class PersonalInformationCollector {
    private String firstName;
    private String lastName;
    private int idNumber;

    public PersonalInformationCollector(String firstName, String lastName, int idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String toString(){
        return this.firstName + this.lastName + " memiliki ID " + this.idNumber;
    }
}
