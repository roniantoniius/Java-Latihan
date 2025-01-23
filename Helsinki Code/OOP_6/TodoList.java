package OOP_6;
import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> todoList;
    public TodoList(){
        this.todoList = new ArrayList<>();
    }
    public void add(String todo){
        this.todoList.add(todo);
    }
    public void print(){
        for (int i = 0; i < this.todoList.size(); i++){
            System.out.println((i + 1) + ": " + this.todoList.get(i));
        }
    }
    public void remove(int number){
        this.todoList.remove(number - 1);
    }
}
