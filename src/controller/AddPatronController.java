package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.beans.property.IntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Catalogue;

import model.Library;
import model.Patron;

public class AddPatronController extends Controller<Library>{
    @FXML TextField patronITf ;
     @FXML TextField patronNTf ;
     @FXML Label errorLB ;
      public void initialize() {
        

    }

    public final Library getLibrary() {
        return model;
    }

     private int getPatronID() {
return Integer.parseInt( patronITf.getText() );
}
     private String getnamePatron() {
 return patronNTf.getText(); 
}
     

     @FXML private void handleAddPat(ActionEvent event) throws Exception {
       
        try{
      getLibrary().addPatron(getPatronID(), getnamePatron());
        }
        catch(Exception e){
            
        }
      
    }
     @FXML private void handleClose(ActionEvent event) throws Exception {
         stage.close();
      
    }
     
}
