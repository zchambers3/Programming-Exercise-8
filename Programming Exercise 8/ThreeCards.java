/* Zack Chambers
 * The following work is done by Zack Chambers and no one else can take credit for it.
 */

package application;
import java.util.ArrayList; //block of necassary imports
import java.util.Collections;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ThreeCards extends Application{
	@Override
	public void start(Stage primaryStage){
		int count = 1; //this block of code creates my deck of cards and shuffles them
		ArrayList<String> deck = new ArrayList<String>();
		while (count != 53) {
			deck.add(Integer.toString(count));
			count++;
		}
		
		Collections.shuffle(deck);
		
		
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5)); //This sets up the HBox and draws the first three cards 
		Image image = new Image(getClass().getResourceAsStream("image/card/" + deck.get(0) + ".png"));
		Image image2 = new Image(getClass().getResourceAsStream("image/card/" + deck.get(1) + ".png"));
		Image image3 = new Image(getClass().getResourceAsStream("image/card/" + deck.get(2) + ".png"));
		Node card = new ImageView(image);
		Node card2 = new ImageView(image2); //making the images Nodes
		Node card3 = new ImageView(image3);
		pane.getChildren().add(card);  //adding the nodes to the pane
		pane.getChildren().add(card2);
		pane.getChildren().add(card3);	
			
		
		Scene scene = new Scene(pane); //setting up the Stage
		primaryStage.setTitle("Three Cards");
		primaryStage.setScene(scene);
		primaryStage.show(); //displaying the stage
			
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}