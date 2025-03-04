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
import java.util.Random;
import javafx.scene.shape.Polygon;
public class PolygonFactory {
    public Polygon createPolygon(){
        Random acak = new Random();
        double ukuran = acak.nextInt(10) + 10;
        Polygon bentuk = new Polygon();
        double cos1 = Math.cos(Math.PI * 2 / 5);
        double cos2 = Math.cos(Math.PI / 5);
        double sin1 = Math.sin(Math.PI * 2 / 5);
        double sin2 = Math.sin(Math.PI * 4 / 5);
        bentuk.getPoints().addAll(
            ukuran, 0.0,
            ukuran * cos1, -1 * ukuran * sin1,
            -1 * ukuran * cos2, -1 * ukuran * sin2,
            -1 * ukuran * cos2, ukuran * sin2,
            ukuran * cos1, ukuran * sin1);
        for (int i = 0; i < bentuk.getPoints().size(); i++){
            int ganti = acak.nextInt(5) - 2;
            bentuk.getPoints().set(i, bentuk.getPoints().get(i) + ganti);
        }
        return bentuk;
    }
}
