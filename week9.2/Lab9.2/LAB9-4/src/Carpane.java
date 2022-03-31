import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Carpane extends Pane{
     private double x = 0;
	private double y = 200;
	private double radius = 5;

     private Timeline animation;

     public Carpane() {
          drawCar();
          animation = new Timeline(new KeyFrame(Duration.millis(50), e -> move()));
          animation.setCycleCount(Timeline.INDEFINITE);
          animation.play();
     }

     public void drawCar() {
          getChildren().clear();
          Rectangle rectangle = new Rectangle(x,y-20,50,10);
          Polygon polygon = new Polygon(x + 10, y - 20, x + 20, y - 30, x + 30,y - 30, x + 40, y - 20);
          Circle c1 = new Circle(x + 15, y - 5, radius);
          Circle c2 = new Circle(x + 35, y - 5, radius);
          getChildren().addAll(rectangle,polygon,c1,c2);
     }

     public void pause() {
		animation.pause();
	}

     public void play() {
		animation.play();
	}

     public void increaseSpeed() {
		animation.setRate(animation.getRate() + 1);
          animation.play();
          System.out.println(animation.getRate());
	}

     public void decreaseSpeed() {
		animation.setRate(animation.getRate() > 0 ? animation.getRate() - 1 : animation.getRate());
          if (animation.getRate()==0){
               animation.stop();
          }
          System.out.println(animation.getRate());
	}

     public void move() {
		if (x <= getWidth()) {
			x += 1;	
		} 
		else
			x = 0;
		drawCar();
	}
}