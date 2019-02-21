package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Book;
import model.Catalogue;
import model.Patron;


public class AddBookController extends Controller<Catalogue>{
    @FXML TextField titleTf ;
     @FXML TextField authorTf ;
      @FXML TextField genreTf ; 
       @FXML Button addBookBTN ;
      
     private String getBooktitle() {
 return titleTf.getText(); 
     }
     
     private String getBookauthor() {
 return authorTf.getText(); 
     }
     private String getBookgenre() {
 return genreTf.getText(); 
     }
  
     
    
     public void initialize() {
        

    }

    public final Catalogue getCatalogue() {
        return model;
    }
   
    


 @FXML private void handleAddBook(ActionEvent event) throws Exception {
      getCatalogue().addBook(getBooktitle() , getBookauthor() , getBookgenre());
      
        
    }
 @FXML private void handleClose(ActionEvent event) throws Exception {
      stage.close();
      
        
    }
 
}
