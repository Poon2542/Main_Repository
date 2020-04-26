package gui;

import entity.Player;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import logic.Direction;

public class GamePane extends Pane{
	
	
	private Player player;

	public GamePane() {
		// TODO Auto-generated constructor stub
		setPrefSize(900, 600);
		setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		
		player = new Player(2,2);
		
		this.getChildren().add(player);
		
		
		addListener();
		//Interface Function
	}
	protected void addListener() {
		// TODO Auto-generated method stub
		this.setOnKeyPressed(e -> {
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
//            case SPACE:
//            	
//                break;
            	default:
            		break;
			}
		});
		
	}
	public void MovePlayer(Direction direction) {
		player.move(direction);
	}
}
