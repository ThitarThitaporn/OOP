import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();

        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                TextField textField = new TextField();
                textField.setText(String.valueOf((int) (Math.random() * 2)));
                textField.setAlignment(Pos.CENTER);
                textField.setMaxWidth(40);
                gridPane.add(textField,c,r);
            }
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Week 9 Program 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}