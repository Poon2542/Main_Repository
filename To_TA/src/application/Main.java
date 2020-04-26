package application;
	
import entity.Floor;
import gui.GameRoot;
import entity.Player;
import gui.MainMenuRoot;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import logic.Direction;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import gui.SideMenuPane;
import gui.GamePane;

public class Main extends Application {
	
	private Pane root = new Pane(); // for creating new window tab

	@Override
	public void start(Stage PrimaryStage) {
		
		//double t = 0; ใส่เวลา เอาไว้ก่อน
		MainMenuRoot MainMenuRoot = new MainMenuRoot(); 
		GameRoot Gameroot = new GameRoot();
		
		Button play = new Button("Play");
		Button exit = new Button("Exit");
		
		MainMenuRoot.getChildren().addAll(play,exit);
		
		exit.setOnAction(e -> {
			Platform.exit();
			System.exit(0); 
		});
		
		//
		
		Scene GameScene = new Scene(Gameroot);
		Scene MainMenuScene = new Scene(MainMenuRoot);
	
		PrimaryStage.setTitle("Hello Dungeon");
		PrimaryStage.setScene(MainMenuScene);
		
		play.setOnAction(e -> {
			PrimaryStage.setScene(GameScene);
		});
		
		
		
		PrimaryStage.sizeToScene();
		PrimaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
//	private void addEventListener(Scene scene) {
//		
//		
//		
//	}
}
