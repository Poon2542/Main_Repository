import java.io.File;
import java.io.InputStream;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class EarthAndSun extends Application{ //extend = need to use function form mother or else error
	public static void main(String[] args) {
		System.out.println("Hello World");
		launch(args);
	}
	//launch start(stage)
	//stage = top level container which will host a scene in it.
	@Override
	public void start(Stage theStage) {
		
		theStage.setTitle("Timeline Example");
		 
		//--Important--//
		Group root = new Group();
		Scene theScene = new Scene(root);
		theStage.setScene(theScene); //Stage have scene and scene has root as new group
		
		Canvas canvas = new Canvas(512,512); //canvas control size of our tab window
		root.getChildren().add(canvas); //Need to always add canvas
		//--Important--//
		 
		Image earth = new Image( "earth.png" );
        Image sun   = new Image( "sun.png" );
        Image space = new Image( "space.png" );
		
		final long startNanoTime = System.nanoTime(); //count time in system
		
		GraphicsContext gc = canvas.getGraphicsContext2D(); //graphic control drag image etc. must enable canvas first
		
		new AnimationTimer() { //animationtimer from javaFX animation lib
			public void handle(long currentNanoTime) {
				double t = (currentNanoTime - startNanoTime)/1000000000.0;
				
				double x = 232 + 128*Math.cos(t);
				double y = 232 + 128*Math.sin(t);
				
				//background image clear canvas
				
				gc.drawImage(space,0,0);
				gc.drawImage(earth,x,y);
				gc.drawImage(sun, 196, 196); //middle of picture
				
			}
		}.start(); // start this animation timer
		
		theStage.show();
		
	}
}
