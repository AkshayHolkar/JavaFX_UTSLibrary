package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Author;
import model.Book;
import model.Catalogue;



public class ShowBooksByAuthorController extends Controller<Catalogue>{
    
    
    @FXML ListView<Book> bookAuthorLV;
      @FXML ListView<Author> authorLV;
    public void initialize() {
        

    }

    public final Catalogue getCatalogue() {
        return model;
    }
    
    private Author getSelectedAuthor() { return authorLV.getSelectionModel().getSelectedItem(); }
    
    
    
    @FXML private void handleDisplay(ActionEvent event) throws Exception {
       bookAuthorLV.setItems(getCatalogue().getBooksByAuthor(getSelectedAuthor()));
    }
    
     @FXML private void handleExit(ActionEvent event) throws Exception {
        stage.close();
    }

}
