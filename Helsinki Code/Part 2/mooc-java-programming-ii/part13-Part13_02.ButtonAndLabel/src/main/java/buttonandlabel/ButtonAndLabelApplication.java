package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class ButtonAndLabelApplication extends Application {
    
    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }
    @Override
    public void start(Stage jendela){
        jendela.setTitle("Button dan Label");
        Button tombolBaru = new Button("This is a button");
        Label labelBaru = new Label("Text element");
        
        FlowPane komponenGrup = new FlowPane();
        komponenGrup.getChildren().add(tombolBaru);
        komponenGrup.getChildren().add(labelBaru);
        
        Scene adegan = new Scene(komponenGrup);
        jendela.setScene(adegan);
        jendela.show();
    }

}
