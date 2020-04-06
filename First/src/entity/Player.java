package entity;

import entity.base.Entity;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Player extends Entity {

	public Player() {
		// TODO Auto-generated constructor stub
		setBg(new Background(new BackgroundFill(Color.CRIMSON, null, null)));
	}
	
}
