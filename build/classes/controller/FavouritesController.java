package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Book;
import model.Library;


import model.Patron;

public class FavouritesController extends Controller<Library>{
    @FXML private TextField patronTf;
    @FXML private Button favBtn;
    @FXML private Button closeBtn ;
    @FXML private ListView<Book> favLV ;
  
    
    
 public void initialize() {
       patronTf.textProperty().addListener(
				(observable, oldValue, newValue) -> favBtn.setDisable(newValue == null)
				);
        

    }

    public final Library getLibrary() {
        return model;
    }
     private int getPatron() { return Integer.parseInt(patronTf.getText()); }
   
    @FXML private void handlerfav(ActionEvent event) throws Exception {
        favLV.setItems(getLibrary().getPatron(getPatron()).favourites());
    }
    
    @FXML private void handleclose(ActionEvent event) throws Exception {
        stage.close();
    }
}

