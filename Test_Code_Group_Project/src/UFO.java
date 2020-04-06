import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import javafx.animation.AnimationTimer;

// Animation of Earth rotating around the sun. (Hello, world!)
public class UFO extends Application 
{
    public static void main(String[] args) 
    {
    	System.out.println("I am Hereeee");
        launch(args);
    }

    @Override
    public void start(Stage theStage) 
    {
        theStage.setTitle( "AnimatedImage Example" );

        Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );

        Canvas canvas = new Canvas( 512, 512 );
        root.getChildren().add( canvas );

        GraphicsContext gc = canvas.getGraphicsContext2D();

        Image earth = new Image( "earth.png" );
        Image sun   = new Image( "sun.png" );
        Image space = new Image( "space.png" );

        AnimatedImage ufo = new AnimatedImage();
        Image[] imageArray = new Image[6];
        //this is very important array = each frame it contain we should name image as something + number.
        for (int i = 0; i < 6; i++)
            imageArray[i] = new Image( "ufo_" + i + ".png" );
        //frames = amount of imageArray,duration = 0.1 s per frame
        ufo.frames = imageArray;
        ufo.duration = 0.100;
        
        if(imageArray.length == 6) {
        	System.out.println("ImageArray = 6");
        }

        final long startNanoTime = System.nanoTime();

        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                double t = (currentNanoTime - startNanoTime) / 1000000000.0; 

                double x = 232 + 128 * Math.cos(t);
                double y = 232 + 128 * Math.sin(t);

                gc.drawImage( space, 0, 0 );
                gc.drawImage( earth, x, y );
                gc.drawImage( sun, 196, 196 );
                gc.drawImage( ufo.getFrame(t), 450, 25 ); //getframe = each fame will be get base on persecond we set
            }
        }.start();
        
        theStage.show();
    }
}
