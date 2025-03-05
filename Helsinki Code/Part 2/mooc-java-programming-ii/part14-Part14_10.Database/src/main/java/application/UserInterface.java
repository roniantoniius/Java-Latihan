package application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            if (command.equals("1")){
                System.out.println("Listing the database contents");
                if (this.database.list().isEmpty()){
                    System.out.println();
                } else {
                    List<Todo> daftarTugas = this.database.list();
                    daftarTugas.stream().forEach(tugas -> System.out.println(tugas));
                }
            }
            // the rule is we cant change any code at this project Classes to make a method to checking value by id
            if (command.equals("2")){
                System.out.println("Adding a new todo");
                System.out.println("Enter name");
                String nama = this.scanner.nextLine();
                System.out.println("Enter description");
                String deskripsi = this.scanner.nextLine();
                Boolean status = false;
                this.database.add(new Todo(nama, deskripsi, status));
            }
            
            if (command.equals("3")){
                System.out.println("Which todo should be marked as done (give the id)?");
                this.database.markAsDone((int) scanner.nextInt());
            }
            
            if (command.equals("4")){
                System.out.println("Which todo should be removed (give the id)?");
                this.database.remove((int) scanner.nextInt());
            }
        }

        System.out.println("Thank you!");
    }

}
