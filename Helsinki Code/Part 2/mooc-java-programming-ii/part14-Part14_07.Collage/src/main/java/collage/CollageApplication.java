package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();
        
        for (int i = 0; i < width / 2; i++){
            for (int j = 0; j < height / 2; j++){
                Color warnaBaru = imageReader.getColor(i * 2, j * 2);
                imageWriter.setColor(i, j, warnaBaru);
            }
        }
        
        for (int i = 0; i < width / 2; i++){
            for (int j = 0; j < height / 2; j++){
                Color warnaBaru = imageReader.getColor(i*2, j*2);
                imageWriter.setColor(i + width / 2, j, warnaBaru);
            }
        }
        
        for (int i = 0; i < width / 2; i++){
            for (int j = 0; j < height / 2; j++){
                Color warnaBaru = imageReader.getColor(i*2, j*2);
                imageWriter.setColor(i, j + height / 2, warnaBaru);
            }
        }
        
        for (int i = 0; i < width / 2; i++){
            for (int j = 0; j < height / 2; j++){
                Color warnaBaru = imageReader.getColor(i*2, j*2);
                imageWriter.setColor(i + width / 2, j + height / 2, warnaBaru);
            }
        }
        imageReader = targetImage.getPixelReader();
        for (int i = 0; i < height; i ++){
            for (int j = 0; j < width; j++){
                Color warnaPiksel = imageReader.getColor(j, i);
                double red = 1 - warnaPiksel.getRed();
                double biru = 1 - warnaPiksel.getBlue();
                double hijau = 1 - warnaPiksel.getGreen();
                double opacity = warnaPiksel.getOpacity();
                
                Color warnaBaru = new Color(red, hijau, biru, opacity);
                imageWriter.setColor(j, i, warnaBaru);
            }
        }

        ImageView image = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().add(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(CollageApplication.class);
    }

}
