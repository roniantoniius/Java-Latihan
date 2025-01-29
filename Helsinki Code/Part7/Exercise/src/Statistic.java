import java.util.Scanner;
public interface Statistic {
    static void main(String[] args){
        StatisticPoint stats = new StatisticPoint();
        StatisticPoint statsPass = new StatisticPoint();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Masukkan nilai dari rentang 1 - 100 (-1 untuk stop): ");
            int nilai = scanner.nextInt();
            if (nilai == -1){
                break;
            } else if (nilai >= 1 && nilai <= 100){
                if (nilai >= 75){
                    stats.add(nilai);
                    statsPass.add(nilai);
                }
                stats.add(nilai);
            } else {
                System.out.println("Angka harus [1-100]");
            }
        }
        System.out.println("Point average (all): " + stats.average());
        System.out.println("Point average (pass): " + statsPass.average());
        System.out.println("Pass Percentage: " + stats.passing(75) + "%");
        System.out.println("Distribusi Peringkat: ");
        printGradeDistribution(stats);
    }
    static void printGradeDistribution(StatisticPoint daftar) {
        int grade = 5;
        while (grade >= 0) {
            int stars = daftar.jumlahGrade(grade);
            System.out.print(grade + ": ");
            daftar.printStars(stars);
            System.out.println("");
            grade = grade - 1;
        }
    }
}
