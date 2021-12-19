package Java2Labs.Lab_05As5;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lab_05Ch14Q19 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Polyline sin = new Polyline();
        sin.setStroke(Color.RED);
        ObservableList<Double> sinList = sin.getPoints();
        for (int x = 0; x <= 720; x++) {
            sinList.add(x + 50.0);
            sinList.add( 100 - 50.0 * Math.sin((x * Math.PI / 180)));
        }

        Polyline tan = new Polyline();
        tan.setStroke(Color.BLUE);
        ObservableList<Double> tanList = tan.getPoints();
        for (int x = 0; x <= 720; x++) {
            tanList.add(x + 50.0);
            tanList.add( 100 - 50.0 * Math.cos((x * Math.PI / 180)));
        }

        Polyline xAxis = new Polyline();
        ObservableList<Double> xAxisList = xAxis.getPoints();
        for (int i = 0; i <= 720; i++) {
            xAxisList.add(i + 50.0);
            xAxisList.add(100.0);
        }

        Polyline yAxis = new Polyline();
        ObservableList<Double> yAxisList = yAxis.getPoints();
        for (int i = 0; i <= 200; i++) {
            yAxisList.add(50+360.0);
            yAxisList.add((double) i);
        }

        Text xAxisValues[] = new Text[5];
        xAxisValues[0] = new Text(50 + 0 * 180,125,"–2\u03c0");
        xAxisValues[1] = new Text(50 + 1 * 180,125,"–\u03c0");
        xAxisValues[2] = new Text(50 + 2 * 180,125,"0");
        xAxisValues[3] = new Text(50 + 3 * 180,125,"\u03c0");
        xAxisValues[4] = new Text(50 + 4 * 180,125,"2\u03c0");

        Text yAxisValues[] = new Text[5];
        yAxisValues[0] = new Text(30 + 360.0, 10,"2");
        yAxisValues[1] = new Text(30 + 360.0, 50,"1");
        yAxisValues[2] = new Text(30 + 360.0, 100,"0");
        yAxisValues[3] = new Text(30 + 360.0, 150,"-1");
        yAxisValues[4] = new Text(30 + 360.0, 200,"-2");

        Group group = new Group();
        group.getChildren().addAll(sin,tan,xAxis,yAxis);
        for (int i = 0; i < 5; i++) {
            group.getChildren().add(xAxisValues[i]);
            group.getChildren().add(yAxisValues[i]);
        }
        primaryStage.setScene(new Scene(group));
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
