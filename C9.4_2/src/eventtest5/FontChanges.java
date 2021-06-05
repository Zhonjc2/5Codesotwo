package eventtest5;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

public class FontChanges extends Application {
    TextArea ta1=new TextArea("字体样板 FontStereoType");
    ListView<Label> lv1=new ListView<Label>();
    ComboBox<Integer> cb1=new ComboBox<Integer>();
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        //设置文本区
        ta1.setWrapText(true);
        //设置列表视图
        //lv1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); 设置多选或单选的方法
        Label lBlack=new Label("黑色");
        lBlack.setStyle("-fx-text-fill: Black");
        Label lRed=new Label("红色");
        lRed.setStyle("-fx-text-fill: Red");
        Label lBlue=new Label("蓝色");
        lBlue.setStyle("-fx-text-fill: Blue");
        Label lGreen=new Label("绿色");
        lGreen.setStyle("-fx-text-fill: Green");
        Label lGold=new Label("金色");
        lGold.setStyle("-fx-text-fill: Gold");
        ArrayList<Label> color=new ArrayList<Label>(5);
        color.add(lBlack);
        color.add(lRed);
        color.add(lBlue);
        color.add(lGreen);
        color.add(lGold);
        ObservableList<Label> colorList = FXCollections.observableList(color);//将List转为ObservableList
        lv1.setItems(colorList);
        lv1.setOrientation(Orientation.VERTICAL);
        lv1.setPrefWidth(100);
        //设置组合框
        Integer[] fontSize=new Integer[]{10,20,30,40,50};
        cb1.setItems(FXCollections.observableArrayList(fontSize));
        cb1.setPromptText("选择字号");
        cb1.setPrefWidth(500);
        //设置边界面板
        BorderPane bp1=new BorderPane();
        bp1.setCenter(ta1);
        bp1.setTop(cb1);
        bp1.setLeft(lv1);
        bp1.setPrefSize(500,200);
        //设置场景
        Scene scene1=new Scene(bp1);
        //设置舞台
        primaryStage.setScene(scene1);
        primaryStage.show();
        //设置列表视图监听器方式一：利用鼠标事件
        /*lv1.setOnMousePressed(event -> {
            if(lv1.getSelectionModel().getSelectedItem()==lGold)ta1.setStyle("-fx-text-fill: Gold");
            else if(lv1.getSelectionModel().getSelectedItem()==lBlack)ta1.setStyle("-fx-text-fill: Black");
            else if(lv1.getSelectionModel().getSelectedItem()==lRed)ta1.setStyle("-fx-text-fill: Red");
            else if(lv1.getSelectionModel().getSelectedItem()==lBlue)ta1.setStyle("-fx-text-fill: Blue");
            else if(lv1.getSelectionModel().getSelectedItem()==lGreen)ta1.setStyle("-fx-text-fill: Green");
        });*/
        //设置列表视图监听器方式二：利用选中项属性变化产生的事件
        lv1.getSelectionModel().selectedItemProperty().addListener(observable -> {
            if(lv1.getSelectionModel().getSelectedItem()==lGold)ta1.setStyle("-fx-text-fill: Gold");
            else if(lv1.getSelectionModel().getSelectedItem()==lBlack)ta1.setStyle("-fx-text-fill: Black");
            else if(lv1.getSelectionModel().getSelectedItem()==lRed)ta1.setStyle("-fx-text-fill: Red");
            else if(lv1.getSelectionModel().getSelectedItem()==lBlue)ta1.setStyle("-fx-text-fill: Blue");
            else if(lv1.getSelectionModel().getSelectedItem()==lGreen)ta1.setStyle("-fx-text-fill: Green");
        });
        //设置组合框监视器
        cb1.setOnAction(event -> ta1.setFont(Font.font(cb1.getValue())));
    }
}
