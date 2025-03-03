package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SmileyApplication extends Application {
    @Override public void start(Stage window){
        Canvas kanvas = new Canvas(640, 480);
        GraphicsContext isiKanvas = kanvas.getGraphicsContext2D();
        BorderPane layout = new BorderPane();
        layout.setCenter(kanvas);
        
        isiKanvas.setFill(Color.BLACK);
        isiKanvas.fillRect(120, 120, 50, 50);
        isiKanvas.fillRect(320, 120, 50, 50);
        isiKanvas.fillRect(120, 360, 250, 50);
        isiKanvas.fillRect(70, 310, 50, 50);
        isiKanvas.fillRect(370, 310, 50, 50);
        
        kanvas.setOnMouseDragged((even) -> {
            double lokasiX = even.getX();
            double lokasiY = even.getY();
            isiKanvas.fillOval(lokasiX, lokasiY, 40, 40);
        });
         Scene sken = new Scene(layout, Color.WHITE);
         window.setTitle("Gambar Senyum");
         window.setScene(sken);
         window.show();
    }
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
