package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Library;
import model.Patron;

public class RemovePatronController extends Controller<Library>{
    @FXML private ListView<Patron> patronLV;
    
     public void initialize() {
        

    }

    public final Library getLibrary() {
        return model;
    }
   
    
    private Patron getSelectedPatron() { return patronLV.getSelectionModel().getSelectedItem(); }

    @FXML private void handleRemove (ActionEvent envet)  throws Exception {
    getLibrary().removePatron(getSelectedPatron());
    }
    
    @FXML private void handleClose (ActionEvent envet)  throws Exception {
   stage.close();
    }
}
