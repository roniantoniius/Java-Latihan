package myFirstApplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
//public class MyFirstApplication extends Application {

public class MyFirstApplication extends Application {
    @Override
    public void start(Stage primaryStage) { // object Stage sebagai program window
        
        
        primaryStage.setTitle("My first application");
        primaryStage.show();
//        Label label = new Label("Hello, JavaFX 17!");
//        Scene scene = new Scene(label, 400, 300);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("JavaFX 17 Test");
//        primaryStage.show();

        // di bawah ini adalah Scene sebagai isi dari window mungkin?;
        
        // button sbagai ui components yaitu children dari FlowPane object
        Button konfir = new Button("Konfirmasi");
        Button batal = new Button("Batal");
        FlowPane grupKomponen = new FlowPane();
        grupKomponen.getChildren().add(konfir);
        grupKomponen.getChildren().add(batal);
        Scene value = new Scene(grupKomponen);
        
        primaryStage.setScene(value);
        primaryStage.show();
        // Urutan: Windiw > Scene > FlowPane (salah satu object yang bertanggung jawab dalam UI components)
    }

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
//        launch(args);
    }

}
