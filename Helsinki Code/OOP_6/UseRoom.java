package OOP_6;

public class UseRoom {
    public static void main(String[] args){
        Room gedungA = new Room();
        System.out.println("Apakah gedung A masih kosong? " + gedungA.isEmpty());
        gedungA.add(new Person("Roni", 170));
        gedungA.add(new Person("Mamah", 160));
        gedungA.add(new Person("Bapa", 174));
        gedungA.add(new Person("Abang", 172));
        gedungA.add(new Person("Clara", 165));
        gedungA.add(new Person("Zipan", 164));
        System.out.println("Apakah Gedung A masih kosong lagi? " + gedungA.isEmpty());

        System.out.println("");
        for (Person daftarOrang: gedungA.getPerson()){
            System.out.println(daftarOrang);
        }
        System.out.println("Orang yang memiliki tinggi terendah adalah " + gedungA.shortest());
        System.out.println("Kita hapus itu ya " + gedungA.take());
        System.out.println("");
        for (Person orang: gedungA.getPerson()){
            System.out.println(orang);
        }

        while (!gedungA.isEmpty()){
            System.out.println(gedungA.take());
        }
    }
}
