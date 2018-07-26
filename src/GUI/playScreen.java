package GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class playScreen extends Application{
	//Create Buttons tp use as  GUI Application
	Button btBack = new Button("Back");


	@Override
	public void start(Stage primaryStage) throws Exception {
		//eventually would like to throw Vbox into a borderpane and setup graphics on top.
		//using lambda expressions I handle each button Event

		btBack.setOnAction(e -> {
			
		});

		//set the stage and the scene
		Scene scene = new Scene(getBPane(), 1600, 1000);
		primaryStage.setTitle("Main Game Screen");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setWidth(1600);
		primaryStage.setHeight(1000);
		Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
		primaryStage.setX((primScreenBounds.getWidth() - primaryStage
				.getWidth()) / 2);
		primaryStage.setY((primScreenBounds.getHeight() - primaryStage
				.getHeight()) / 2);
        primaryStage.show();
	}
	
	
	
	public BorderPane getBPane() {
		BorderPane bPane = new BorderPane();
		bPane.setCenter(getGpane());
		bPane.setBottom(getHBox());
		bPane.setTop(getGpane());
		return bPane;
	}
	
	public GridPane getGpane() {
		GridPane gPane = new GridPane();
		gPane.setHgap(10);
		gPane.setVgap(10);
		gPane.setAlignment(Pos.CENTER);
		//gPane.add(lbNew, 0, 0);
		return gPane;
	}
	
	public HBox getHBox() {
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		return pane;
	}
	
}