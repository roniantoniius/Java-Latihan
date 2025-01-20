package OOP;
import java.time.LocalDate;
public class UsePersonDate {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(24, 3, 2000);
        Pet pet = new Pet("Bulbul", "Kucing");
        PersonDate person = new PersonDate("Budi", date, pet);
        PersonDate person2 = new PersonDate("Irama", 29, 1, 2000, "Kitty", "Kucing");
        System.out.println(person);
        System.out.println(person2);

        System.out.println();
        LocalDate sekarang = LocalDate.now();
        int hari = sekarang.getDayOfMonth();
        int bulan = sekarang.getMonthValue();
        int tahun = sekarang.getYear();

        System.out.println("Hari ini adalah tanggal " + hari + " bulan " + bulan + " tahun " + tahun);

        if (person.olderThan(person2)){
            System.out.println(person.getName() + " lebih tua dari " + person2.getName());
        } else {
            System.out.println(person2.getName() + " lebih tua dari " + person.getName());
        }
    }
}
