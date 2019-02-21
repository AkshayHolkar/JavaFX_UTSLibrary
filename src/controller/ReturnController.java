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

public class ReturnController extends Controller<Library>{
     @FXML private TextField patronTf;
    @FXML private Button getPBT;
     @FXML private Button returnBT;
     @FXML private Button closeBT;
    @FXML private ListView<Book> BorrowedBookLV;
    private ObservableList<Book> borrowedBook = FXCollections.observableArrayList();
    
     public void initialize() {
          patronTf.textProperty().addListener(
				(observable, oldValue, newValue) -> getPBT.setDisable(newValue == null)
				);
     BorrowedBookLV.getSelectionModel().selectedItemProperty().addListener(
				(obs, oldBook, newBook) -> returnBT.setDisable(newBook == null)	);

    }

    public final Library getLibrary() {
        return model;
    }
    private int getPatron() { return Integer.parseInt(patronTf.getText()); }

    private Book getSelectedBook() { return BorrowedBookLV.getSelectionModel().getSelectedItem(); }
    
    @FXML private void handlePatron(ActionEvent event)  throws Exception {
        
            getLibrary().getPatron(getPatron());
            BorrowedBookLV.setItems(getLibrary().getPatron(getPatron()).currentlyBorrowed());
		
	}
        @FXML private void handleBorrow(ActionEvent event) throws Exception {
            getLibrary().getCatalogue().returnBookFromPatron(getSelectedBook() , getLibrary().getCatalogue().getPatron(getPatron()));
            
		
	}
        
         @FXML private void handleClose(ActionEvent event) throws Exception {
           stage.close();
            
		
	}

}
