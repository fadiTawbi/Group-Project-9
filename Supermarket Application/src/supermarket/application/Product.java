/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.application;


import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 *
 * @author manuel
 */

public class Product extends FlowPane {
        
    private Label invTitle;
   
    public  Product() {
        
        invTitle=new Label("Inventory title");
        HBox hb=new HBox();
        
       
        hb.getChildren().add(invTitle);
        
        
        
        invTitle.setPadding(new Insets(10, 10, 10, 10));
       
        invTitle.setFont(Font.font(20));
        invTitle.setStyle("-fx-border-color: black;");
       
        HBox hb1=new HBox();
        Button btn = new Button();
        btn.setText("Search");
        TextField searchtxt = new TextField();
        searchtxt.setPrefSize(200,40);
        btn.setPrefSize(100, 40);
        hb1.setSpacing(25);
        hb1.getChildren().addAll(btn,searchtxt);
     
      
         
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
        Button bt4=new Button("Back");
        
        bt1.setPrefSize(70, 50);
        bt2.setPrefSize(70, 50);
        bt3.setPrefSize(70, 50);
        bt4.setPrefSize(70, 50);
        
        fp.getChildren().addAll(bt3, bt1,bt2,bt4);
        
    
        
        
        bt4.setOnAction(e->{
        
           HomePage.changeToInventory();
           
        });
       
       
        
        
        //add all panes to root        
        this.setOrientation(Orientation.VERTICAL);
        this.setVgap(10);
        this.setHgap(10);
        this.setAlignment(Pos.CENTER);
        this.getChildren().add(hb);
        this.getChildren().add(hb1);
        this.getChildren().add(tv);
        this.getChildren().add(fp);
        
        
        
    }
    
    public void setInvTitle(String invString){
        
        this.invTitle.setText(invString);
        
        
    }
    
}
