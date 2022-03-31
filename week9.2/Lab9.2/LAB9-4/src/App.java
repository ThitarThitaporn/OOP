import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Carpane pane = new Carpane();

        pane.setOnMousePressed(e -> pane.pause());
		pane.setOnMouseReleased(e -> pane.play());

        pane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.D) {
				pane.increaseSpeed();
			}
			else if (e.getCode() == KeyCode.A) {
				pane.decreaseSpeed();
			}
		});
        
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("Week 9 Program 4");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}