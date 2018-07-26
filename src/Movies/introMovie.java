package Movies;

import GUI.playScreen;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;


public class introMovie extends Application{
String[] names = new String[3];
Text t = new Text("");
String[] names1 = new String[3];

int clock = (int) System.currentTimeMillis() / 1000;
int currClock;
int timePassed;
int size = 50;
Font myCntFnt = new Font("Serif", size);
String[][] info = new String[10][10];

Button btCancel = new Button("Cancel");
Button btPrepare = new Button("Prepare Now");
Button btCont = new Button("We are prepared!");

BorderPane bPane = new BorderPane();

	@Override
	public void start(Stage primaryStage) throws Exception {

info[0][0] = "Arcanist";
info[0][1] = "Akira Celestine";

info[1][0] = "BloodRanger";
info[1][1] = "Airen Laracal";

info[2][0] = "Brawler";
info[2][1] = "Julthor Pyder";

info[3][0] = "Cleric";
info[3][1] = "Nalfar of the Light";

info[4][0] = "Hunter";
info[4][1] = "Frida Gessane";

info[5][0] = "Investigator";
info[5][1] = "Phexides";

info[6][0] = "Shaman";
info[6][1] = "Quiad Qupar";

info[7][0] = "Skald";
info[7][1] = "Baradeer Anumi";

info[8][0] = "Slayer";
info[8][1] = "Kib Nidale";

info[9][0] = "Swashbuckler";
info[9][1] = "Synestra The Bold";

for(int x = 0; x < 3; x++) {
	for(int y = 0; y < 10; y++) {
	if (names[x].equals(info[y][0])) {
		names1[x] = info[y][1]; 
	}
}
}

//put charName into char

		EventHandler<ActionEvent> eventHandler = e -> {
			currClock = (int) System.currentTimeMillis() / 1000;
			timePassed = currClock - clock;
			
			
			System.out.println(timePassed);
			if (timePassed > 0 && timePassed < 4) {
				t.setText(names1[0]);
			}
			if (timePassed > 4 && timePassed < 8) {
				t.setText(names1[0] + ", .." + names1[1]);
			}
			if (timePassed > 8 && timePassed < 12) {
				t.setText(names1[0] + ", .." + names1[1] + ", .." + names1[2]);
			}
			if(timePassed >= 13 && timePassed < 18) {
				t.setText("You're alive! All.. all of you are alive!");
			}
			if(timePassed >= 19 && timePassed < 22) {
				t.setText("I mean.. of course you are.., I never doubted you three!");
			}
			if (timePassed >= 23) {
				t.setText("Have you all prepared for your next mission?");
				bPane.setBottom(getVBox());
			}

			System.out.println(timePassed);
		};
		
		btPrepare.setOnAction(e -> {
playScreen ps = new playScreen();
try {
	ps.start(primaryStage);
}
catch (Exception ex) {
	System.out.println(ex);
}
			});
		
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(2000), eventHandler));
		animation.setCycleCount(50);
		animation.play();
		//set the stage and the scene
		Scene scene = new Scene(getBPane(), 1600, 1000);
		primaryStage.setTitle("A Humble Beginning...");
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
		bPane.setCenter(getGpane());
		return bPane;
	}
	
	public GridPane getGpane() {
		GridPane gPane = new GridPane();
		gPane.setStyle("-fx-background-color: #000000");
		gPane.setHgap(10);
		gPane.setVgap(10);
		t.setFill(Color.WHITE);
		t.setFont(Font.font("Times New Roman", 30));
		t.setText(names[0] + " " + names[1] + " " + names[2]);
		gPane.getChildren().add(t);
		gPane.setAlignment(Pos.CENTER);
		
		return gPane;
	}
	
	public VBox getVBox() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		pane.setStyle("-fx-background-color: #000000");
		pane.getChildren().addAll(btCont, btPrepare, btCancel);
		return pane;
	}
	
	public String[] getNames() {
		return names;
	}
	
	public void setNames(String[] names) {
		for (int x = 0; x < 3; x++) {
		this.names[x] = names[x];
		}

	
	}
}
