package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Book;
import model.Catalogue;


public class RemoveBookController extends Controller<Catalogue>{
    
    @FXML private ListView<Book> bookLV;
     public void initialize() {
        

    }

    public final Catalogue getCatalogue() {
        return model;
    }
    
    
    private Book getSelectedBook() { return bookLV.getSelectionModel().getSelectedItem(); }

    @FXML private void handleRemove(ActionEvent event){
        getCatalogue().removeBook(getSelectedBook());
        
    }
    
    @FXML private void handleexit(ActionEvent event) throws Exception {
        stage.close();
    }
}
