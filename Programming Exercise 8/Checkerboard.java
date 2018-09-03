/* Zack Chambers
 * The following work is done by Zack Chambers and no one else can take credit for it.
 */

package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class Checkerboard extends Application{
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane(); //sets up gridpane
		pane.setAlignment(Pos.TOP_LEFT);
		pane.setPadding(new Insets(10, 10, 10, 10));
		
		int x = 0, y = 0;
		
		while (y!=8) { //loops that create and place colored rectangles to create checkered pattern
			
			while (x < 8) {
				if (y%2 == 0) {
					pane.add(new Rectangle(50, 50, Paint.valueOf("silver")), x, y);
					x++;
					pane.add(new Rectangle(50, 50, Paint.valueOf("black")), x, y);
					x++;
				}
				
				else if (y%2 != 0) {
					pane.add(new Rectangle(50, 50, Paint.valueOf("black")), x, y);
					x++;
					pane.add(new Rectangle(50, 50, Paint.valueOf("silver")), x, y);
					x++;
				}
			}
			
			x = 0;
			y++;
		}
		
		
		Scene scene = new Scene(pane, 420, 420); //displays checkerboard
		primaryStage.setTitle("Checkerboard"); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}