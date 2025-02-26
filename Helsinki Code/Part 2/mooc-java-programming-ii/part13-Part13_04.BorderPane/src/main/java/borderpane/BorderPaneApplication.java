package borderpane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
public class BorderPaneApplication extends Application {
    
    @Override
    public void start(Stage jendela){
        jendela.setTitle("Kompas");
        BorderPane layout = new BorderPane();
        layout.setTop(new Label("NORTH"));
        layout.setBottom(new Label("SOUTH"));
        layout.setRight(new Label("EAST"));
        
        Scene sken = new Scene(layout);
        jendela.setScene(sken);
        jendela.show();
    }
    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }
}