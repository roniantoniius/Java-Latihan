/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author ASUS
 */
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
public class InputView {
    private Dictionary daftarKamus;
    public InputView(Dictionary daftar){
        this.daftarKamus = daftar;
    }
    public Parent getView(){
        GridPane layout = new GridPane();
        Label judul1 = new Label("Word");
        TextField fieldKata = new TextField();
        Label judul2 = new Label("Translation");
        TextField fieldTranslasi = new TextField();
        Button tombol = new Button("Add the word pair");
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        layout.add(judul1, 0, 0);
        layout.add(fieldKata, 0, 1);
        layout.add(judul2, 0, 2);
        layout.add(fieldTranslasi, 0, 3);
        layout.add(tombol, 0, 4);
        
        tombol.setOnMouseClicked((even) -> {
            String kata = fieldKata.getText();
            String translasi = fieldTranslasi.getText();
            this.daftarKamus.add(kata, translasi);
            
            fieldKata.clear();
            fieldTranslasi.clear();
        });
        
        return layout;
    }
}
