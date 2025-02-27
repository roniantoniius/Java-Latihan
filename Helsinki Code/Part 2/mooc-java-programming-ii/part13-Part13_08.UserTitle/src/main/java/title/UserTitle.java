package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class UserTitle extends Application {
    @Override
    public void start(Stage window){
        Parameters param = getParameters();
        String judul = param.getNamed().get("title");
        
        window.setTitle(judul);
        window.show();
    }
}
