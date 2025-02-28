package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    private Dictionary daftarKamus;
    @Override
    public void init() throws Exception{
        this.daftarKamus = new Dictionary();
    }
    @Override
    public void start(Stage window) throws Exception{
        BorderPane layout = new BorderPane();
        PracticeView layoutLatihan = new PracticeView(this.daftarKamus);
        InputView layoutInput = new InputView(this.daftarKamus);
        HBox navbar = new HBox();
        navbar.setPadding(new Insets(20, 20, 20, 20));
        navbar.setSpacing(10);
        
        Button tombolInput = new Button("Enter new words");
        Button tombolLatihan = new Button("Practice");
        
        navbar.getChildren().addAll(tombolInput, tombolLatihan);
        layout.setTop(navbar);
        
        tombolInput.setOnMouseClicked((even) -> layout.setCenter(layoutInput.getView()));
        tombolLatihan.setOnMouseClicked((even) -> layout.setCenter(layoutLatihan.getView()));
        
        layout.setCenter(layoutInput.getView());
        
        Scene sken = new Scene(layout, 400, 300);
        window.setScene(sken);
        window.show();
    }
    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
