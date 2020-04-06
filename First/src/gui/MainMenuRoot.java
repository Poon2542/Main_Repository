package gui;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class MainMenuRoot extends VBox {

	public MainMenuRoot() {
		
		setAlignment(Pos.CENTER);
		setPrefSize(1000, 600);
		setSpacing(15);
		
		Label welcome = new Label("Welcome!");
		welcome.setFont(new Font(30));
		
		getChildren().add(welcome);
		
	}

}
