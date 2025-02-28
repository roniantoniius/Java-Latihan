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
public class PracticeView {
    private Dictionary daftarKamus;
    private String kataAcak;
    public PracticeView(Dictionary kamus){
        this.daftarKamus = kamus;
        this.kataAcak = this.daftarKamus.getRandomWord();
    }
    public Parent getView(){
        GridPane layout = new GridPane();
        Label perintah = new Label("Translate the word '" + this.kataAcak + "'");
        TextField terjemahan = new TextField();
        Button tombol = new Button("Check");
        Label review = new Label("");
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        layout.add(perintah, 0, 0);
        layout.add(terjemahan, 0, 1);
        layout.add(tombol, 0, 2);
        layout.add(review, 0, 3);
        
        tombol.setOnMouseClicked((even) -> {
            String translate = terjemahan.getText();
            if (this.daftarKamus.get(kataAcak).equals(translate)){
                review.setText("Correct!");
            } else {
                review.setText("Incorrect!");
                return;
            }
            
            this.kataAcak = this.daftarKamus.getRandomWord();
            perintah.setText("Translate the word '" + this.kataAcak + "'");
            terjemahan.clear();
        });
        
        return layout;
    }
}
