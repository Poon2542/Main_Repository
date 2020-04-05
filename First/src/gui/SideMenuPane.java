package gui;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SideMenuPane extends VBox {

	public SideMenuPane() {
		
		setAlignment(Pos.TOP_CENTER);
		setPadding(new Insets(10));
		setPrefWidth(100);
		setSpacing(10);
		
		setBackground(new Background(new BackgroundFill(Color.DEEPPINK, null, null)));
		
		Button restart = new Button("Restart");
		Button exit = new Button("Exit");
		
		getChildren().addAll(restart, exit);
		
		exit.setOnAction(e -> {
			Platform.exit();
			System.exit(0);
		});
	}

}
