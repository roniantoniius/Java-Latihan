package asteroids;
import java.util.HashMap;
import java.util.Map;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;
public class AsteroidsApplication extends Application {
    @Override public void start(Stage window){
        Pane pane = new Pane();
        pane.setPrefSize(600, 400);
        
        Ship kapal = new Ship(150, 100);
        kapal.getCharacter().setRotate(30);
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
                kapal.move();
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
        return 0;
    }

}
