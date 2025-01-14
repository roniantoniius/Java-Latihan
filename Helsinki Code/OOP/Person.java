package OOP;

public class Person {
    // variabel di dalam class adalah Instance Variabel / object attributes
    private String name; 
    private int age;
    private int height;
    private int weight;

    // bikin constructor untuk variabel yang akan kita pass (bisa digunakan) ketika cclass dipanggil. Kalau pake private di variabel, harus pake constructor
    // penggunaan this adalah untuk membedakan variabel yang ada di class dengan variabel yang di pass
    public Person(String namaAwal){
        this.name = namaAwal;
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    public String toString(){
        return this.getName() + " sekarang berumur " + this.ambilUmur() + " tahun" + " dengan tinggi " + this.height + " cm dan berat " + this.weight + " kg. Sehingga BMI nya adalah " + this.BMI();
    }

    public void makinTua(){
        if (this.age <= 60){
            this.age = this.age + 1;
        }
    }

    public int ambilUmur(){
        return this.age;
    }

    public Boolean isLegal(){
        return this.age >= 21;
    }

    public String getName(){
        return this.name;
    }
    
    public void setTinggi(int height){
        this.height = height;
    }

    public void setBerat(int weight){
        this.weight = weight;
    }

    public Double BMI(){
        double tinggiPerSeratus = this.height / 100.0;
        return this.weight / (tinggiPerSeratus * tinggiPerSeratus);
    }
}