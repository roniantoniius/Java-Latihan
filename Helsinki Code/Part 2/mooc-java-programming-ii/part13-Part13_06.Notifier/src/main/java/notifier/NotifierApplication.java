package notifier;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
public class NotifierApplication extends Application {
    @Override
    public void start(Stage window){
        window.setTitle("Notifier App");
        VBox layout = new VBox();
        layout.setSpacing(10);
        TextField atas = new TextField();
        Button tombol = new Button("Update");
        Label hasil = new Label();
        tombol.setOnAction((fungsi) -> {
            hasil.setText(atas.getText());
        });
        
        layout.getChildren().addAll(atas, tombol, hasil);
        
        Scene scen = new Scene(layout);
        window.setScene(scen);
        window.show();
        
    }
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
