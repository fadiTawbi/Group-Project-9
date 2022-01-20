/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author manuel
 */
public class Product extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Edit");
        Label invTitle=new Label("Inventory title");
        HBox hb=new HBox();
        
       
        hb.getChildren().add(invTitle);
        
        
        
        invTitle.setPadding(new Insets(10, 10, 10, 10));
       
        invTitle.setFont(Font.font(20));
        invTitle.setStyle("-fx-border-color: black;");
       
     
       
       //tabelview creation 
        TableView tv=new TableView();
        
        TableColumn product=new TableColumn("product");
        TableColumn exp=new TableColumn("expiry");
        TableColumn id=new TableColumn("barcode number");
        TableColumn price=new TableColumn("price");
        TableColumn profit=new TableColumn("profit %");
        TableColumn sellprice=new TableColumn("selling price");
        TableColumn qty=new TableColumn("quantity");
        TableColumn totalsold=new TableColumn("total sold");
        tv.getColumns().add(product);
        tv.getColumns().add(exp);
        tv.getColumns().add(id);
        tv.getColumns().add(price);
        tv.getColumns().add(profit);
        tv.getColumns().add(sellprice);
        tv.getColumns().add(qty);
        tv.getColumns().add(totalsold);
        
        
        
        FlowPane fp=new FlowPane();
        fp.setHgap(15);
        Button bt1=new Button("Edit");
        Button bt2=new Button("Del");
        Button bt3=new Button("Add");
        bt1.setPrefSize(70, 50);
        bt2.setPrefSize(70, 50);
        bt3.setPrefSize(70, 50);
        fp.getChildren().addAll(bt3, bt1,bt2);
        
      
          
        
        
        
       
       
        //add all panes to root        
        FlowPane root =new FlowPane(Orientation.VERTICAL);
        root.setVgap(10);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(hb);
        root.getChildren().add(tv);
        root.getChildren().add(fp);
        
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("Product");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
