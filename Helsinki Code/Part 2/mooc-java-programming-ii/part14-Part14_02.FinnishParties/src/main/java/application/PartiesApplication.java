package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Map;
import java.util.HashMap;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartiesApplication extends Application {
    @Override public void start(Stage window){
        NumberAxis sumbuX = new NumberAxis(1968, 2008, 4);
        NumberAxis sumbuY = new NumberAxis();
        LineChart<Number, Number> grafikGaris = new LineChart<>(sumbuX, sumbuY);
        grafikGaris.setTitle("Relative support of the parties");
        Map<String, Map<Integer, Double>> nilai = ambilData();
        nilai.keySet().stream().forEach(grup -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(grup);
            nilai.get(grup).entrySet().stream().forEach(isiData -> {
                data.getData().add(new XYChart.Data(isiData.getKey(), isiData.getValue()));
            });
            grafikGaris.getData().add(data);
        });
        Scene sken = new Scene(grafikGaris);
        window.setScene(sken);
        window.show();
    }
    public Map<String, Map<Integer, Double>> ambilData(){
        File file = new File("partiesdata.tsv");
        Map<String, Map<Integer, Double>> daftar = new HashMap<>();
        try (Scanner scanner = new Scanner(file)) {
            if (scanner.hasNextLine()){
                String daftarKolom = scanner.nextLine();
                // array isinya daftar tahun kalau indeks lebih 0
                String[] kolom = daftarKolom.split("\t");
                while (scanner.hasNextLine()){
                    String baris = scanner.nextLine();
                    // array isinya nilai di baris suatu kategori
                    String[] daftarNilai = baris.split("\t");
                    if (daftarNilai.length > 0){
                        String kategori = daftarNilai[0];
                        Map<Integer, Double> isi = new HashMap<>();
                        for (int i = 1; i < kolom.length; i++){
                            int tahun = Integer.parseInt(kolom[i]);
                            if (daftarNilai[i].contains("-")){
                                double nilai = 0.0;
                                isi.put(tahun, nilai);
                            } else {
                                double nilai = Double.parseDouble(daftarNilai[i]);
                                isi.put(tahun, nilai);
                            }
                        }
                        daftar.put(kategori, isi);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File tidak ditemukan: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Format data tidak valid: " + e.getMessage());
        }
        return daftar;
    }
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
