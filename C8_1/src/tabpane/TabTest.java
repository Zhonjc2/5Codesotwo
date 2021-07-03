package tabpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TabTest extends Application {
    public void start(Stage primaryStage){
        Tab tab1=new Tab("Tab1",new Label("IO.png"));
        Tab tab2=new Tab("Tab2",new Label("I am a label."));
        Tab tab3=new Tab("Tab3",new ImageView("IO.png"));
        TabPane tp1=new TabPane(tab1,tab2,tab3);
        Scene scene1=new Scene(tp1);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
