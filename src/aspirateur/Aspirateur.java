package aspirateur;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Nathan
 */
public class Aspirateur extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {    
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));   
        Scene scene = new Scene(root);
        
 
        
        primaryStage.setResizable(false);
        primaryStage.setTitle("Mini navigateur");
        primaryStage.getIcons().setAll(new Image(getClass().getResourceAsStream("/aspirateur/images/logo1.png")));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
