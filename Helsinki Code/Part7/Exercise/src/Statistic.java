import java.util.Scanner;
public interface Statistic {
    static void main(String[] args){
        StatisticPoint stats = new StatisticPoint();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Masukkan nilai dari rentang 1 - 100 (-1 untuk stop): ");
            int nilai = scanner.nextInt();
            if (nilai == -1){
                break;
            } else if (nilai >= 1 && nilai <= 100){
                stats.add(nilai);
            } else {
                System.out.println("Angka harus [1-100]");
            }
        }
        System.out.println("Point average (all): " + stats.average());
    }
}
