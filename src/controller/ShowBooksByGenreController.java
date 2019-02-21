package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Book;
import model.Catalogue;
import model.Genre;

public class ShowBooksByGenreController extends Controller<Catalogue>{
   
    @FXML ListView<Genre> genreLV;
    @FXML ListView<Book> bookGenreLV;
    public void initialize() {
        

    }

    public final Catalogue getCatalogue() {
        return model;
    }
    
     private Genre getSelectedGenre() { return genreLV.getSelectionModel().getSelectedItem(); }
    
     
     
    @FXML private void handleDisplay(ActionEvent event) throws Exception {
        bookGenreLV.setItems(getCatalogue().getBooksInGenre(getSelectedGenre()));
    }
    
     @FXML private void handleExit(ActionEvent event) throws Exception {
        stage.close();
    }

}
