package OOP;

public class PersonDate {
    private String name;
    private SimpleDate birthday; // panggil class SimpleDate
    private Pet pet;

    public PersonDate(String name, SimpleDate birthday, Pet pet){
        this.name = name;
        this.birthday = birthday;
        this.pet = pet;
    }

    public PersonDate(String name, int day, int month, int year, String petName, String petSpecies){
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
        this.pet = new Pet(petName, petSpecies);
    }

    public String getName(){
        return this.name;
    }

    public boolean olderThan(PersonDate other){
        if (this.birthday.before(birthday)){
            return true;
        }
        return false;
    }

    public boolean equals(Object compare){
        if (this == compare){
            return true;
        }

        if (!(compare instanceof PersonDate)){
            return false;
        }

        PersonDate comparePersonDate = (PersonDate) compare;

        if (this.name.equals(comparePersonDate.name)
            && this.birthday.equals(comparePersonDate.birthday)
            && this.pet.equals(comparePersonDate.pet)){
            return true;
        }

        return false;
    }

    public String toString(){
        return this.name + " lahir pada tanggal " + this.birthday + " dan memiliki hewan peliharaan " + this.pet;
    }
}
