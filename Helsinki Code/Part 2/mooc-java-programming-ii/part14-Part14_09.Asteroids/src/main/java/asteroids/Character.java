/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

/**
 *
 * @author ASUS
 */
public abstract class Character {
    private Polygon karakter;
    private Point2D gerakan;
    public Boolean stats;
    public Character(Polygon objek, int x, int y){
        this.karakter = objek;
        this.karakter.setTranslateX(x);
        this.karakter.setTranslateY(y);
        this.gerakan = new Point2D(0, 0);
        this.stats = true;
    }
    public Polygon getCharacter(){
        return this.karakter;
    }
    public Point2D getMovement(){
        return this.gerakan;
    }
    public void setMovement(Point2D gerakanBaru){
        this.gerakan = gerakanBaru;
    }
    public void turnLeft(){
        this.karakter.setRotate(this.karakter.getRotate() - 5);
    }
    public void turnRight(){
        this.karakter.setRotate(this.karakter.getRotate() + 5);
    }
    public void setAlive(boolean status){
        this.stats = status;
    }
    public Boolean isAlive(){
        return this.stats;
    }
    public void move(){
        this.karakter.setTranslateX(this.karakter.getTranslateX() + this.gerakan.getX());
        this.karakter.setTranslateY(this.karakter.getTranslateY() + this.gerakan.getY());
        
        if (this.karakter.getTranslateX() < 0){
            this.karakter.setTranslateX(this.karakter.getTranslateX() + AsteroidsApplication.WIDTH);
        }
        if (this.karakter.getTranslateX() > AsteroidsApplication.WIDTH){
            this.karakter.setTranslateX(this.karakter.getTranslateX() % AsteroidsApplication.WIDTH);
        }
        if (this.karakter.getTranslateY() < 0){
            this.karakter.setTranslateY(this.karakter.getTranslateY() + AsteroidsApplication.HEIGHT);
        }
        if (this.karakter.getTranslateY() > AsteroidsApplication.HEIGHT){
            this.karakter.setTranslateY(this.karakter.getTranslateY() % AsteroidsApplication.HEIGHT);
        }
    }
    public void accelerate(){
        double gerakX = Math.cos(Math.toRadians(this.karakter.getRotate())) * 0.05;
        double gerakY = Math.sin(Math.toRadians(this.karakter.getRotate())) * 0.05;
        this.gerakan = this.gerakan.add(gerakX, gerakY);
    }
    public void slowDown(){
        double gerakX = Math.cos(Math.toRadians(this.karakter.getRotate())) * 0.05;
        double gerakY = Math.sin(Math.toRadians(this.karakter.getRotate())) * 0.05;
        gerakX *= -1;
        gerakY *= -1;
        this.gerakan = this.gerakan.add(gerakX, gerakY);
    }
    public boolean collide(Character objek){
        Shape tabrakan = Shape.intersect(this.karakter, objek.getCharacter());
        return tabrakan.getBoundsInLocal().getWidth() != -1;
    }
}