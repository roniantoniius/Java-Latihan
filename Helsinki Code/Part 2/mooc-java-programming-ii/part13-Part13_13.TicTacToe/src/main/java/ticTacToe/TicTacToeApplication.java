package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    private final Button[][] tombols = new Button[3][3];

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        GridPane layoutGrid = new GridPane();
        Label judul = new Label("Turn: X");
        judul.setFont(javafx.scene.text.Font.font("Monospaced", 40));
        Label review = new Label("");
        review.setFont(javafx.scene.text.Font.font("Monospaced", 40));

        window.setTitle("Tic Tac Toe");
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setTop(judul);
        layout.setBottom(review);

        final boolean[] sekarang = {true};

        for (int i = 0; i < 3; i++) { // Perbaikan indeks (0-2)
            for (int j = 0; j < 3; j++) { // Perbaikan indeks (0-2)
                Button tombol = new Button(" ");
                tombol.setFont(javafx.scene.text.Font.font("Monospaced", 40));
                tombols[i][j] = tombol; // Simpan tombol dengan indeks yang benar

                tombol.setOnMouseClicked((event) -> {
                    if (tombol.getText().equals(" ")) {
                        if (sekarang[0]) {
                            tombol.setText("X");
                        } else {
                            tombol.setText("O");
                        }

                        sekarang[0] = !sekarang[0];
                        if (sekarang[0]) {
                            judul.setText("Turn: X");
                        } else {
                            judul.setText("Turn: O");
                        }

                        if (menang()) {
                            judul.setText("The end!");
                        } else if (isGridFull()) {
                            judul.setText("The end!");
                        }
                    }
                });
                layoutGrid.add(tombol, j, i);
            }
        }

        layout.setCenter(layoutGrid);
        Scene sken = new Scene(layout);
        window.setScene(sken);
        window.show();
    }

    private boolean isGridFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tombols[i][j].getText().equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean menang() {
        // Mengecek horizontal dan vertikal
        for (int i = 0; i < 3; i++) {
            if (tombols[i][0].getText().equals(tombols[i][1].getText()) && 
                tombols[i][1].getText().equals(tombols[i][2].getText()) &&
                !tombols[i][0].getText().equals(" ")) {
                return true; // Baris penuh dengan X atau O
            }

            if (tombols[0][i].getText().equals(tombols[1][i].getText()) && 
                tombols[1][i].getText().equals(tombols[2][i].getText()) &&
                !tombols[0][i].getText().equals(" ")) {
                return true; // Kolom penuh dengan X atau O
            }
        }

        // Mengecek diagonal utama (↘)
        if (tombols[0][0].getText().equals(tombols[1][1].getText()) &&
            tombols[1][1].getText().equals(tombols[2][2].getText()) &&
            !tombols[0][0].getText().equals(" ")) {
            return true;
        }

        // Mengecek diagonal sekunder (↙)
        if (tombols[0][2].getText().equals(tombols[1][1].getText()) &&
            tombols[1][1].getText().equals(tombols[2][0].getText()) &&
            !tombols[0][2].getText().equals(" ")) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
}