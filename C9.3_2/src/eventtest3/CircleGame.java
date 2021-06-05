package eventtest3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static java.lang.Integer.parseInt;

public class CircleGame extends Application {
    Circle c1=new Circle(500,350,50);
    Pane pane1=new Pane();
    Circle c2=new Circle(300,300,70);
    public static int score=0;
    Label scoreLabel=new Label(score+"");
    public void restart(){
        score=0;
        scoreLabel.setText("0");
        c1.setCenterX(500);
        c1.setCenterY(350);
    }
    public void changePosition(){
        TextField tfx=new TextField();
        TextField tfy=new TextField();
        tfx.setPrefColumnCount(5);
        tfy.setPrefColumnCount(5);
        Label lbx=new Label("圆心X坐标：");
        Label lby=new Label("圆心Y坐标：");
        Button b1=new Button("确认");
        Button b2=new Button("取消");
        GridPane gpane=new GridPane();
        gpane.add(lbx,0,0);
        gpane.add(lby,0,1);
        gpane.add(tfx,1,0);
        gpane.add(tfy,1,1);
        gpane.add(b1,0,2);
        gpane.add(b2,1,2);
        gpane.setPadding(new Insets(10,10,10,10));
        gpane.setVgap(10);
//        gpane.setAlignment();如何设置网格面板中控件对于网格的居中方式
        Scene positionScene=new Scene(gpane);
        Stage cpStage=new Stage();
        cpStage.setScene(positionScene);
        cpStage.setResizable(false);
        cpStage.show();
        tfx.setPromptText(c2.getCenterX()+"");
        tfy.setPromptText(c2.getCenterY()+"");
        b1.setDisable(true);
        InvalidationListener textListen=new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                if(!tfx.getText().equals("")&&!tfy.getText().equals(""))b1.setDisable(false);
                else b1.setDisable(true);
            }
        };
        tfx.textProperty().addListener(textListen);
        tfy.textProperty().addListener(textListen);
        b1.setOnAction(event -> {
                c2.setCenterX(parseInt(tfx.getText()));
                c2.setCenterY(parseInt(tfy.getText()));
                cpStage.close();
        });
        b2.setOnAction(event -> cpStage.close());
    }
    public void help(){
        ImageView help=new ImageView("Help.png");
        help.setPreserveRatio(true);
        help.setFitHeight(300);
        Label helpLabel=new Label("通过键盘控制黑色的圆\n将黑色的圆移动到黄色圆内\n获得10分",help);//\n可以直接加入到字符串中
        helpLabel.setFont(Font.font(30));
        Button ok=new Button("确定");
        Pane pane=new Pane(helpLabel,ok);
        ok.setLayoutX(525);
        ok.setLayoutY(220);
        Scene scene1=new Scene(pane);
        Stage helpStage=new Stage();
        helpStage.setResizable(false);
        helpStage.setScene(scene1);
        helpStage.show();
        ok.setOnAction(event -> helpStage.close());
    }
    public void about(){
        ImageView javaFX=new ImageView("JavaFX.PNG");
        javaFX.setPreserveRatio(true);
        javaFX.setFitWidth(200);
        Label about=new Label("本程序\n由JavaFX制作\n ©️ COPYRIGHT ZHONJC\n",javaFX);
        about.setGraphicTextGap(10);
        about.setFont(Font.font(10));
        about.setContentDisplay(ContentDisplay.LEFT);
        Pane aboutPane=new Pane(about);
        aboutPane.setPrefWidth(320);
        aboutPane.setPrefHeight(85);
        aboutPane.setStyle("-fx-background-color: WHITE");
        Scene aboutScene=new Scene(aboutPane);
        Stage aboutStage=new Stage();
        aboutStage.setScene(aboutScene);
        aboutStage.show();
    }
    public void start(Stage primaryStage) {
        Font scoreFont=new Font(50);
        scoreLabel.setLayoutX(50);
        scoreLabel.setLayoutY(50);
        scoreLabel.setFont(scoreFont);
        pane1.getChildren().addAll(c2,c1,scoreLabel);
        Scene scene1=new Scene(pane1,1000,1000);
        c2.setFill(Color.GOLD);
        c1.setOnKeyPressed(event -> {
            if(event.getCode()== KeyCode.UP)c1.setCenterY(c1.getCenterY()-20);
            else if(event.getCode()== KeyCode.DOWN)c1.setCenterY(c1.getCenterY()+20);
            else if(event.getCode()== KeyCode.LEFT)c1.setCenterX(c1.getCenterX()-20);
            else if(event.getCode()== KeyCode.RIGHT)c1.setCenterX(c1.getCenterX()+20);
            else {
                c1.setCenterX(500);
                c1.setCenterY(350);
            }
            double c1Left=c1.getCenterX()-c1.getRadius();
            double c2Left=c2.getCenterX()-c2.getRadius();
            double c1Right=c1.getCenterX()+c1.getRadius();
            double c2Right=c2.getCenterX()+c2.getRadius();
            double c1Top=c1.getCenterY()-c1.getRadius();
            double c2Top=c2.getCenterY()-c2.getRadius();
            double c1Bottom=c1.getCenterY()+c1.getRadius();
            double c2Bottom=c2.getCenterY()+c2.getRadius();
            if(c1Left>=c2Left&&c1Right<=c2Right&&c1Top>=c2Top&&c1Bottom<=c2Bottom){
                score+=10;
                pane1.getChildren().remove(scoreLabel);
                scoreLabel.setText(score+"");
                pane1.getChildren().add(scoreLabel);
                c2.setCenterX(Math.random()*750);
                c2.setCenterY(Math.random()*750);
            }
        });
        MenuBar mbar=new MenuBar();
        Menu optionMenu=new Menu("选项");
        Menu helpMenu=new Menu("帮助");
        MenuItem restart=new MenuItem("重新开始");
        MenuItem exit=new MenuItem("退出");
        MenuItem changePositon=new MenuItem("修改目标圆的位置");
        MenuItem help=new MenuItem("帮助");
        MenuItem about=new MenuItem("关于");
        optionMenu.getItems().addAll(restart,new SeparatorMenuItem(),exit,new SeparatorMenuItem(),changePositon);
        helpMenu.getItems().addAll(help,new SeparatorMenuItem(),about);
        exit.setAccelerator(KeyCombination.keyCombination("Ctrl + X"));
        mbar.getMenus().addAll(optionMenu,helpMenu);
        mbar.setPrefWidth(1500);
        optionMenu.setOnAction(event -> {
            switch (((MenuItem) event.getTarget()).getText()) {
                case "重新开始":restart();break;
                case "退出":Platform.exit();break;
                case "修改目标圆的位置":changePosition();
            }
            //getTarget方法和getSource方法有什么区别？
        });
        helpMenu.setOnAction(event -> {
            switch(((MenuItem)event.getTarget()).getText()){
                case "帮助":help();break;
                case "关于":about();break;
            }
        });
        pane1.getChildren().add(mbar);
        primaryStage.setScene(scene1);
        primaryStage.show();
        primaryStage.setResizable(true);
        c1.requestFocus();
    }
}