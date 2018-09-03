/* Zack Chambers
 * The following work is done by Zack Chambers and no one else can take credit for it.
 */

package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.util.Random;

public class ColorFont extends Application{
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new VBox(6); //sets up VBox
		
		Font font1 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
		String labelname = new String("JavaFX"); //sets constant font and string
		Random rng = new Random();
		
		Label label1 = new Label(labelname); //these blocks create randomly colored text
		label1.setFont(font1);
		label1.setTextFill(Color.color(rng.nextDouble(), rng.nextDouble(), rng.nextDouble(), rng.nextDouble()));
		pane.getChildren().add(label1);
		
		Label label2 = new Label(labelname);
		label2.setFont(font1);		
		label2.setTextFill(Color.color(rng.nextDouble(), rng.nextDouble(), rng.nextDouble(), rng.nextDouble()));
		pane.getChildren().add(label2);
		
		Label label3 = new Label(labelname);
		label3.setFont(font1);		
		label3.setTextFill(Color.color(rng.nextDouble(), rng.nextDouble(), rng.nextDouble(), rng.nextDouble()));
		pane.getChildren().add(label3);
		
		Label label4 = new Label(labelname);
		label4.setFont(font1);		
		label4.setTextFill(Color.color(rng.nextDouble(), rng.nextDouble(), rng.nextDouble(), rng.nextDouble()));
		pane.getChildren().add(label4);
		
		Label label5 = new Label(labelname);
		label5.setFont(font1);		
		label5.setTextFill(Color.color(rng.nextDouble(), rng.nextDouble(), rng.nextDouble(), rng.nextDouble()));
		pane.getChildren().add(label5);
		
		pane.setRotate(90); //turns them all sideways
		
		Scene scene = new Scene(pane, 200, 200); //displays labels
		primaryStage.setTitle("Color and Font");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
