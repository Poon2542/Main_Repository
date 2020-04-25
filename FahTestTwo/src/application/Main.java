package application;
	
import entity.Floor;
import entity.Player;
import javafx.application.Application;
import javafx.stage.Stage;
import logic.Direction;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	private Player player;
	
	@Override
	public void start(Stage primaryStage) {
		Pane root = new Pane();
		root.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		
		//double t = 0; ใส่เวลา เอาไว้ก่อน
		Floor floor = new Floor(0, 0);
		player = new Player(0, 0);
		
		root.getChildren().add(floor);
		root.getChildren().add(player);
		
		Scene scene = new Scene(root, 800, 600); //spriteขนาด 40x40 เพราะงั้นขนาดนี้จะได้ตาราง 20x15
		
		scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case LEFT:
                	player.move(Direction.LEFT);
                    break;
                case RIGHT:
                	player.move(Direction.RIGHT);
                    break;
                case UP:
                	player.move(Direction.UP);
                    break;
                case DOWN:
                	player.move(Direction.DOWN);
                    break;
//                case SPACE:
//                	
//                    break;
			default:
				break;
            }
        });
		
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
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
