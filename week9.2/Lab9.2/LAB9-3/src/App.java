import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        CustomClockPane clock = new CustomClockPane(((int) (Math.random() * 12)),(int) (Math.random() * 30), 0);
        clock.setSecondHandVisible(false);
        String time = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label currentTimeLabel = new Label(time);

        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(currentTimeLabel);
        BorderPane.setAlignment(currentTimeLabel, Pos.TOP_CENTER);
        
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("Week 9 Program 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}