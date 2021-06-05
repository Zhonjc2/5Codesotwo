package eventtest4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.swing.*;

public class FontChange extends Application {
    RadioButton rbR=new RadioButton("红色");
    RadioButton rbG=new RadioButton("绿色");
    RadioButton rbB=new RadioButton("蓝色");
    CheckBox cbBold=new CheckBox("粗体");
    CheckBox cbItalic=new CheckBox("斜体");
    TextArea ta=new TextArea("字体样板 FontStereoType");
    Font defaultFont=Font.font("Verdana",FontWeight.NORMAL,FontPosture.REGULAR,16);
    Font boldFont=Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,16);
    Font italicFont=Font.font("Verdana",FontWeight.NORMAL,FontPosture.ITALIC,16);
    Font biFont=Font.font("Verdana",FontWeight.BOLD,FontPosture.ITALIC,16);
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        ta.setWrapText(true);
        ta.setFont(defaultFont);
        ta.setPrefColumnCount(13);
        rbR.setTextFill(Color.RED);
        rbG.setTextFill(Color.GREEN);
        rbB.setTextFill(Color.BLUE);
        ToggleGroup tGroup=new ToggleGroup();
        rbR.setToggleGroup(tGroup);
        rbG.setToggleGroup(tGroup);
        rbB.setToggleGroup(tGroup);
        FlowPane fppane1=new FlowPane(rbR,rbG,rbB);
        fppane1.setHgap(5);
        fppane1.setPrefWidth(50);
        FlowPane fppane2=new FlowPane(cbBold,cbItalic);
        fppane2.setHgap(5);
        fppane2.setPrefWidth(50);
        VBox vpane1=new VBox(fppane1,ta,fppane2);
        //注册监听器：
        SelectionHand csh=new SelectionHand();
        SelectionHand wsh=new SelectionHand();
        rbR.setOnAction(csh);
        rbG.setOnAction(csh);
        rbB.setOnAction(csh);
        cbBold.setOnAction(wsh);
        cbItalic.setOnAction(wsh);
        Scene scene1=new Scene(vpane1);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public class SelectionHand implements EventHandler<ActionEvent> {
        public void handle(ActionEvent event) {
            if(rbR.isSelected())ta.setStyle("-fx-text-fill:RED");
            else if(rbB.isSelected())ta.setStyle("-fx-text-fill:BLUE");
            else if(rbG.isSelected())ta.setStyle("-fx-text-fill:GREEN");
            if(cbBold.isSelected()&&cbItalic.isSelected())ta.setFont(biFont);
            else if(cbBold.isSelected())ta.setFont(boldFont);
            else if(cbItalic.isSelected())ta.setFont(italicFont);
            else ta.setFont(defaultFont);
            //事件发生后，按钮已经成为被选中状态，只需要以事件发生后的情况进行讨论即可。
        }
    }
}