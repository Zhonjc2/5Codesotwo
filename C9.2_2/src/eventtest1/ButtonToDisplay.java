package eventtest1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonToDisplay extends Application {
    Button bt1=new Button("点击按钮显示文字");
    TextField tf1=new TextField();
    public void start(Stage primaryStage){
        FlowPane fpane=new FlowPane(tf1,bt1);
        fpane.setHgap(20);
        Scene scene1=new Scene(fpane,350,30);
        bt1.setOnMousePressed(event -> tf1.setText("你好！"));
        bt1.setOnMouseReleased(event -> tf1.clear());
        primaryStage.setScene(scene1);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
