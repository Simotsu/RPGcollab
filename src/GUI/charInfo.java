package GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class charInfo extends Application{
	//Create Buttons tp use as  GUI Application
	Button btBack = new Button("Back");
	Text name = new Text();

	
	public void start(Stage primaryStage) throws Exception {


		btBack.setOnAction(e -> {
			try {
				primaryStage.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		//set the stage and the scene
		Scene scene = new Scene(getBPane(), 500, 800);
		primaryStage.setTitle(getName().getText() + " Information");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setWidth(500);
		primaryStage.setHeight(900);
		Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
		primaryStage.setX((primScreenBounds.getWidth() - primaryStage
				.getWidth()) / 2);
		primaryStage.setY((primScreenBounds.getHeight() - primaryStage
				.getHeight()) / 2);
        primaryStage.show();
	}

	
	
	public Text getName() {
		return name;
	}



	public void setName(Text name) {
		this.name = name;
	}



	public BorderPane getBPane() {
		BorderPane bPane = new BorderPane();
		bPane.setCenter(getGpane());
		//bPane.setBottom(getVBox());
		bPane.setTop(getVBox());
		return bPane;
	}
	
	public GridPane getGpane() {
		GridPane gPane = new GridPane();
		gPane.setHgap(10);
		gPane.setVgap(10);
		gPane.setAlignment(Pos.CENTER);
		gPane.add(btBack, 0, 0);
		return gPane;
	}
	
	public VBox getVBox() {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		Image Img;
		ImageView img;
		//this checks to see if it needs a different extension applied to the image instead of jpg
		if (name.getText().toLowerCase().equals("investigator") == true) {
			Img = new Image("images/" + name.getText().toLowerCase() + ".jpeg", 400, 500, false, false);
			img = new ImageView(Img);
		}
		else if (name.getText().toLowerCase().equals("swashbuckler") == true) {
			Img = new Image("images/" + name.getText().toLowerCase() + ".png", 400, 500, false, false);
			img = new ImageView(Img);
		}
		else
		{
		 Img = new Image("images/" + name.getText().toLowerCase() + ".jpg", 400, 500, false, false);
		 img = new ImageView(Img);
		}
		pane.getChildren().add(img);
		String info1 = getInfo();
		pane.getChildren().add(new Text(info1));
		//add information in a new Text object. This way can be centered easily.
		//pane.getChildren().add(null);
		return pane;
	}
	public String getInfo() {
		String[][] info = new String[10][10];
		info[0][0] = "Arcanist";
		info[0][1] = "Akara Celestine\n"
					+ "Age: 26\n\n"
					+ "Starting Items\n\n"
					+ "Starting Abilities\n\n"
					+ "CLASS SKILLS: Appraise (Int), Craft (Int), Fly (Dex),\n"
					+ "Knowledge (all) (Int), Linguistics (Int), Profession (Wis),\n"
					+ "Spellcraft (Int), and Use Magic Device (Cha).\n\n"
					+ "Weapon and Armor Proficiencies: : Arcanists are proficient\n "
					+ "with all simple weapons. They are not proficient with any type\n"
					+ "of armor or shield. Armor interferes with an arcanist’s \n"
					+ "gestures, which can cause her spells with somatic components to fail.";
		
		info[1][0] = "BloodRanger";
		info[1][1] = "Airen Laracal\n"
				+ "Age: 21\n\n"
				+ "Starting Items\n\n"
				+ "Starting Abilities\n\n"
				+ "CLASS SKILLS: Acrobatics (Dex), Climb (Str), Craft (Int),\n"
				+ "Handle Animal (Cha), Intimidate (Cha), Knowledge (arcana) (Int), \n"
				+ "Perception (Wis), Ride (Dex), Spellcraft (Int), Survival (Wis),\n"
				+ "and Swim (Str).\n\n "
				+ "Weapon and Armor Proficiencies: Bloodragers are proficient with \n"
				+ "all simple and martial weapons, light armor, medium armor, and\n"
				+ "shields (except tower shields). A bloodrager can cast bloodrager\n"
				+ "spells while wearing light armor or medium armor without incurring\n"
				+ "the normal arcane spell failure chance. ";
		
		info[2][0] = "Brawler";
		info[2][1] = "Julthor Pyder\n"
				+ "Age: 34\n\n"
				+ "Starting Items\n\n"
				+ "Starting Abilities\n\n"
				+ "CLASS SKILLS: Acrobatics (Dex), Climb (Str), Craft (Int),\n"
				+ "Escape Artist (Dex), Handle Animal (Cha), Intimidate (Cha), \n"
				+ "Knowledge (dungeoneering) (Int), Knowledge (local) (Int), \n"
				+ "Perception (Wis), Profession (Wis), Ride (Dex), \n"
				+ "Sense Motive (Wis), and Swim (Str). \n\n"
				+ "Weapon and Armor Proficiencies: All simple weapons plus\n"
				+ "the handaxe, the short sword, and weapons from the close\n"
				+ "weapon group. She is proficient with light armor and shields\n"
				+ "(except tower shields). ";
		
		info[3][0] = "Cleric";
		info[3][1] = "Nalfar, of the Light\n"
				+ "Age: 27\n\n"
				+ "Starting Items\n\n"
				+ "Starting Abilities\n\n"
				+ "CLASS SKILLS: Appraise (Int), Craft (Int), Diplomacy (Cha), \n"
				+ "Heal (Wis), Knowledge (arcana) (Int), Knowledge (history) (Int),\n"
				+ "Knowledge (nobility) (Int), Knowledge (planes) (Int), \n"
				+ "Knowledge (religion) (Int), Linguistics (Int), Profession (Wis), \n"
				+ "Sense Motive (Wis), and Spellcraft (Int). \n\n"
				+ "Weapon and Armor Proficiencies: All simple weapons, light armor,\n"
				+ "medium armor, and shields (except tower shields).";
		
		info[4][0] = "Hunter";
		info[4][1] = "Frida Gessane\n"
				+ "Age: 24\n\n"
				+ "Starting Items\n\n"
				+ "Starting Abilities\n\n"
				+ "CLASS SKILLS: Climb (Str), Craft (Int), Handle Animal (Cha), \n"
				+ "Heal (Wis), Intimidate (Cha), Knowledge (dungeoneering) (Int), \n"
				+ "Knowledge (geography) (Int), Knowledge (nature) (Int), \n"
				+ "Perception (Wis), Profession (Wis), Ride (Dex), Spellcraft (Int),\n"
				+ "Stealth (Dex), Survival (Wis), and Swim (Str).\n\n "
				+ "Weapon and Armor Proficiencies: All simple and martial weapons, \n"
				+ "as well as light armor, medium armor, and shields (except tower shields).";
		
		info[5][0] = "Investigator";
		info[5][1] = "Phexides\n"
				+ "Age: Unknown\n\n"
				+ "Starting Items\n\n"
				+ "Starting Abilities\n\n"
				+ "CLASS SKILLS: Acrobatics (Dex), Appraise (Int), Bluff (Cha), Climb (Str),\n"
				+ "Craft (Int), Diplomacy (Cha), Disable Device (Dex), Disguise (Cha), \n"
				+ "Escape Artist (Dex), Heal (Wis), Intimidate (Cha), Knowledge (all) (Int), \n"
				+ "Linguistics (Int), Perception (Wis), Perform (Cha), Profession (Wis), \n"
				+ "Sense Motive (Wis), Sleight of Hand (Dex), Spellcraft (Int), Stealth (Dex),\n"
				+ "and Use Magic Device (Cha). \n\n"
				+ "Weapon and Armor Proficiencies: All simple weapons, plus the hand crossbow,\n"
				+ "rapier, sap, shortbow, short sword, and sword cane. They are proficient with\n"
				+ "light armor, but not with shields. ";
		
		info[6][0] = "Shaman";
		info[6][1] = "Quiad Qupar\n"
				+ "Age: 26\n\n"
				+ "Starting Items\n\n"
				+ "Starting Abilities\n\n"
				+ "CLASS SKILLS: Craft (Int), Diplomacy (Cha), Fly (Dex), Handle Animal (Cha), \n"
				+ "Heal (Wis), Knowledge (nature) (Int), Knowledge (planes) (Int),\n"
				+ "Knowledge (religion) (Int), Profession (Wis), Ride (Dex), Spellcraft (Int), \n"
				+ "and Survival (Wis).\n\n"
				+ "Weapon and Armor Proficiencies: All simple weapons as well as with light armor\n"
				+ "and medium armor. ";
		
		info[7][0] = "Skald";
		info[7][1] = "Baradeer Anumi\n"
				+ "Age: 26\n\n"
				+ "Starting Items\n\n"
				+ "Starting Abilities\n\n"
				+ "CLASS SKILLS: Acrobatics (Dex), Appraise (Int), Bluff (Cha),\n"
				+ "Climb (Str), Craft (Int), Diplomacy (Cha), Escape Artist (Dex),\n"
				+ "Handle Animal (Cha), Intimidate (Cha), Knowledge (all) (Int), \n"
				+ "Linguistics (Int), Perception (Wis),\n"
				+ "Perform (oratory, percussion, sing, string, wind) (Cha), \n"
				+ "Profession (Wis), Ride (Dex), Sense Motive (Wis), Spellcraft (Int),\n"
				+ "Swim (Str), and Use Magic Device (Cha). \n\n"
				+ "Weapon and Armor Proficiencies: All simple and martial weapons,\n"
				+ "as well as light armor, medium armor, and shields (except tower shields).";
		info[8][0] = "Slayer";
		info[8][1] = "Kib Nidale\n"
				+ "Age: 26\n\n"
				+ "Starting Items\n\n"
				+ "Starting Abilities\n\n"
				+ "CLASS SKILLS: Acrobatics (Dex), Bluff (Cha), Climb (Str), Craft (Int),\n"
				+ "Disguise (Cha), Heal (Wis), Intimidate (Cha), Knowledge (dungeoneering) (Int),\n"
				+ "Knowledge (geography) (Int), Knowledge (local) (Int), Perception (Wis),\n"
				+ "Profession (Wis), Ride (Dex), Sense Motive (Wis), Stealth (Dex), \n"
				+ "Survival (Wis), and Swim (Str).\n\n "
				+ "Weapon and Armor Proficiencies: All simple and martial weapons,\n"
				+ "as well as with light armor, medium armor, and shields (except tower shields).";
		
		info[9][0] = "Swashbuckler";
		info[9][1] = "Synestra, The Bold\n"
				+ "Age: 32\n\n"
				+ "Starting Items\n\n"
				+ "Starting Abilities\n\n"
				+ "CLASS SKILLS: Acrobatics (Dex), Bluff (Cha), Climb (Str), Craft (Int), \n"
				+ "Diplomacy (Cha), Escape Artist (Dex), Intimidate (Cha), \n"
				+ "Knowledge (local) (Int), Knowledge (nobility) (Int), Perception (Wis), \n"
				+ "Perform (Cha), Profession (Wis), Ride (Dex), Sense Motive (Wis), \n"
				+ "Sleight of Hand (Dex), and Swim (Str).\n\n"
				+ "Weapon and Armor Proficiencies: All simple and martial weapons,\n"
				+ "as well as light armor and bucklers. ";
		
		String info1 = "";
		
		for (int x = 0; x < 10; x++) {
			if (getName().getText().equals(info[x][0]) == true){
				info1 = info[x][1];
			}
		}
		return info1;
	}
	
}