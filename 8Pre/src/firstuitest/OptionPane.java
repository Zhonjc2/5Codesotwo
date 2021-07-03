package firstuitest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class OptionPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Color bc=new Color(1,0.5,0.7,0.7);
        Color nc=new Color(0.5,0.5,1,0.5);
        Label l1=new Label("10");
        l1.setFont(Font.font(500));
        l1.setTextFill(nc);
        Circle c1=new Circle(500,500,500,nc);
        Image i1=new Image("IO.png");
        Tab tab1=new Tab("Option 1",l1);
        Tab tab2=new Tab("Option 2",c1);
        Tab tab3=new Tab("Option 3",new ImageView(i1));
        TabPane t=new TabPane();
//        c1.centerXProperty().bind(t.widthProperty().divide(2));
//        c1.centerYProperty().bind(t.heightProperty().divide(2));
        t.getTabs().addAll(tab1,tab2,tab3);
        Scene scene=new Scene(t,1000,1000,bc);
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
        /*Stage sss=new Stage();
        Pane aa=new Pane();
        c1.centerXProperty().bind(aa.widthProperty().divide(2));
        c1.centerYProperty().bind(aa.heightProperty().divide(2));
        aa.getChildren().add(c1);
        sss.setScene(new Scene(aa,1000,1000));
        sss.show();*/
    }
}
