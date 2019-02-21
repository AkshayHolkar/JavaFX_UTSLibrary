package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Catalogue;
import model.Library;
import model.Patron;

public class LibraryController extends Controller<Library> {
    
   

  @FXML private Button cataBtn;
  @FXML private Button patronBtn;
  @FXML private Button favboBtn;
  @FXML private Button adminBtn;
  @FXML private Button exitBtn;
   @FXML private TextField patronTf;
 
      
    public void initialize() {
        

    }

    public final Library getLibrary() {
        return model;
    }
    
    @FXML private void handleCatalogue(ActionEvent event) throws Exception {
        Library library = getLibrary();
        ViewLoader.showStage(library , "/view/catalogue.fxml" ,"Catalogue" , new Stage());
    }
     @FXML private void handlePatronR(ActionEvent event) throws Exception {
         
          
        Library library = getLibrary();
        ViewLoader.showStage(library , "/view/record.fxml" ,"Patron Record" , new Stage());
    }
     
     @FXML private void handleFav(ActionEvent event) throws Exception {
        Library library = getLibrary();
        ViewLoader.showStage(library , "/view/favourites.fxml" ,"Favourites" , new Stage());
    }
     
    
     @FXML private void handleAdmin(ActionEvent event) throws Exception {
       
        Library library = getLibrary();
        ViewLoader.showStage(library , "/view/admin.fxml" ,"Administration Menu" , new Stage());
    }
     @FXML private void handleexit(ActionEvent event) throws Exception {
        exit();
    }

}
