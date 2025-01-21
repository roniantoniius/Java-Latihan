package OOP_6;

public class UseAmusementPark {
    public static void main(String[] args){
        Person roni = new Person("Roni");
        roni.setBerat(60);
        roni.setTinggi(167);

        Person yuli = new Person("Yulii");
        yuli.setBerat(60);
        yuli.setTinggi(167);

        Person aku = new Person("Aku");
        aku.setBerat(40);
        aku.setTinggi(150);

        AmusementParkRide gundala = new AmusementParkRide("Gundala", 155);
        System.out.println(gundala);
        
        System.out.println();
        
        if (gundala.isAllowedOn(yuli)){
            System.out.println(yuli.getName() + " is allowed on " + gundala);
        } else {
            System.out.println(yuli.getName() + " is not allowed on " + gundala);
        }

        if (gundala.isAllowedOn(roni)){
            System.out.println(roni.getName() + " is allowed on " + gundala);
        } else {
            System.out.println(roni.getName() + " is not allowed on " + gundala);
        }
        
        if (gundala.isAllowedOn(aku)){
            System.out.println(aku.getName() + " is allowed on " + gundala);
        } else {
            System.out.println(aku.getName() + " is not allowed on " + gundala);
        }
        
        System.out.println(gundala);
        System.out.println("Rata-rata tinggi dari pengunjung pada wahana " + gundala + " adalah " + gundala.hitungRataTinggi() + "cm.");
        System.out.println("ORang paling tinggi adalah " + gundala.getTallest().getName());

        gundala.removeAmusement();
        System.out.println();
        System.out.println(gundala);
    }
}