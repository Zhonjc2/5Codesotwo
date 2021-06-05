package eventtest3;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveCircle extends Application {
    Circle c1=new Circle(500,350,50);
    Pane pane1=new Pane();
    public void start(Stage primaryStage) {
        pane1.getChildren().add(c1);
        Scene scene1=new Scene(pane1,1000,700);
        c1.setOnKeyPressed(event -> {
            if(event.getCode()== KeyCode.UP)c1.setCenterY(c1.getCenterY()-5);
            else if(event.getCode()== KeyCode.DOWN)c1.setCenterY(c1.getCenterY()+5);
            else if(event.getCode()== KeyCode.LEFT)c1.setCenterX(c1.getCenterX()-5);
            else if(event.getCode()== KeyCode.RIGHT)c1.setCenterX(c1.getCenterX()+5);
            else {
                c1.setCenterX(500);
                c1.setCenterY(350);
            }
        });
        primaryStage.setScene(scene1);
        primaryStage.show();
        primaryStage.setResizable(false);
        c1.requestFocus();
    }
}
