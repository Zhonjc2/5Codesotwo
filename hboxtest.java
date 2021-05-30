package javafxtest4;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class hboxtest extends Application{
    public void start(Stage primaryStage){
        ImageView iv1=new ImageView("icon.png");
        Circle c1=new Circle(10,Color.BLUEVIOLET);
        Button b1=new Button("    按钮1",c1);//Graphic Node包括所有的图像类节点，包括Shape、ImageView、MediaView等等
        Button b2=new Button("按钮2",iv1);
        b1.setTextFill(Color.WHITE);
        b2.setTextFill(Color.WHITE);
        b1.setPrefSize(135,70);
        b2.setPrefSize(135,70);
        b1.setStyle("-fx-background-color: #313032;-fx-border-color: white");
        b2.setStyle("-fx-background-color: #313032;-fx-border-color: white");
        HBox hbpane=new HBox(10,b1,b2);
        hbpane.setPadding(new Insets(10,10,10,10));
        Scene scene1=new Scene(hbpane);
        hbpane.setStyle("-fx-background-color: black");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
