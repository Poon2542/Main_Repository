package entity.base;

import javafx.scene.layout.Background;
import logic.Direction;
import logic.GameBoard;

public abstract class Entity {
	
	private int col;
	private int row;
	
	private Background bg;	
	
	private Direction direction;

	public Entity() {
		direction = Direction.NONE;
	}
	
	public Background getBg() {
		return bg;
	}

	public void setBg(Background bg) {
		this.bg = bg;
	}
	
	public void move(Direction dir) {
		int targetCol = col;
		int targetRow = row;
		
		direction = dir; //Update move position

		switch(dir) {
		case LEFT:
			targetCol -= 1;
			break;
		case UP:
			targetRow -= 1;
			break;
		case RIGHT:
			targetCol += 1;
			break;
		case DOWN:
			targetCol += 1;
			break;
		default:
			break;
		}
		
		GameBoard.getGamePane().emptyGameCell(col, row);
		GameBoard.getGamePane().setGameCell(this, targetCol, targetRow);
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	

}
