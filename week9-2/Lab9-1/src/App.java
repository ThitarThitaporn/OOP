import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();

        ImageView img1 = new ImageView(new Image("England.jpg"));
        img1.setFitHeight(200);
        img1.setFitWidth(300);
        grid.add(img1, 0, 0);

        ImageView img2 = new ImageView(new Image("Canada.png"));
        img2.setFitHeight(200);
        img2.setFitWidth(300);
        grid.add(img2, 1, 0);

        ImageView img3 = new ImageView(new Image("China.png"));
        img3.setFitHeight(200);
        img3.setFitWidth(300);
        grid.add(img3, 0, 1);

        ImageView img4 = new ImageView(new Image("USA.png"));
        img4.setFitHeight(200);
        img4.setFitWidth(300);
        grid.add(img4, 1, 1);

        Scene scene = new Scene(grid);
        primaryStage.setTitle("Week 9 Program 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}