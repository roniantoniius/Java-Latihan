package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Map;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
public class ShanghaiApplication extends Application {
    @Override
    public void start(Stage window){
        NumberAxis sumbuX = new NumberAxis(2007, 2017, 1);
        NumberAxis sumbuY = new NumberAxis();
        sumbuX.setLabel("Year");
        sumbuY.setLabel("Ranking");
        
        LineChart<Number, Number> grafikGaris = new LineChart<>(sumbuX, sumbuY);
        grafikGaris.setTitle("University of Helsinki, Shanghai ranking");
        
        XYChart.Series shanghai = new XYChart.Series();
        shanghai.getData().add(new XYChart.Data(2007, 73));
        shanghai.getData().add(new XYChart.Data(2008, 68));
        shanghai.getData().add(new XYChart.Data(2009, 72));
        shanghai.getData().add(new XYChart.Data(2010, 72));
        shanghai.getData().add(new XYChart.Data(2011, 74));
        shanghai.getData().add(new XYChart.Data(2012, 73));
        shanghai.getData().add(new XYChart.Data(2013, 76));
        shanghai.getData().add(new XYChart.Data(2014, 73));
        shanghai.getData().add(new XYChart.Data(2015, 67));
        shanghai.getData().add(new XYChart.Data(2016, 56));
        shanghai.getData().add(new XYChart.Data(2016, 56));
        
        grafikGaris.getData().add(shanghai);
        Scene sken = new Scene(grafikGaris);
        window.setScene(sken);
        window.show();
    }
    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
