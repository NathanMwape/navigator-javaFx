package aspirateur;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


public class AspirateurController implements Initializable {
      @FXML
    private TextField lienURL; 

    @FXML
    private WebView code;
      @FXML
    private ProgressIndicator indicator = new ProgressIndicator();
    

    @FXML
    void Aspirer(ActionEvent event) {
        final WebEngine web = code.getEngine();
         String url = lienURL.getText();
         web.load(url);
         
         
    }

    @FXML
    void retour(){
        final WebEngine web1 = code.getEngine();
        web1.getCreatePopupHandler();
        System.out.println("vous avez clickez sur le bouton retour");
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
          
    }
    
}
