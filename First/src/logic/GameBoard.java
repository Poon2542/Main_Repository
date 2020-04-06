package logic;

import gui.GamePane;

public class GameBoard {
	
	private static GamePane gamePane;

	public static void InitializeGameBoard() {
		gamePane = new GamePane();
	}

	public static GamePane getGamePane() {
		return gamePane;
	}
	
	
}
