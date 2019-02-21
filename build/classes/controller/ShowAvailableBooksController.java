package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import model.Book;
import model.Catalogue;

public class ShowAvailableBooksController extends Controller<Catalogue>{
    @FXML private TableView<Book> avaBookTv;
    
     public void initialize() {
        

    }

    public final Catalogue getCatalogue() {
        return model;
    }
    
     @FXML private void handleExit(ActionEvent event) throws Exception {
        stage.close();
    }

}
