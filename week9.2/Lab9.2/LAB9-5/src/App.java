import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Fan fan = new Fan();

        Button Pause = new Button("Pause");
		Button Resume = new Button("Resume");
		Button Reverse = new Button("Reverse");
		HBox hBox = new HBox(5);
		hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(Pause, Resume, Reverse);

        BorderPane borderPane = new BorderPane();
		borderPane.setCenter(fan);
		borderPane.setBottom(hBox);

        Pause.setOnAction(e -> fan.pause());
        Resume.setOnAction(e -> fan.play());
        Reverse.setOnAction(e -> fan.reverse());
        
        Scene scene = new Scene(borderPane, 250, 250);

        primaryStage.setTitle("Week 9 Program 5");
        primaryStage.setScene(scene);
        primaryStage.show();

        fan.requestFocus();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}