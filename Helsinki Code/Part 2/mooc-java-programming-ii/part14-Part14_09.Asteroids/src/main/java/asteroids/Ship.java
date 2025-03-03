/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;

/**
 *
 * @author ASUS
 */
public class Ship {
    private Polygon karakter;
    private Point2D gerakan;
    public Ship(int x, int y){
        this.karakter = new Polygon(-5, -5, 10, 0, -5, 5);
        this.karakter.setTranslateX(x);
        this.karakter.setTranslateY(y);
        this.gerakan = new Point2D(0, 0);
    }
    public Polygon getCharacter(){
        return this.karakter;
    }
    public void turnLeft(){
        this.karakter.setRotate(this.karakter.getRotate() - 5);
    }
    public void turnRight(){
        this.karakter.setRotate(this.karakter.getRotate() + 5);
    }
    public void move(){
        this.karakter.setTranslateX(this.karakter.getTranslateX() + this.gerakan.getX());
        this.karakter.setTranslateY(this.karakter.getTranslateY() + this.gerakan.getY());
    }
    public void accelerate(){
        double gerakX = Math.cos(Math.toRadians(this.karakter.getRotate())) * 0.05;
        double gerakY = Math.sin(Math.toRadians(this.karakter.getRotate())) * 0.05;
        this.gerakan = this.gerakan.add(gerakX, gerakY);
    }
}
