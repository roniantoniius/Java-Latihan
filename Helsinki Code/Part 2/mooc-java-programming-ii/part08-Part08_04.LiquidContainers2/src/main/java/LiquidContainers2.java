
import java.util.Scanner;
class Container {
    private int amount;
    
    public Container() {
        this.amount = 0;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
            if (this.amount > 100) {
                this.amount = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.amount -= amount;
            if (this.amount < 0) {
                this.amount = 0;
            }
        }
    }
    
    @Override
    public String toString() {
        return this.amount + "/100";
    }
}
public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        
        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            System.out.print("> ");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                System.out.println("First: " + container1);
                System.out.println("Second: " + container2);
                break;
            }
            
            String[] list = input.split(" ");
            if (list.length < 2) {
                System.out.println("Input tidak lengkap. Harap masukkan perintah dan jumlah.");
                continue;
            }
            
            String perintah = list[0];
            int jumlah = Integer.valueOf(list[1]);
            
            if (perintah.equals("add")) {
                container1.add(jumlah);
            } else if (perintah.equals("move")) {
                if (jumlah > container1.contains()) {
                    jumlah = container1.contains();
                }
                container1.remove(jumlah);
                container2.add(jumlah);
            } else if (perintah.equals("remove")) {
                container2.remove(jumlah);
            } else {
                System.out.println("Perintah tidak ditemukan");
            }
        }
    }
}
