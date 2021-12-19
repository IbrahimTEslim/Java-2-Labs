package Java2Labs.Lab_05As5;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;

public class Lab_05Ch14Q1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        File file = new File("E:\\IbrahimProject\\Java_Projects\\Java2Labs\\src\\Java2Labs\\Lab_05As5\\1.png");
        Image image = new Image(file.toURI().toString());

        ImageView iv2 = new ImageView();
        iv2.setImage(image);
        iv2.setFitWidth(150);
        iv2.setPreserveRatio(true);
        iv2.setSmooth(true);
        iv2.setCache(true);

        ImageView iv3 = new ImageView(image);
        iv3.setFitWidth(150);
        iv3.setPreserveRatio(true);
        iv3.setSmooth(true);
        iv3.setCache(true);

        ImageView iv4 = new ImageView(image);
        iv4.setFitWidth(150);
        iv4.setPreserveRatio(true);
        iv4.setSmooth(true);
        iv4.setCache(true);

        ImageView iv5 = new ImageView(image);
        iv5.setFitWidth(150);
        iv5.setPreserveRatio(true);
        iv5.setSmooth(true);
        iv5.setCache(true);

        gridPane.add(iv2,0,0);
        gridPane.add(iv3,1,0);
        gridPane.add(iv4,0,1);
        gridPane.add(iv5,1,1);

        Group root = new Group();
        root.getChildren().add(gridPane);
        primaryStage.setScene(new Scene(root));
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
