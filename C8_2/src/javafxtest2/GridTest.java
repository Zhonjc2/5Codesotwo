package javafxtest2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
public class GridTest extends Application{
    public void start(Stage primaryStage){
        Label l1=new Label("我是一个标签");
        TextField tf1=new TextField();
        tf1.setPromptText("我是一个文本框");
        TextArea ta1=new TextArea();
        ta1.setPromptText("我是一个文本区");
        ta1.setWrapText(true);
        ta1.setPrefColumnCount(10);//单位是字，不是像素
        Button bu1=new Button("按钮");
        GridPane gpane1=new GridPane();
        gpane1.setVgap(10);
        gpane1.setHgap(10);
        gpane1.add(l1,0,0);
        gpane1.add(tf1,1,0);
        gpane1.add(ta1,0,1,2,1);
        gpane1.add(bu1,2,1);
        Scene scene1=new Scene(gpane1);
        primaryStage.setTitle("Example 2");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
