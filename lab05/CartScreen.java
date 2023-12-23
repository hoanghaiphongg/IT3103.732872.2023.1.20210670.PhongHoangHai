package hust.soict.dsai.aims.screen;

// Hoang Hai Phong - 20210670
import java.io.IOException;

import javax.swing.JFrame;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
// Hoang Hai Phong 20210670
public class CartScreen extends JFrame{
	private Cart cart;
	
	public CartScreen(Cart cart) {
		this.cart = cart;
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		
		this.setTitle("Cart");
		this.setVisible(true);
		Platform.runLater(new Runnable(){
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("cartt.fxml"));
					CartScreenController controller = new CartScreenController(cart);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
