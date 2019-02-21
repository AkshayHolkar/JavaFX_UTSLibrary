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
import model.Catalogue;
import model.Library;
import model.Patron;

public class PlaceHoldController extends Controller<Library> {
    
      @FXML private TextField patronTf;
    @FXML private Button getPBT;
     @FXML private Button holdBT;
     @FXML private Button closeBT;
    @FXML private ListView<Book> holdBookLV;
    
    
     public void initialize() {
          patronTf.textProperty().addListener(
				(observable, oldValue, newValue) -> getPBT.setDisable(newValue == null)
				);
     holdBookLV.getSelectionModel().selectedItemProperty().addListener(
				(obs, oldBook, newBook) -> holdBT.setDisable(newBook == null)	);
        

    }

    public final Library getLibrary() {
        return model;
    }
    private int getPatron() { return Integer.parseInt(patronTf.getText()); }
private Patron getSelectedPatron(){return getLibrary().getCatalogue().getPatron(getPatron());}
    private Book getSelectedBook() { return holdBookLV.getSelectionModel().getSelectedItem(); }
    
    @FXML private void handlePatron(ActionEvent event)  throws Exception {
        
            
            holdBookLV.setItems(getLibrary().getCatalogue().getAllBooks());
		
	}
        @FXML private void handleHold(ActionEvent event) throws Exception {
          Book book = getSelectedBook();
                  book.addHold(getSelectedPatron());
            
		
	}
        
         @FXML private void handleClose(ActionEvent event) throws Exception {
           stage.close();
            
		
	}

}
