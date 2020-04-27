package application;
	
import entity.Floor;
import entity.Player;
import javafx.application.Application;
import javafx.stage.Stage;
import logic.Direction;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	private Pane root;
	private Player player;
	private Floor floor;
	private Canvas fog;
	
	@Override
	public void start(Stage primaryStage) {
		root = new Pane();
		root.setBackground(new Background(new BackgroundFill(Color.GREY, null, null)));
		
		//double t = 0; ������� �������͹
		floor = new Floor(0, 5);
		player = new Player(0, 0);
		
		root.getChildren().add(floor);
		root.getChildren().add(player);
		
		//�ͧ canvas ��͡
		fog = new Canvas(1640, 1240);
		GraphicsContext gc = fog.getGraphicsContext2D();
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, 1640, 500);
		gc.fillRect(0, 0, 700, 1240);
		gc.fillRect(940, 0, 700, 1240);
		gc.fillRect(0, 740, 1640, 500);
		fog.setTranslateX(player.getTranslateX()-800);
		fog.setTranslateY(player.getTranslateY()-600);
		
		root.getChildren().addAll(fog);
		//����ش�ͧ canvas ��͡
		
		Scene scene = new Scene(root, 800, 600); //sprite��Ҵ 40x40 ���Ч�鹢�Ҵ��������ҧ 20x15
		
		scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case LEFT:
                	player.move(Direction.LEFT);
                	if(floor.getBoundsInParent().intersects(player.getBoundsInParent())) player.move(Direction.RIGHT);
                	fog.setTranslateX(player.getTranslateX()-800);
            		fog.setTranslateY(player.getTranslateY()-600);
                    break;
                case RIGHT:
                	player.move(Direction.RIGHT);
                	if(floor.getBoundsInParent().intersects(player.getBoundsInParent())) player.move(Direction.LEFT);
                	fog.setTranslateX(player.getTranslateX()-800);
            		fog.setTranslateY(player.getTranslateY()-600);
                    break;
                case UP:
                	player.move(Direction.UP);
                	if(floor.getBoundsInParent().intersects(player.getBoundsInParent())) player.move(Direction.DOWN);
                	fog.setTranslateX(player.getTranslateX()-800);
            		fog.setTranslateY(player.getTranslateY()-600);
                    break;
                case DOWN:
                	player.move(Direction.DOWN);
                	if(floor.getBoundsInParent().intersects(player.getBoundsInParent())) player.move(Direction.UP);
                	fog.setTranslateX(player.getTranslateX()-800);
            		fog.setTranslateY(player.getTranslateY()-600);
                    break;
//                case SPACE:
//                	
//                    break;
			default:
				break;
            }
        });
		
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
//	private void addEventListener(Scene scene) {
//		
//		
//		
//	}
}
