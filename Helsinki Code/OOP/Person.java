package OOP;

public class Person {
    // variabel di dalam class adalah Instance Variabel / object attributes
    private String name; 
    private int age;

    // bikin constructor untuk variabel yang akan kita pass (bisa digunakan) ketika cclass dipanggil. Kalau pake private di variabel, harus pake constructor
    // penggunaan this adalah untuk membedakan variabel yang ada di class dengan variabel yang di pass
    public Person(String namaAwal){
        this.name = namaAwal;
        this.age = 0;
    }

    public void printOrang(){
        System.out.println(this.name + " sekarang berumur " + this.age + " tahun");
    }

    public void makinTua(){
        if (this.age <= 60){
            this.age = this.age + 1;
        }
    }

    public int ambilUmur(){
        return this.age;
    }
}