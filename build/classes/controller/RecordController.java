package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Book;
import model.Library;
import model.Patron;

public class RecordController extends Controller<Library> {
     @FXML private Button recordBtn;
  @FXML private Button closeBtn;
  @FXML private  TextField patronTf; 
   @FXML private ListView<Book> currentBLV;
    @FXML private ListView<Book> borrowedLV;
   
  public void initialize() {
      patronTf.textProperty().addListener(
				(observable, oldValue, newValue) -> recordBtn.setDisable(newValue == null)
				);
        

    }
  

    public final Library getLibrary() {
        return model;
    }
    
     private int getPatron() { return Integer.parseInt(patronTf.getText()); }
 

    
    
    
     @FXML private void handleshow(ActionEvent event) throws Exception {
        currentBLV.setItems(getLibrary().getPatron(getPatron()).currentlyBorrowed());
        borrowedLV.setItems(getLibrary().getPatron(getPatron()).borrowingHistory());
    }
     
      @FXML private void handleClose(ActionEvent event) throws Exception {
       stage.close();
    }
}
