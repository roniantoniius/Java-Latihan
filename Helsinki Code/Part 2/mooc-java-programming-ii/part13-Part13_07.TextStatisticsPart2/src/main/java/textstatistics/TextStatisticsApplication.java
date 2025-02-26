package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.util.Arrays;
public class TextStatisticsApplication extends Application{
    @Override
    public void start(Stage window){
        window.setTitle("Statistics App");
        
        BorderPane layout = new BorderPane();
        TextArea teks = new TextArea("");
        layout.setCenter(teks);
        
        Label labelKarakter = new Label("Letters: 0");
        Label labelJumlahKata = new Label("Words: 0");
        Label labelKataPanjang = new Label("The longest word is: ");
        
        teks.textProperty().addListener((ubah, lama, baru) -> {
            int karakterSekarang = baru.length();
            String[] kata = baru.split(" ");
            int jmlKata = kata.length;
            String kataPanjangs = Arrays.stream(kata)
                    .sorted((sebelum, sesudah) -> sesudah.length() - sebelum.length())
                    .findFirst()
                    .get();
            
            labelKarakter.setText("Letters: " + karakterSekarang);
            labelJumlahKata.setText("Words: " + jmlKata);
            labelKataPanjang.setText("The longest word is: " + kataPanjangs);
        });
        
        HBox horijontal = new HBox();
        horijontal.setSpacing(5);
        
        horijontal.getChildren().add(labelKarakter);
        horijontal.getChildren().add(labelJumlahKata);
        horijontal.getChildren().add(labelKataPanjang);
        
        layout.setBottom(horijontal);
        
        Scene sken = new Scene(layout);
        window.setScene(sken);
        window.show();
    }
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}