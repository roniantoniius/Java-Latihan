package asteroids;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
public class AsteroidsApplication extends Application {
    public static int WIDTH = 300;
    public static int HEIGHT = 200;
    @Override public void start(Stage window){
        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);
        Text teks = new Text(10, 20, "Points: 0");
        pane.getChildren().add(teks);
        
        AtomicInteger koin = new AtomicInteger();
        
        Ship kapal = new Ship(150, 100);
        kapal.getCharacter().setRotate(30);
        List<Projectile> peluru = new ArrayList<>();
        List<Asteroid> daftarMeteor = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Random acak = new Random();
            Asteroid meteor = new Asteroid(acak.nextInt(100), acak.nextInt(100));
            daftarMeteor.add(meteor);
        }
        daftarMeteor.forEach(meteor -> pane.getChildren().add(meteor.getCharacter()));
        pane.getChildren().add(kapal.getCharacter());
        
        Scene sken = new Scene(pane);
        Point2D gerak = new Point2D(1, 0);
        
        // proses untuk gerakin kapal, kita pakai HashTable atau Map biar ngga ada delay untuk ganti arah
        Map<KeyCode, Boolean> tombolDipencet = new HashMap<>();
        sken.setOnKeyPressed(e -> {
            tombolDipencet.put(e.getCode(), Boolean.TRUE);
        });
        sken.setOnKeyReleased(e -> {
            tombolDipencet.put(e.getCode(), Boolean.FALSE);
        });
        
        // method untuk gerakin si kapal
        new AnimationTimer() {
            @Override public void handle(long sekarang){
                if (tombolDipencet.getOrDefault(KeyCode.LEFT, false)){
                    kapal.turnLeft();
                }
                if (tombolDipencet.getOrDefault(KeyCode.RIGHT, false)){
                    kapal.turnRight();
                }
                if (tombolDipencet.getOrDefault(KeyCode.UP, false)){
                    kapal.accelerate();
                }
                if (tombolDipencet.getOrDefault(KeyCode.DOWN, false)){
                    kapal.slowDown();
                }
                if (tombolDipencet.getOrDefault(KeyCode.SPACE, false) && peluru.size() < 5){
                    Projectile amo = new Projectile((int) kapal.getCharacter().getTranslateX(), (int) kapal.getCharacter().getTranslateY());
                    amo.getCharacter().setRotate(kapal.getCharacter().getRotate());
                    peluru.add(amo);
                    
                    amo.accelerate();
                    amo.setMovement(amo.getMovement().normalize().multiply(3));
                    
                    pane.getChildren().add(amo.getCharacter());
                }
                kapal.move();
                daftarMeteor.forEach(metor -> metor.move());
                peluru.forEach(amo -> amo.move());
                peluru.forEach(amo -> {
                    List<Projectile> peluruHapus = peluru.stream().filter(pelor -> {
                        List<Asteroid> tabrakan = daftarMeteor.stream()
                            .filter(tabrak -> tabrak.collide(amo))
                            .collect(Collectors.toList());
                        
                        if (tabrakan.isEmpty()){
                            return false;
                        }
                        tabrakan.stream().forEach(tertabrak -> {
                            daftarMeteor.remove(tertabrak);
                            pane.getChildren().remove(tertabrak.getCharacter());
                        });
                        return true;
                    }).collect(Collectors.toList());
                    
                    peluruHapus.forEach(action -> {
                        pane.getChildren().remove(action.getCharacter());
                        peluru.remove(action);
                    });
                    
                });
                
                peluru.forEach(amo -> {
                    daftarMeteor.forEach(meteor -> {
                        if (amo.collide(meteor)){
                            amo.setAlive(false);
                            meteor.setAlive(false);
                        }
                    });
                    if (!amo.isAlive()){
                        teks.setText("Points: " + koin.addAndGet(1000));
                    }
                });
                
                peluru.stream()
                        .filter(amo -> !amo.isAlive())
                        .forEach(amo -> pane.getChildren().remove(amo.getCharacter()));
                
                peluru.removeAll(peluru.stream()
                        .filter(amo -> !amo.isAlive())
                        .collect(Collectors.toList()));
                
                daftarMeteor.stream()
                        .filter(meteor -> !meteor.isAlive())
                        .forEach(meteor -> pane.getChildren().remove(meteor.getCharacter()));
                
                daftarMeteor.removeAll(daftarMeteor.stream()
                        .filter(meteor -> !meteor.isAlive())
                        .collect(Collectors.toList()));
                
                daftarMeteor.forEach(metor -> {
                    if (kapal.collide(metor)){
                        stop();
                    }
                });
                if(Math.random() < 0.005){
                    Asteroid meteor = new Asteroid(WIDTH, HEIGHT);
                    if (!meteor.collide(kapal)){
                        daftarMeteor.add(meteor);
                        pane.getChildren().add(meteor.getCharacter());
                    }
                }
            }
        }.start();
        
        window.setTitle("Asteroids!");
        window.setScene(sken);
        window.show();
    }
    public static void main(String[] args) {
        launch(AsteroidsApplication.class);
    }
    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }
}