package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Catalogue;
import model.Library;


public class CatalogueController extends Controller<Library>{
  @FXML private Button disABookBtn;
  @FXML private Button disAvaiBtn;
  @FXML private Button disGenBtn;
  @FXML private Button disBGBtn;
  @FXML private Button disAAuBtn;
   @FXML private Button disBABtn;
  @FXML private Button BBBtn;
  @FXML private Button retBBtn;
  @FXML private Button placeHBtn;
  @FXML private Button returnMBtn;
   public void initialize() {
        

    }

    public final Library getLibrary() {
        return model;
    }

     @FXML private void handleBorrowB(ActionEvent event) throws Exception {
        Catalogue catalogue = getLibrary().getCatalogue();
        ViewLoader.showStage(catalogue , "/view/borrow.fxml" ,"Borrow a Book" , new Stage());
    }
      @FXML private void handleAllbook(ActionEvent event) throws Exception {
        Catalogue catalogue = getLibrary().getCatalogue();
        ViewLoader.showStage(catalogue , "/view/showAllBooks.fxml" ,"Complete Catalogue" , new Stage());
    }
      
      @FXML private void handleAvabook(ActionEvent event) throws Exception {
        Catalogue catalogue = getLibrary().getCatalogue();
        ViewLoader.showStage(catalogue , "/view/showAvailableBooks.fxml" ,"Available Books" , new Stage());
    }
      
      
       
        @FXML private void handleDisBoGenre(ActionEvent event) throws Exception {
        Catalogue catalogue = getLibrary().getCatalogue();
        ViewLoader.showStage(catalogue , "/view/showBooksByGenre.fxml" ,"Browse By Genre" , new Stage());
    }
       
         @FXML private void handleDisBoAuthor(ActionEvent event) throws Exception {
        Catalogue catalogue = getLibrary().getCatalogue();
        ViewLoader.showStage(catalogue , "/view/showBooksByAuthor.fxml" ,"Browse By Author" , new Stage());
    }
       @FXML private void handleReturn(ActionEvent event) throws Exception {
        Library library = getLibrary();
        ViewLoader.showStage(library , "/view/return.fxml" ,"Return a Book" , new Stage());
    }
      
        @FXML private void handlePlaceHold(ActionEvent event) throws Exception {
        Library library = getLibrary();
        ViewLoader.showStage(library , "/view/placeHold.fxml" ,"Place a Hold" , new Stage());
    }
        
         @FXML private void handleClose(ActionEvent event) throws Exception {
        stage.close();
    }
}
