package OOP;

public class UsePerson {
    public static void main(String[] args){
        Person roni = new Person("Roni");
        Person yuli = new Person("yuli"); // ini adalah object
        for (int i = 0; i < 30; i++){
            roni.makinTua();
        }

        yuli.makinTua();
        System.out.println("");

        if (yuli.isLegal()){
            System.out.println(yuli.getName() + "of legal age: ");
        } else {
            System.out.println(yuli.getName() + "not of legal age: ");
        };

        if (roni.isLegal()){
            System.out.println(roni.getName() + "of legal age: ");
        } else {
            System.out.println(roni.getName() + "not of legal age: ");
        };

        roni.setBerat(70);
        roni.setTinggi(170);

        yuli.setBerat(58);
        yuli.setTinggi(165);

        System.out.println(roni.getName() + ", memiliki body mass index yaitu " + roni.BMI());
        System.out.println(yuli.getName() + ", memiliki body mass index yaitu " + yuli.BMI());
    }
}
