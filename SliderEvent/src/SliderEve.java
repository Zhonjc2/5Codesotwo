import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SliderEve extends Application {
	Slider sRed=new Slider(0,255,0);
	Slider sGreen=new Slider(0,255,0);
	Slider sBlue=new Slider(0,255,0);
	Slider sRound=new Slider(0,100,0);
	FlowPane fpRed=new FlowPane(new Label("红色"),sRed);
	FlowPane fpGreen=new FlowPane(new Label("绿色"),sGreen);
	FlowPane fpBlue=new FlowPane(new Label("蓝色"),sBlue);
	FlowPane fpRound=new FlowPane(new Label("圆角"),sRound);
	Rectangle colorRec=new Rectangle(200,200);
	public void start(Stage primaryStage) {
		ImageView mi=new ImageView("MI.png");
		mi.setPreserveRatio(true);
		mi.setFitWidth(100);
		StackPane spane=new StackPane(colorRec,mi);
		sRed.setPrefWidth(164);
		sGreen.setPrefWidth(164);
		sBlue.setPrefWidth(164);
		sRound.setPrefWidth(164);
		sRed.setShowTickLabels(true);
		sGreen.setShowTickLabels(true);
		sBlue.setShowTickLabels(true);
		sRound.setShowTickLabels(true);
		fpRed.setPrefWidth(200);
		fpBlue.setPrefWidth(200);
		fpGreen.setPrefWidth(200);
		fpRound.setPrefWidth(200);
		fpRed.setHgap(10);
		fpBlue.setHgap(10);
		fpGreen.setHgap(10);
		fpRound.setHgap(10);
		VBox vbpane=new VBox(spane,fpRed,fpGreen,fpBlue,fpRound);
		vbpane.setPadding(new Insets(10,10,10,10));
		vbpane.setSpacing(20);
		Scene mainScene=new Scene(vbpane);
		primaryStage.setScene(mainScene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("小米Logo变化器");
		primaryStage.show();
		InvalidationListener EventHand=new InvalidationListener() {
			public void invalidated(Observable obProperty) {
				colorRec.setFill(Color.rgb((int)sRed.getValue(),(int)sGreen.getValue(),(int)sBlue.getValue()));
				colorRec.setArcHeight(sRound.getValue()*2);
				colorRec.setArcWidth(sRound.getValue()*2);
			}
		};
		sRed.valueProperty().addListener(EventHand);
		sGreen.valueProperty().addListener(EventHand);
		sBlue.valueProperty().addListener(EventHand);
		sRound.valueProperty().addListener(EventHand);
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
