package Java2Labs.Lab_05As5;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class Lab_05Ch14Q13 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Apple", 20),
                new PieChart.Data("Others", 28),
                new PieChart.Data("Samsung", 26),
                new PieChart.Data("HTC", 26));
        PieChart pieChart = new PieChart(pieChartData);
        pieChart.setData(pieChartData);
        pieChart.setStartAngle(0);
        pieChart.setClockwise(false);
        primaryStage.setScene(new Scene(new Group(pieChart)));
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
