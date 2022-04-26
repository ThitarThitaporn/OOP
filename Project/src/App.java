import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args){
        launch(args);
    }

    //Text area
    TextArea textArea = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        //scene
        Scene scene = new Scene(pane, 440, 675);

        primaryStage.setTitle("OOP project - Text Editor");
        primaryStage.setScene(scene);
        primaryStage.show();

        //button
        Button new_button = new Button("New");
        Button open_button = new Button("Open");
        Button save_button = new Button("Save");
        Button edit_button = new Button("Edit");

        pane.getChildren().add(new_button);
        new_button.relocate(10,10);
        pane.getChildren().add(open_button);
        open_button.relocate(80,10);
        pane.getChildren().add(save_button);
        save_button.relocate(160,10);
        pane.getChildren().add(edit_button);
        edit_button.relocate(230,10);

        //button action
        new_button.setOnAction(e -> create());
        open_button.setOnAction(e -> open());
        save_button.setOnAction(e -> save());
        edit_button.setOnAction(e -> edit());

        //text area
        pane.getChildren().add(textArea);
        textArea.relocate(10,50);
        textArea.setPrefColumnCount(35);
        textArea.setPrefRowCount(37);
    }

    //action
    public void create(){
        System.out.println("new");

        
    }
    public void open(){
        System.out.println("open");
    }
    public void save(){
        System.out.println("save");
    }
    public void edit(){
        System.out.println("edit");
    }
}