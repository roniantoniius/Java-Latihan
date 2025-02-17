/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Employees {
    private List<Person> karyawan;
    public Employees(){
        this.karyawan = new ArrayList<>();
    }
    public void add(Person personToAdd){
        this.karyawan.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd){
        Iterator<Person> iterator = peopleToAdd.iterator();
        while (iterator.hasNext()){
            Person orangs = iterator.next();
            this.karyawan.add(orangs);
        }
    }
    public void print(){
        Iterator<Person> iterator = karyawan.iterator();
        while (iterator.hasNext()){
            Person orangs = iterator.next();
            System.out.println(orangs);
        }
    }
    public void print(Education education){
        Iterator<Person> iterator = karyawan.iterator();
        while (iterator.hasNext()){
            Person orangs = iterator.next();
            if (orangs.getEducation() == education){
                System.out.println(orangs);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator = karyawan.iterator();
        while (iterator.hasNext()){
            Person orangs = iterator.next();
            if (orangs.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
