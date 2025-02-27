package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    @Override
    public void start(Stage window){
        // 1. Halaman Pertama
        Button tombol1 = new Button("Start");
        Label label1 = new Label("Enter your name to start.");
        TextField pass1 = new TextField();
        Label label2 = new Label("");
        
        GridPane layout1 = new GridPane();
        layout1.add(label1, 0,0);
        layout1.add(pass1, 0,1);
        layout1.add(tombol1, 0,2);
        layout1.add(label2, 0,3);
        
        layout1.setPrefSize(300, 180);
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));
        
        Scene sken1 = new Scene(layout1);
        
        
        // 2. Halaman setelah
        Label label3 = new Label("Welcome ");
        
        StackPane layout2 = new StackPane();
        layout2.setPrefSize(300, 180);
        layout2.getChildren().add(label3);
        layout2.setAlignment(Pos.CENTER);
        
        Scene sken2 = new Scene(layout2);
        
        tombol1.setOnAction((value) -> {
            label3.setText(label3.getText() + pass1.getText() + "!");
            window.setScene(sken2);
        });
        
        window.setScene(sken1);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
