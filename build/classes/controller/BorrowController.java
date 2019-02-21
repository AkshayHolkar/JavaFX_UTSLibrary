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

public class BorrowController extends Controller<Catalogue> {
    @FXML private TextField patronTf;
    @FXML private Button getPBT;
     @FXML private Button borrowBT;
     @FXML private Button closeBT;
    @FXML private ListView<Book> availableBookLV;
    
    
     public void initialize() {
         patronTf.textProperty().addListener(
				(observable, oldValue, newValue) -> getPBT.setDisable(newValue == null)
				);
     availableBookLV.getSelectionModel().selectedItemProperty().addListener(
				(obs, oldBook, newBook) -> borrowBT.setDisable(newBook == null)	);
    }

    public final Catalogue getCatalogue() {
        return model;
    }
    private int getPatronID() { return Integer.parseInt(patronTf.getText()); }
    private Patron getSelectedPatron(){return getCatalogue().getPatron(getPatronID());}

    private Book getSelectedBook() { return availableBookLV.getSelectionModel().getSelectedItem(); }
    
    
    @FXML private void handlePatron(ActionEvent event)  throws Exception {
       
           
            availableBookLV.setItems(getCatalogue().getBorrowableBooks(getSelectedPatron()));
		
	}
    
    
        @FXML private void handleBorrow(ActionEvent event) throws Exception {
            getCatalogue().loanBookToPatron(getSelectedBook() , getSelectedPatron());
            
		
	}
         @FXML private void handleClose(ActionEvent event) throws Exception {
            stage.close();
            
		
	}
        
}
