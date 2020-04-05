package gui;

import javafx.scene.layout.HBox;
import logic.GameBoard;

public class GameRoot extends HBox {
	
	private SideMenuPane sideMenu;

	public GameRoot() {
		
		GameBoard.InitializeGameBoard();
		sideMenu = new SideMenuPane();
		
		getChildren().addAll(GameBoard.getGamePane(), sideMenu);
		
	}

	public SideMenuPane getSideMenu() {
		return sideMenu;
	}
	
	
}