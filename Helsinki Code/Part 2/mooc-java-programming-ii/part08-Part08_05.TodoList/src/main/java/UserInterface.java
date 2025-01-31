/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class UserInterface {
    private TodoList tugasTugas;
    private Scanner scanner;
    public UserInterface(TodoList lo, Scanner s){
        this.tugasTugas = lo;
        this.scanner = s;
    }
    public void start(){
        while (true){
            System.out.println("Masukkan perintah untuk todo list anda: ");
            String perintah = this.scanner.nextLine();
            if (perintah.equals("stop")){
                break;
            } else if (perintah.equals("add")){
                System.out.println("Menambahkan tugas apa?");
                String tugas = this.scanner.nextLine();
                if (tugas.isEmpty()){
                    System.out.println("Please provide task");
                }
                this.tugasTugas.add(tugas);
            } else if (perintah.equals("list")){
                this.tugasTugas.print();
            } else if (perintah.equals("remove")){
                System.out.println("Which one is removed?");
                int hapus = this.scanner.nextInt();
                this.tugasTugas.remove(hapus);
            } else {
                System.out.println("That command is not working");
            }
        }
        
    }
}
