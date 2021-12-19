package Java2Labs.Lab_05As5;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lab_05Ch14Q4 extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Text t1 = new Text();
        t1.setX(10.0f);
        t1.setY(100);
        t1.setCache(true);
        t1.setText("Text");
        t1.setFill(new Color(Math.random(),Math.random(),Math.random(),1f));
        t1.setOpacity(Math.random());
        t1.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        t1.setRotate(270);
        Text t2 = new Text();
        t2.setX(60.0f);
        t2.setY(100);
        t2.setCache(true);
        t2.setText("Text");
        t2.setFill(new Color(Math.random(),Math.random(),Math.random(),1f));
        t2.setOpacity(Math.random());
        t2.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        t2.setRotate(270);
        Text t3 = new Text();
        t3.setX(110.0f);
        t3.setY(100);
        t3.setCache(true);
        t3.setText("Text");
        t3.setFill(new Color(Math.random(),Math.random(),Math.random(),1f));
        t3.setOpacity(Math.random());
        t3.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        t3.setRotate(270);
        Text t4 = new Text();
        t4.setX(160.0f);
        t4.setY(100);
        t4.setCache(true);
        t4.setText("Text");
        t4.setFill(new Color(Math.random(),Math.random(),Math.random(),1f));
        t4.setOpacity(Math.random());
        t4.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        t4.setRotate(270);
        Text t5 = new Text();
        t5.setX(210.0f);
        t5.setY(100);
        t5.setCache(true);
        t5.setText("Text");
        t5.setFill(new Color(Math.random(),Math.random(),Math.random(),1f));
        t5.setOpacity(Math.random());
        t5.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        t5.setRotate(270);

        Group group = new Group();
        group.getChildren().add(t1);
        group.getChildren().add(t2);
        group.getChildren().add(t3);
        group.getChildren().add(t4);
        group.getChildren().add(t5);

        primaryStage.setScene(new Scene(group));
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
