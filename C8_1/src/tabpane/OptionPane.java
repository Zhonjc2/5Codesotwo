package tabpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class OptionPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Font font1=new Font("黑体",50);
        Color color1=new Color(0.3,0.5,0.8,0.7);
        Color color2=new Color(0.7,0.5,0.8,0.7);
        Label l1=new Label("我是标签");
        l1.setTextFill(color2);
        Button b1=new Button("我是按钮");
        b1.setTextFill(color1);
        RadioButton rb1=new RadioButton("我是单选按钮1");
        RadioButton rb2=new RadioButton("我是单选按钮2");
        TextField tf1=new TextField();
        tf1.setPrefColumnCount(20);
        tf1.setPromptText("我是文本框");
        PasswordField pf1=new PasswordField();
        pf1.setPromptText("我是密码框");
        TextArea ta1=new TextArea();
        ta1.setWrapText(true);
        ta1.setPrefColumnCount(20);
        ta1.setPrefRowCount(10);
        ta1.setPromptText("我是文本区");
        ScrollPane spane1=new ScrollPane(ta1);
        CheckBox chb1=new CheckBox("我是复选框");
        ImageView iv1=new ImageView("IO.png");
        TabPane tp1=new TabPane();
        Pane pane1=new Pane();
        Circle c1=new Circle(500);
        c1.centerXProperty().bind(primaryStage.widthProperty().divide(2));
        c1.centerYProperty().bind(primaryStage.heightProperty().divide(2));
        pane1.getChildren().add(c1);
        HBox hbpane1=new HBox(l1,b1,rb1,rb2,tf1,pf1,spane1,chb1);
        Tab tab1=new Tab("Option 1",pane1),tab2=new Tab("Option 2",hbpane1),tab3=new Tab("Option 3",iv1);
        tp1.getTabs().addAll(tab1,tab2,tab3);
        iv1.setPreserveRatio(true);
        iv1.setFitHeight(1000);
        Scene scene1=new Scene(tp1);
        primaryStage.setScene(scene1);
        primaryStage.show();
        Stage extraStage=new Stage(StageStyle.UNDECORATED);
        ListView<Node> lv1=new ListView<Node>(pane1.getChildren());
        ChoiceBox<Tab> chob1=new ChoiceBox<Tab>(tp1.getTabs());
        VBox pane2=new VBox();
        Label el=new Label("欢迎使用JavaFX!");
        Label el1=new Label("已显示主舞台");
        el.setTextFill(color1);
        el.setFont(font1);
        el1.setTextFill(color2);
        el1.setFont(new Font(30));
        el1.setTranslateY(50);
        pane2.setAlignment(Pos.CENTER);//注意这里要用VBox的Alignment方法，使在其上的节点居中，而不是让Label对象使用Alignment方法。
        pane2.setStyle("-fx-background-color:#ece8bf;-fx-border-color:white;-fx-border-width:5");
        pane2.setPadding(new Insets(10,10,10,10));
        pane2.getChildren().addAll(el,el1);
        Scene scene2=new Scene(pane2);//设置场景背景颜色并不会显示，因为他会被面板盖住
        pane2.setPrefSize(500,250);
        extraStage.setScene(scene2);
        extraStage.show();
    }
}
