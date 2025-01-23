package OOP_6;
import java.util.Scanner;
public class UserInterfaceTodoList {
    private Scanner scanner;
    private TodoList todoList;
    public UserInterfaceTodoList(Scanner scanner, TodoList todoList){
        this.scanner = scanner;
        this.todoList = todoList;
    }
    public void start(){
        while (true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")){
                System.out.println("Todo: ");
                String todo = scanner.nextLine();
                this.todoList.add(todo);
            } else if (command.equals("list")){
                this.todoList.print();
            } else if (command.equals("remove")){
                System.out.println("Number: ");
                int number = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(number);
            }
        }
    }
}
