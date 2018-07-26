package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class mainGUI extends Application{
	//Create Buttons tp use as  GUI Application
	Button btNew = new Button("New Game");
	Button btContinue = new Button("Continue");
	Button btHigh = new Button("High Scores");
	Button btExit = new Button("Exit Game");

	@Override
	public void start(Stage primaryStage) throws Exception {

//in the newGame button I included a DB Connection that will erase any current entries in the character table, therefor allowing entries.
		//This will start a new game here
		btNew.setOnAction(e -> {
			newChar stage = new newChar();
			try {
				Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rpg", "root", "");
				String query = "DELETE FROM characters WHERE charID < 3";
				PreparedStatement prepState = (PreparedStatement) myConn.prepareStatement(query);
				prepState.executeUpdate();
				myConn.close();
				stage.start(primaryStage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btContinue.setOnAction(e -> {
			cont stage = new cont();
			try {
				stage.start(primaryStage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btHigh.setOnAction(e -> {
			highScore stage = new highScore();
			try {
				stage.start(primaryStage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btExit.setOnAction(e -> {
			newChar nc = new newChar();
			try {
				nc.start(primaryStage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		//set the stage and the scene
		Scene scene = new Scene(getVBox(), 700, 700);
		primaryStage.setTitle("RolePlaying MegaGame For The Masses!");
		primaryStage.setScene(scene);
		primaryStage.show();
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
		gPane.add(btNew, 0, 0);
		gPane.add(btContinue, 0, 1);
		gPane.add(btHigh, 0, 2);
		gPane.add(btExit, 0, 3);
		return gPane;
	}
	
	public HBox getHBox() {
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		return pane;
	}
	
	public VBox getVBox() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(btNew, btContinue, btHigh, btExit);
		return pane;
	}
	
}