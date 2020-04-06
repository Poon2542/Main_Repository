package gui;

import entity.base.Entity;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class GameCell extends Pane {

	public GameCell() {
		// TODO Auto-generated constructor stub
		setPrefSize(30, 30);
		setBackground(new Background(new BackgroundFill(Color.DIMGRAY, null, null)));
		setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public void setEntity(Entity e) {
		if(e == null) {
			setBackground(new Background(new BackgroundFill(Color.DIMGRAY, null, null)));
			setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, 
					CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		}else setBackground(e.getBg());
	}

}
