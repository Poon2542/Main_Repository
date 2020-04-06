package gui;

import entity.Player;
import entity.Wall;
import entity.base.Entity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import logic.Direction;

public class GamePane extends GridPane {
	
	private ObservableList<GameCell> gameCells = FXCollections.observableArrayList();
	private Player player;

	public GamePane() {
		// TODO Auto-generated constructor stub
		setPrefSize(900, 600);
		setBackground(new Background(new BackgroundFill(Color.AQUAMARINE, null, null)));
		
		for(int i = 0; i < 600; i++) {
			gameCells.add(new GameCell());
		}
		
		for(int row = 0; row < 20; row++) {
			for(int col = 0; col < 30; col++) {
				this.add(getGameCell(col, row), col, row);
			}
		}
		
		player = new Player();
		
		setGameCell(player, 15, 19);
		setGameCell(new Wall(), 7, 0);
		setGameCell(new Wall(), 8, 0);
		setGameCell(new Wall(), 9, 0);
		//emptyGameCell(8, 0);
		
	}
	
	public GameCell getGameCell(int col, int row) {
		return(gameCells.get(col+30*row));
	}
	
	public void setGameCell(Entity e, int col, int row) {
		getGameCell(col, row).setEntity(e);
		e.setCol(col);
		e.setRow(row);
	}
	
	public void emptyGameCell(int col, int row) {
		getGameCell(col, row).setEntity(null);
	}
	
	public void movePlayer(Direction dir) {
		player.move(dir);
	}

}
