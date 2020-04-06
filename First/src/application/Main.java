package application;
	
import gui.GameRoot;
import gui.MainMenuRoot;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		MainMenuRoot mainMenuRoot = new MainMenuRoot();
		Button play = new Button("Play");
		Button exit = new Button("Exit");
		
		mainMenuRoot.getChildren().addAll(play, exit);
		
		exit.setOnAction(e -> {
			Platform.exit();
			System.exit(0);
		});
		
		GameRoot gameRoot = new GameRoot();
		
		Scene mainMenuScene = new Scene(mainMenuRoot);
		Scene gameScene = new Scene(gameRoot);
		
		play.setOnAction(e -> {
			primaryStage.setScene(gameScene);
		});
		
		primaryStage.setScene(mainMenuScene);
		primaryStage.sizeToScene();
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
