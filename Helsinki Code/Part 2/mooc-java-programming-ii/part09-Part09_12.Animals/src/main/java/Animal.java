/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public abstract class Animal {
    private String names;
    public Animal(String names){
        this.names = names;
    }
    public void eat(){
        System.out.println(getName() + " eats");
    }
    public String getName(){
        return this.names;
    }
    public void sleep(){
        System.out.println(getName() + " sleeps");
    }
}
