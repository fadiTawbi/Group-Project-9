/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.application;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

/**
 *
 * @author User
 */
public class Notification extends VBox {
    
    
    public  Notification () {
        
        
        
        
        TableView table=new TableView();
        TableColumn date=new TableColumn("dat");
        TableColumn prod=new TableColumn("product");
        TableColumn msg=new TableColumn("message");
        table.getColumns().add(date);
        table.getColumns().add(prod);
        table.getColumns().add(msg);
        Button back = new Button("Back");
        
        
        back.setOnAction(e ->{ 
            
            HomePage.reset();
            
        });
        
       // root.setAlignment(Pos.CENTER);
       
        this.setPadding(new Insets(10,10,10,10));
        this.setPrefSize(200, 200);
        this.getChildren().addAll(table,back);
        
        
     
       
    }

   
    
    
}
