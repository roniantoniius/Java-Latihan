package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class MultipleViews extends Application {
    @Override
    public void start(Stage window) {
        Button back = new Button("To the second view!");
        Button forth = new Button("To the third view!");
        Button pertama = new Button("To the first view!");

        BorderPane layoutPertama = new BorderPane();
        layoutPertama.setTop(new Label("First view!"));
        layoutPertama.setCenter(back); // Menambahkan button ke tengah
        layoutPertama.setBottom(new Label("")); // Menambahkan label kosong di bawah jika diperlukan

        VBox layoutKedua = new VBox();
        layoutKedua.setSpacing(5);
        layoutKedua.getChildren().add(forth);
        layoutKedua.getChildren().add(new Label("Second view!"));

        GridPane layoutKetiga = new GridPane();
        layoutKetiga.add(new Label("Third view!"), 0, 0);
        layoutKetiga.add(pertama, 1, 1);

        Scene first = new Scene(layoutPertama);
        Scene second = new Scene(layoutKedua);
        Scene third = new Scene(layoutKetiga);

        // ini tombol di halaman awal
        back.setOnAction((event) -> {
            window.setScene(second);
        });

        // ini tombol di halaman setelah
        forth.setOnAction((event) -> {
            window.setScene(third);
        });

        pertama.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}