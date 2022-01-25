
package supermarket.application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author scorp
 */

public class Inventory extends BorderPane {
    
  
    public final int index = 0 ;
    
    public  Inventory () {
        
        
        GridPane gridlist = new GridPane();
        
        HBox searchbar = new HBox();
        HBox btnPanel = new HBox();
        
        
        searchbar.setAlignment(Pos.TOP_CENTER);
        searchbar.setPadding(new Insets (10,10,10,10));
        searchbar.setSpacing(25);
        
        
        btnPanel.setSpacing(25);
        btnPanel.setPadding(new Insets (25,25,25,25));
        btnPanel.setAlignment(Pos.TOP_CENTER);
        
        Button finance = new Button("Finance");
        Button edit = new Button("Edit");
        Button back = new Button("Back");
        Button searchbtn = new Button("Search");
        TextField searchtxt = new TextField();
        
        searchbtn.setPrefSize(125,40);
        searchtxt.setPrefSize(125,40);
        
        finance.setPrefSize(125,75);
        edit.setPrefSize(125,75);
        back.setPrefSize(125,75);
        
        
        gridlist.setHgap(5);
        gridlist.setVgap(5);
        gridlist.setAlignment(Pos.TOP_CENTER);   
        gridlist.setPadding(new Insets (25,10,10,10));
       
       
         Button[]  categories = new Button[20];  
          
       for (int i = 0 ; i < categories.length;i++){
           categories[i]= new Button("Inventory " +(i+1));
           
                if (i<5){     
                gridlist.add(categories[i],i , 0);
              }
                if (5 <= i && i<10){
                gridlist.add(categories[i],i-5 ,1);
              }        
               if (10 <= i && i<15){
                    
                gridlist.add(categories[i],i-10 , 2);
              }
                if (15 <= i && i<=20){
                gridlist.add(categories[i],i-15 ,3);
              } 
             categories[i].setPrefSize(110, 100);
             
             final String title = categories[i].getText();
             
             categories[i].setOnAction(e->{
                 
                 
                 
                 HomePage.changeToProduct(title);
                 
                 
             });
       
                     }
       
        //Buttons Functions
        
         back.setOnAction(e->{
            
           HomePage.reset();
        });
         
        finance.setOnAction(e->{
            
           HomePage.changeToFinance();
           
        });
         
        searchbar.getChildren().addAll(searchbtn,searchtxt);
        btnPanel.getChildren().addAll(finance,edit,back);
        this.setCenter(gridlist);
        this.setBottom(btnPanel);
        this.setTop(searchbar);
        
        
     
    }
    
  

   


    
     
     
}
