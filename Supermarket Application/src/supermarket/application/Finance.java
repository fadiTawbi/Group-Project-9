
package supermarket.application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Manuel
 */
public class Finance extends StackPane {
    
   
    public  Finance( ) {
       
         TableView table=new TableView();
        
        TableColumn product=new TableColumn("name");
        TableColumn total=new TableColumn("Sumtotal of products");
        table.getColumns().add(product);
        table.getColumns().add(total);
        
        
        FlowPane pane=new FlowPane();
      
        Button sold=new Button("Sold Items");
        
        Button profit=new Button("Profit");
        Button back = new Button("Back");
        sold.setPrefSize(100, 50);
        profit.setPrefSize(100,50);
        back.setPrefSize(100,50);
        VBox vbox=new VBox();
        vbox.setPadding(new Insets(10,10,10,10));
        vbox.setSpacing(10);
        vbox.getChildren().addAll(sold,profit,back);
        
        pane.setPadding(new Insets(20,20,20,20));
        
        BorderPane bp=new BorderPane();
        HBox subtotal=new HBox();
        subtotal.setPadding(new Insets(30,30,30,20));
        
        Label label=new Label();
        label.setPadding(new Insets(10));
        label.setText("Subtotal of all \nInventories in\n the store");
        label.setStyle("-fx-border-color: blue;");
        label.setPrefSize(100, 100);
        
        Label label2=new Label();
        label2.setStyle("-fx-border-color: blue;");
        label2.setPrefSize(140, 100);
        label2.setText("");
        subtotal.setSpacing(10);
        
        subtotal.getChildren().addAll(label,label2);
        bp.setBottom(subtotal);
        bp.setLeft(pane);
       
       
        
        pane.getChildren().add(table);
        pane.getChildren().add(vbox);
        
        
        
        
        //root.getChildren().add(pane);
        this.getChildren().add(bp);
        
        back.setOnAction(e->{
            
            HomePage.changeToInventory();
        });
              
        
       
    }

}
