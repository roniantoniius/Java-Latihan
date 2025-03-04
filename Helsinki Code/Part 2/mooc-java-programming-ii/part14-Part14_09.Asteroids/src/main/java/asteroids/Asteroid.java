/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

/**
 *
 * @author ASUS
 */
import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import java.util.Random;
public class Asteroid extends Character {
    private double rotasi;
    public Asteroid(int x, int y){
        super(new PolygonFactory().createPolygon(), x, y);
        Random acak = new Random();
        super.getCharacter().setRotate(acak.nextInt(360));
        
        int kecepatanAcak = 1 + acak.nextInt(10);
        for (int i = 0; i < kecepatanAcak; i++){
            accelerate();
        }
        this.rotasi = 0.5 - acak.nextDouble();
    }
    @Override public void move(){
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + rotasi);
    }
}
