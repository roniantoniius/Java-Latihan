/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> task;
    public TodoList(){
        this.task = new ArrayList<>();
    }
    public void add(String tugas){
        this.task.add(tugas);
    }
    public void print(){
        int j = 1;
        for (String i: this.task){
            System.out.println(j + ": " + i);
            j++;
        }
    }
    public void remove(int i){
        this.task.remove(i-1);
    }
}
