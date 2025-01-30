import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")){
                break;
            }
            String[] list = input.split(" ");
            String perintah = list[0];
            int jumlah = Integer.valueOf(list[1]);
            if (perintah.equals("add")) {
                if (container1 > 100 || jumlah < 0){
                    container1 = 100;
                } else if (jumlah > 100){
                    container1 = 100;
                } else {
                    container1 += jumlah;
                    if (container1 > 100){
                        container1 = 100;
                    }
                }
            } else if (perintah.equals("move")){
                if (container2 > 100 || jumlah < 0){
                    jumlah = 0;
                    container2 = 100;
                    container1 -= jumlah;
                } else if (jumlah > 100){
                    container1 -= 100;
                    container2 += 100;
                } else {
                    if (jumlah >= container1){
                        container2 += container1;
                        container1 -= container1;
                    } else {
                        container2 += jumlah;
                        container1 -= jumlah;
                        if (container2 > 100){
                            container2 = 100;
                        }
                    }
                }
            } else if (perintah.equals("remove")){
                if (jumlah > container2){
                    container2 -= container2;
                } else if (jumlah > 100){
                    container2 -= 100;
                } else {
                    container2 -= jumlah;
                }
            } else {
                System.out.println("Perintah tidak ditemukan");
            }

        }
    }
}
