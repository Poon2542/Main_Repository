package entity;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import logic.Direction;

public abstract class Entity extends Rectangle {
	
	private int row;
	private int col;
	private Image img;
	private Direction direction;

	public Entity(int row, int col) {
		
		super(20, 20);
		setRow(row);
		setCol(col);
		setDirection(Direction.NONE);
	}
	
	public void move(Direction dir) {
		
		switch (dir) {
			case UP:
				setRow(row-1);
				break;
			case DOWN:
				setRow(row+1);
				break;
			case RIGHT:
				setCol(col+1);
				break;
			case LEFT:
				setCol(col-1);
				break;
		default:
			break;
		}
		
	}

	public double getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
		setTranslateY(row*40);
	}

	public double getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
		setTranslateX(col*40);
	}

	public Image getImg() {
		return img;
	}

	public void setImg(String url) {
		this.img = new Image(url);
		setFill(new ImagePattern(img));
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	

}
