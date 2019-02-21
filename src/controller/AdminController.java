package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Catalogue;

import model.Library;

public class AdminController extends Controller<Library> {
     @FXML private Button patronBtn;
  @FXML private Button patronRecortBtn;
  @FXML private Button addboCBtn;
  @FXML private Button removeBoBtn;
  @FXML private Button exitBtn;
      public void initialize() {
        

    }

    public final Library getLibrary() {
        return model;
    }
    
   
    
    @FXML private void handleAddPat(ActionEvent event) throws Exception {
      Library library = getLibrary();
        ViewLoader.showStage(library , "/view/addPatron.fxml" ,"Add Patron" , new Stage());
    }
    
    @FXML private void handleRemovePatron(ActionEvent event) throws Exception { 
          Library library = getLibrary();
        
        ViewLoader.showStage(library, "/view/removePatron.fxml" ,"Remove Patron" , new Stage());
    }
    
     @FXML private void handleAddBook(ActionEvent event) throws Exception {
       Catalogue catalogue = getLibrary().getCatalogue();
        ViewLoader.showStage(catalogue , "/view/addBook.fxml" ,"Add Book" , new Stage());
    }
     
      @FXML private void handleRemoveBo(ActionEvent event) throws Exception {
        Catalogue catalogue = getLibrary().getCatalogue();
        ViewLoader.showStage(catalogue , "/view/removeBook.fxml" ,"Remove Book" , new Stage());
    }
     
       @FXML private void handleExit(ActionEvent event) throws Exception {
     stage.close() ;
    }
     

}
