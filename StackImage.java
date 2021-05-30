package javafxtest3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StackImage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Image image1=new Image("/*图片路径*/");
        ImageView iv1=new ImageView(image1);
        Color color=new Color(1,1,1,1);
        StackPane spane1=new StackPane(iv1);
        spane1.setPrefSize(10,10);
        spane1.setRotate(-45);
        Scene scene1=new Scene(spane1);
        scene1.setFill(Color.rgb(26,36,42));
        primaryStage.setScene(scene1);
        primaryStage.show();

    }
}
