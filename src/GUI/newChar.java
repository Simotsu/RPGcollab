package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Characters.character;
import Movies.introMovie;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class newChar extends Application{
	//Create Buttons tp use as  GUI Application
	Button btArc = new Button("Select Arcanist");
	Button btBlood = new Button("Select Blood Ranger");
	Button btBrawler = new Button("Select Brawler");
	Button btCleric = new Button("Select Cleric");
	Button btHunter = new Button("Select Hunter");
	Button btInvest = new Button("Select Investigator");
	Button btShaman = new Button("Select Shaman");
	Button btSkald = new Button("Select Skald");
	Button btSlayer = new Button("Select Slayer");
	Button btSwash = new Button("Select Swashbuckler");
	
	//images
	Image arcImg = new Image("images/arcanist.jpg", 200, 200, false, false);
	ImageView arc = new ImageView(arcImg);
	Image bloodImg = new Image("images/bloodranger.jpg", 200, 200, false, false);
	ImageView blood = new ImageView(bloodImg);
	Image brawlerImg = new Image("images/brawler.jpg", 200, 200, false, false);
	ImageView brawler = new ImageView(brawlerImg);
	Image clericImg = new Image("images/cleric.jpg", 200, 200, false, false);
	ImageView cleric = new ImageView(clericImg);
	Image hunterImg = new Image("images/hunter.jpg", 200, 200, false, false);
	ImageView hunter = new ImageView(hunterImg);
	Image investigatorImg = new Image("images/investigator.jpeg", 200, 200, false, false);
	ImageView investigator = new ImageView(investigatorImg);
	Image shamanImg = new Image("images/shaman.jpg", 200, 200, false, false);
	ImageView shaman = new ImageView(shamanImg);
	Image skaldImg = new Image("images/skald.jpg", 200, 200, false, false);
	ImageView skald = new ImageView(skaldImg);
	Image slayerImg = new Image("images/slayer.jpg", 200, 200, false, false);
	ImageView slayer = new ImageView(slayerImg);
	Image swashbucklerImg = new Image("images/swashbuckler.png", 200, 200, false, false);
	ImageView swashbuckler = new ImageView(swashbucklerImg);

	//global panes for easy manipulation of scene 
	BorderPane bPane = new BorderPane();
	GridPane gPane = new GridPane();
	
	//this is to hold all stats for our char DB
	int[] stats = new int[11];
	String[] selection = new String[3];
	int counter = 0, num = 3;
	Text t = new Text("");
	@Override
	public void start(Stage primaryStage) throws Exception {
		
//                                         IMAGE CLICKS                                       \\
arc.setOnMouseClicked(e -> {
	charInfo cI = new charInfo();
	try {
		Text arcText = new Text("Arcanist");
		cI.setName(arcText);
		cI.start(new Stage());
		
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});

blood.setOnMouseClicked(e -> {
	charInfo cI = new charInfo();
	try {
		Text arcText = new Text("BloodRanger");
		cI.setName(arcText);
		cI.start(new Stage());
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});

brawler.setOnMouseClicked(e -> {
	charInfo cI = new charInfo();
	try {
		Text arcText = new Text("Brawler");
		cI.setName(arcText);
		cI.start(new Stage());
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});

cleric.setOnMouseClicked(e -> {
	charInfo cI = new charInfo();
	try {
		Text arcText = new Text("Cleric");
		cI.setName(arcText);
		cI.start(new Stage());
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});

hunter.setOnMouseClicked(e -> {
	charInfo cI = new charInfo();
	try {
		Text arcText = new Text("Hunter");
		cI.setName(arcText);
		cI.start(new Stage());
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});

investigator.setOnMouseClicked(e -> {
	charInfo cI = new charInfo();
	try {
		Text arcText = new Text("Investigator");
		cI.setName(arcText);
		cI.start(new Stage());
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});

shaman.setOnMouseClicked(e -> {
	charInfo cI = new charInfo();
	try {
		Text arcText = new Text("Shaman");
		cI.setName(arcText);
		cI.start(new Stage());
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});

skald.setOnMouseClicked(e -> {
	charInfo cI = new charInfo();
	try {
		Text arcText = new Text("Skald");
		cI.setName(arcText);
		cI.start(new Stage());
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});

slayer.setOnMouseClicked(e -> {
	charInfo cI = new charInfo();
	try {
		Text arcText = new Text("Slayer");
		cI.setName(arcText);
		cI.start(new Stage());
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});

swashbuckler.setOnMouseClicked(e -> {
	charInfo cI = new charInfo();
	try {
		Text arcText = new Text("Swashbuckler");
		cI.setName(arcText);
		cI.start(new Stage());
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});
//                                                 BUTTON CLICKS                                          \\

		btArc.setOnAction(e -> {
			if (counter < 2) {
			try {
				selection[counter] = "Arcanist";
				statGeneration(selection[counter]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
			if (counter == 2) {
				introMovie iM = new introMovie();
				try {
					selection[counter] = "Arcanist";
					statGeneration(selection[counter]);
					if ((selection[0] == selection[1]) == false && 
							(selection[0] == selection[2]) == false && (selection[2] == selection[1]) == false)
					{
						iM.setNames(selection);
						iM.start(primaryStage);
					}
					else {
						getMessage();
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			counter++;
			getBPane().setTop(getHBox());
		});
		
		btBlood.setOnAction(e -> {
			if (counter < 2) {
			try {
				selection[counter] = "BloodRanger";
				statGeneration(selection[counter]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
			if (counter == 2) {
				introMovie iM = new introMovie();
				try {
					selection[counter] = "BloodRanger";
					statGeneration(selection[counter]);
					if ((selection[0] == selection[1]) == false && 
							(selection[0] == selection[2]) == false && (selection[2] == selection[1]) == false) {
						iM.setNames(selection);
						iM.start(primaryStage);
					}
					else {
						getMessage();
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			counter++;
			getBPane().setTop(getHBox());
		});
		
		btBrawler.setOnAction(e -> {
			if (counter < 2) {
			try {
				selection[counter] = "Brawler";
				statGeneration(selection[counter]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
			if (counter == 2) {
				introMovie iM = new introMovie();
				try {
					selection[counter] = "Brawler";
					statGeneration(selection[counter]);
					if ((selection[0] == selection[1]) == false && 
							(selection[0] == selection[2]) == false && (selection[2] == selection[1]) == false) {
						iM.setNames(selection);
						iM.start(primaryStage);
					}
					else {
						getMessage();
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			counter++;
			getBPane().setTop(getHBox());
		});
		
		btCleric.setOnAction(e -> {
			if (counter < 2) {
			try {
				selection[counter] = "Cleric";
				statGeneration(selection[counter]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
			if (counter == 2) {
				introMovie iM = new introMovie();
				try {
					selection[counter] = "Cleric";
					statGeneration(selection[counter]);
					if ((selection[0] == selection[1]) == false && 
							(selection[0] == selection[2]) == false && (selection[2] == selection[1]) == false) {
						iM.setNames(selection);
						iM.start(primaryStage);
					}
					else {
						getMessage();
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			counter++;
			getBPane().setTop(getHBox());
		});
		
		btHunter.setOnAction(e -> {
			if (counter < 2) {
			try {
				selection[counter] = "Hunter";
				statGeneration(selection[counter]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
			if (counter == 2) {
				introMovie iM = new introMovie();
				try {
					selection[counter] = "Hunter";
					statGeneration(selection[counter]);
					if ((selection[0] == selection[1]) == false && 
							(selection[0] == selection[2]) == false && (selection[2] == selection[1]) == false) {
						iM.setNames(selection);
						iM.start(primaryStage);
					}
					else {
						getMessage();
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			counter++;
			getBPane().setTop(getHBox());
		});
		
		btInvest.setOnAction(e -> {
			if (counter < 2) {
			try {
				selection[counter] = "Investigator";
				statGeneration(selection[counter]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
			if (counter == 2) {
				introMovie iM = new introMovie();
				try {
					selection[counter] = "Investigator";
					statGeneration(selection[counter]);
					if ((selection[0] == selection[1]) == false && 
							(selection[0] == selection[2]) == false && (selection[2] == selection[1]) == false) {
						iM.setNames(selection);
						iM.start(primaryStage);
					}
					else {
						getMessage();
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			counter++;
			getBPane().setTop(getHBox());
		});
		
		btShaman.setOnAction(e -> {
			if (counter < 2) {
			try {
				selection[counter] = "Shaman";
				statGeneration(selection[counter]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
			if (counter == 2) {
				introMovie iM = new introMovie();
				try {
					selection[counter] = "Shaman";
					statGeneration(selection[counter]);
					if ((selection[0] == selection[1]) == false && 
							(selection[0] == selection[2]) == false && (selection[2] == selection[1]) == false) {
						iM.setNames(selection);
						iM.start(primaryStage);
					}
					else {
						getMessage();
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			counter++;
			getBPane().setTop(getHBox());
		});
		
		btSkald.setOnAction(e -> {
			if (counter < 2) {
			try {
				selection[counter] = "Skald";
				statGeneration(selection[counter]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
			if (counter == 2) {
				introMovie iM = new introMovie();
				try {
					selection[counter] = "Skald";
					statGeneration(selection[counter]);
					if ((selection[0] == selection[1]) == false && 
							(selection[0] == selection[2]) == false && (selection[2] == selection[1]) == false) {
						iM.setNames(selection);
						iM.start(primaryStage);
					}
					else {
						getMessage();
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			counter++;
			getBPane().setTop(getHBox());
		});

		btSlayer.setOnAction(e -> {
			if (counter < 2) {
			try {
				selection[counter] = "Slayer";
				statGeneration(selection[counter]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
			if (counter == 2) {
				introMovie iM = new introMovie();
				try {
					selection[counter] = "Slayer";
					statGeneration(selection[counter]);
					if ((selection[0] == selection[1]) == false && 
							(selection[0] == selection[2]) == false && (selection[2] == selection[1]) == false) {
						iM.setNames(selection);
						iM.start(primaryStage);
					}
					else {
						getMessage();
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			counter++;
			getBPane().setTop(getHBox());
		});
		
		btSwash.setOnAction(e -> {
			if (counter < 2) {
			try {
				selection[counter] = "Swashbuckler";
				statGeneration(selection[counter]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
			if (counter == 2) {
				introMovie iM = new introMovie();
				try {
					selection[counter] = "Swashbuckler";
					statGeneration(selection[counter]);
					if ((selection[0] == selection[1]) == false && 
							(selection[0] == selection[2]) == false && (selection[2] == selection[1]) == false) {
						iM.setNames(selection);
						iM.start(primaryStage);
					}
					else {
						getMessage();
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			//when a hero is added use +1 to counter to make sure only 3 are clicked.
			counter++;
			//will reset the words at the top
			getBPane().setTop(getHBox());
		});
		
		//set the stage and the scene
		Scene scene = new Scene(getBPane(), 1800, 1000);
	    scene.getStylesheets().add("myCss.css");
		primaryStage.setTitle("Select A Character!");
		primaryStage.setWidth(1800);
		primaryStage.setHeight(1000);
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
		bPane.setCenter(getGpane());
		bPane.setTop(getHBox());
		return bPane;
	}
	
	public GridPane getGpane() {
		gPane.setHgap(20);
		gPane.setVgap(10);
		gPane.setAlignment(Pos.CENTER);
		gPane.add(getVBox1(), 0, 0);
		gPane.add(getVBox2(), 1, 0);
		gPane.add(getVBox3(), 2, 0);
		gPane.add(getVBox4(), 3, 0);
		gPane.add(getVBox5(), 4, 0);
		gPane.add(getVBox6(), 0, 1);
		gPane.add(getVBox7(), 1, 1);
		gPane.add(getVBox8(), 2, 1);
		gPane.add(getVBox9(), 3, 1);
		gPane.add(getVBox10(), 4, 1);
		
		return gPane;
	}
	
	
	//                                    TEXT BANNER AT TOP                                  \\
	public HBox getHBox() {
		HBox pane = new HBox();
		pane.setAlignment(Pos.CENTER);
		t.setId("fancytext");
		t.setText("Choose " + (num - counter) + " Unique Heros!");
		pane.getChildren().add(t);
		return pane;
	}
	
	//                                      ARCANIST                                        \\
	public VBox getVBox1() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		//image
		pane.getChildren().add(arc);
		//name
		pane.getChildren().add(new Text("Arcanist"));
		//selection
		pane.getChildren().add(btArc);
		//
		return pane;
	}
	
	//                                      BLOOD RANGER                                       \\
	public VBox getVBox2() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		
		//image
		pane.getChildren().add(blood);
		//name
		pane.getChildren().add(new Text("Blood Ranger"));
		//selection
		pane.getChildren().add(btBlood);
		//
		return pane;
	}
	
	//                                      BRAWLER                                        \\
	public VBox getVBox3() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		
		//image
		pane.getChildren().add(brawler);
		//name
		pane.getChildren().add(new Text("Brawler"));
		//selection
		pane.getChildren().add(btBrawler);
		//
		return pane;
	}
	
	//                                      CLERIC                                        \\
	public VBox getVBox4() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		
		//image
		pane.getChildren().add(cleric);
		//name
		pane.getChildren().add(new Text("Cleric"));
		//selection
		pane.getChildren().add(btCleric);
		//
		return pane;
	}
	
	
	//                                      HUNTER                                        \\
	public VBox getVBox5() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		
		//image
		pane.getChildren().add(hunter);
		//name
		pane.getChildren().add(new Text("Hunter"));
		//selection
		pane.getChildren().add(btHunter);
		//
		return pane;
	}
	
	//                                      INVESTIGATOR                                        \\
	public VBox getVBox6() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		
		//image
		pane.getChildren().add(investigator);
		//name
		pane.getChildren().add(new Text("Investigator"));
		//selection
		pane.getChildren().add(btInvest);
		//
		return pane;
	}
	
	//                                      SHAMAN                                       \\
	public VBox getVBox7() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		
		//image
		pane.getChildren().add(shaman);
		//name
		pane.getChildren().add(new Text("Shaman"));
		//selection
		pane.getChildren().add(btShaman);
		//
		return pane;
	}
	
	//                                      SKALD                                        \\
	public VBox getVBox8() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		
		//image
		pane.getChildren().add(skald);
		//name
		pane.getChildren().add(new Text("Skald"));
		//selection
		pane.getChildren().add(btSkald);
		//
		return pane;
	}
	
	//                                      SLAYER                                        \\
	public VBox getVBox9() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		//stats should be randomly generated upon creation
		//image
		pane.getChildren().add(slayer);
		//name
		pane.getChildren().add(new Text("Slayer"));
		//selection
		pane.getChildren().add(btSlayer);
		//
		return pane;
	}
	
	//                                      SWASHBUCKLER                                        \\
	public VBox getVBox10() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		
		//image
		pane.getChildren().add(swashbuckler);
		//name
		pane.getChildren().add(new Text("Swashbuckler"));
		//selection
		pane.getChildren().add(btSwash);
		//
		return pane;
	}
	
	//this method is when someone selects 3 or 2 of the same hero. It will give the user an error message in the form
	//of a popup and then delete any data that has been entered into the database
public void getMessage() {
	counter = -1;
	Alert alert = new Alert(AlertType.INFORMATION);
	alert.setTitle("Failure to Select Correctly");
	alert.setHeaderText("Please Reselect Heros");
	alert.setContentText("You have failed to select three unique heros. Please retry.");
	alert.showAndWait();
	try {
		Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rpg", "root", "");
		String query = "DELETE FROM characters WHERE charID < 3";
		PreparedStatement prepState = (PreparedStatement) myConn.prepareStatement(query);
		prepState.executeUpdate();
		myConn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	for (int x = 0; x < 3; x++) {
		selection[x] = "";
	}
}

//This will generate the stats that will be put into the characters attributes
//dont really need to do it like this but i think it is easier to follow than doing the calculations
//in each preparedstatement below this method
public void statGeneration(String name) {
	//order of stats: HP > STR > DEX > CON > INT > WIS > AC > FORT > REFL > SAVE > PERCEPTION 
	//call database here to collect and save stats
	
	//calculate HP here (6 + random#1-10)
	stats[0] = (6 + (int)(Math.random()*10));

	//STR - WIS(random#1-6 + random#1-6 + random#1-6 + random#1-2)
	for (int x = 1; x < 6; x++) {
		stats[x] = (1+(int)(Math.random()*6)) + (1+(int)(Math.random()*6)) + (1+(int)(Math.random()*6)) + (1+(int)(Math.random()*2));
	}

	//ARMOR CLASS - Should be dependant on hero + STR mod use 18 ATM ****CHANGE LATER*****
	stats[6] = 18;
	
	//FORT > REFL > SAVE (1 + random#1-4)
	for (int x = 7; x < 10; x++) {
		stats[x] = (1+(int)(Math.random()*4));
	}
	
	//PERCEPTION (12 + random#1-9)
	
	stats[10] = (12 + (int)(Math.random()*9));
	
	//shows all numbers in console
	for (int x = 0; x < 11; x++) {
		//stats[x] = 6+(int)(Math.random()*10);
	}
	//calls DB
	setUpChar(name);
	
}
//This method is used to call the database and input the values of the selected heros
	public void setUpChar(String name) {
		try {
			String[][] info = new String[10][10];
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

			String pName = "";
			for(int x = 0; x < 3; x++) {
				for(int y = 0; y < 10; y++) {
				if (name.equals(info[y][0])) {
					pName = info[y][1]; 

				}
			}
			}
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rpg", "root", "");
			String query = "INSERT INTO characters (charID, charJob, charHP, charSTR, charDEX, charCON, charINT, charWIS, "
					+ "charAC, charFORt, charREFL, charSAVE, charPerception, charATK, charRName) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement prepState = (PreparedStatement) myConn.prepareStatement(query);
			prepState.setInt(1, counter);
			prepState.setString(2, name);
			prepState.setInt(3, stats[0]);
			prepState.setInt(4, stats[1]);
			prepState.setInt(5, stats[2]);
			prepState.setInt(6, stats[3]);
			prepState.setInt(7, stats[4]);
			prepState.setInt(8, stats[5]);
			prepState.setInt(9, stats[6]);
			prepState.setInt(10, stats[7]);
			prepState.setInt(11, stats[8]);
			prepState.setInt(12, stats[9]);
			prepState.setInt(13, stats[10]);
			prepState.setInt(14, (1 + (int)(Math.random()*4) + stats[1]));
			prepState.setString(15, pName);
			prepState.executeUpdate();
			myConn.close();
		}
		catch (Exception exc) {
			System.out.println("You have been caught! *BOO* " + exc);
		}
	}
}