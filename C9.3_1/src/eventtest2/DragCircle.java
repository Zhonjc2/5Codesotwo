package eventtest2;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DragCircle extends Application {
    Circle c1=new Circle(500,350,50);
    Pane pane1=new Pane();
    protected double positionX;
    protected double positionY;
    public void start(Stage primaryStage) {
        pane1.getChildren().add(c1);
        Scene scene1=new Scene(pane1,1000,700);
/*        c1.setOnMousePressed(event -> {
            positionX=event.getX()/10-c1.getRadius();
            positionY=event.getY()/10-c1.getRadius();
        });
        c1.setOnMouseDragged(event -> {
            c1.setCenterX(event.getSceneX()-positionX);
            c1.setCenterY(event.getSceneY()-positionY);
        });*/
        c1.setOnMousePressed(event -> {
            positionX=event.getSceneX()-c1.getCenterX();
            positionY=event.getSceneY()-c1.getCenterY();
            c1.setCursor(Cursor.CROSSHAIR);
        });
        c1.setOnMouseDragged(event -> {
            c1.setCenterX(event.getSceneX()-positionX);
            c1.setCenterY(event.getSceneY()-positionY);
        });
        c1.setOnMouseReleased(event -> c1.setCursor(Cursor.DEFAULT));
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
