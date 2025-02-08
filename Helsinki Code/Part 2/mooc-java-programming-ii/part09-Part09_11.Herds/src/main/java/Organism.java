/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Organism implements Movable {
    private int x;
    private int y;
    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    @Override
    public String toString(){
        return "x: " + getX() + "; y: " + getY();
    }
    @Override
    public void move(int dx, int dy){
        this.x = getX() + dx;
        this.y = getY() + dy;
    }
}
