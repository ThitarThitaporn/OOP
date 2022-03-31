import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class App extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		Button btPause = new Button("Pause");
		Button btResume = new Button("Resume");
		Button btReverse = new Button("Reverse");

		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(
			btPause, btResume, btReverse);

		FanPane fan = new FanPane();

		Slider slider = new Slider();
		slider.setMax(10);

		fan.rateProperty().bind(slider.valueProperty());

		BorderPane pane = new BorderPane();
		pane.setTop(paneForButtons);
		pane.setCenter(fan);
		pane.setBottom(slider);

		btPause.setOnAction(e -> {
			fan.pause();
		});

		btResume.setOnAction(e -> {
			fan.play();
		});

		btReverse.setOnAction(e -> {
			fan.reverse();
		});

		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Week 9 Program 6");
		primaryStage.setScene(scene);
		primaryStage.show();
}    
     public static void main(String[] args) {
          launch(args);
     }
}