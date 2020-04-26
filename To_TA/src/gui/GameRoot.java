package gui;

import javafx.scene.layout.HBox;

public class GameRoot extends HBox {
	
	private SideMenuPane sideMenu;

	public GameRoot() {
		
		GameBoard.InitializeGameBoard();
		sideMenu = new SideMenuPane();
		
		getChildren().addAll(GameBoard.getGamePane());
		
	}

	public SideMenuPane getSideMenu() {
		return sideMenu;
	}
	
	
}