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
public class TextStatisticsApplication extends Application{
    @Override
    public void start(Stage window){
        window.setTitle("Statistics App");
        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea(""));
        HBox horijontal = new HBox();
        horijontal.setSpacing(5);
        horijontal.getChildren().add(new Label("Letters: 0"));
        horijontal.getChildren().add(new Label("Words: 0"));
        horijontal.getChildren().add(new Label("The longest word is:"));
        layout.setBottom(horijontal);
        
        Scene sken = new Scene(layout);
        window.setScene(sken);
        window.show();
    }
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
