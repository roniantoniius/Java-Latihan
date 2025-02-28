package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class JokeApplication extends Application {
    @Override
    public void start(Stage window){
        // 1. Layar utama yang ada tombol
        BorderPane layout = new BorderPane();
        Button tombolJoke = new Button("Joke");
        Button tombolJawaban = new Button("Answer");
        Button tombolPenjelasan = new Button("Explanation");
        
        HBox horiz = new HBox();
        horiz.setPadding(new Insets(20, 20, 20, 20));
        horiz.setSpacing(10);
        
        horiz.getChildren().addAll(tombolJoke, tombolJawaban, tombolPenjelasan);
        layout.setTop(horiz);
        
        // 2. Isi dari setiap tombol halaman
        StackPane layarAwal = createView("What do you call a bear with no teeth?");
        StackPane layarJawaban = createView("A gummy bear.");
        StackPane layarPenjelasan = createView("This is mainly because the bear eating too much gummy bear so the teeth fall off");
        
        tombolJoke.setOnAction((event) -> layout.setCenter(layarAwal));
        tombolJawaban.setOnAction((event) -> layout.setCenter(layarJawaban));
        tombolPenjelasan.setOnAction((xixixi) -> layout.setCenter(layarPenjelasan));
        
        layout.setCenter(layarAwal);
        
        Scene sken = new Scene(layout);
        window.setScene(sken);
        window.show();
    }

    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
