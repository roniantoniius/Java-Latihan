package OOP;

public class UseSimpleDdateReturnObjectValue {
    public static void main(String[] args){
        SimpleDate waktu1 = new SimpleDate(20, 01, 2025);
        System.out.println("Hari ini adalah tanggal " + waktu1);

        SimpleDate waktu1SetelahSatuMinggu = waktu1.afterNumberOfDays(7);
        for (int i = 1; i <= 7; i++){
            System.out.println("Hari ini adalah tanggal " + waktu1 + " Pada percobaan ke-" + i);
            waktu1SetelahSatuMinggu = waktu1SetelahSatuMinggu.afterNumberOfDays(7);
        }

        System.out.println("Waktu setelah 790 hari adalah " + waktu1.afterNumberOfDays(790) + " dari " + waktu1);
    }
}
