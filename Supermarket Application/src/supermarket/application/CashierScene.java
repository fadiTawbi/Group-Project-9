


package supermarket.application;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;




/**
 *
 * @author Fadi
 */


public class CashierScene extends BorderPane {
    
    
    
    
    public  CashierScene()  {
        
        
     
        
        //Creating Left Panel with items purchases 
        
        HBox purchase = new HBox();
        VBox items = new VBox();
        VBox quantity = new VBox();
        VBox price = new VBox();
        Label lb1 = new Label("Items");
        Label lb2 = new Label("Quantity");
        Label lb3 = new Label ("Total");
//        lb1.setTextFill(Color.);
//        lb2.setTextFill(Color.GREEN);
//        lb3.setTextFill(Color.GREEN);
        lb1.setStyle("-fx-background-color : teal ;-fx-border-color : black");
        lb2.setStyle("-fx-background-color : teal ;-fx-border-color : black");
        lb3.setStyle("-fx-background-color : teal ;-fx-border-color : black");

        lb1.setPrefSize(75, 75);
        lb2.setPrefSize(75, 75);
        lb3.setPrefSize(75, 75);
        lb1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null , null)));
        lb2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null , null)));
        lb3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null , null)));
        lb1.setPadding(new Insets (10,10,10,10));
        lb2.setPadding(new Insets (10,10,10,10));
        lb3.setPadding(new Insets (10,10,10,10));

        items.getChildren().add(lb1);
        quantity.getChildren().add(lb2);
        price.getChildren().add(lb3);
        
        
        
        purchase.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null , null)));
        items.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null , null)));
        quantity.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null , null)));
        price.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null , null)));
        purchase.getChildren().addAll(items,quantity,price);
        
        //Creating Middle interface with the products showcase 
        
        VBox itemspanel = new VBox();
        GridPane gridlist = new GridPane();
        gridlist.setHgap(5);
        gridlist.setVgap(5);
        HBox searchbar = new HBox();
        searchbar.setSpacing(25);
        searchbar.setPadding(new Insets (0,10,10,10));
        itemspanel.setPadding(new Insets (5,5,5,5));
        Button searchbtn = new Button("Search");
        TextField searchtxt = new TextField();
        searchtxt.setPrefSize(200,40);
        searchbtn.setPrefSize(100, 40);
        gridlist.setPadding(new Insets (0,10,10,10));
        
        
        Button[] categories = new Button[20];
        
        Button[] products = new Button[20];
        
        
       //Filling Categories in Girdlist
       
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
       }
        
        searchbar.getChildren().addAll(searchbtn,searchtxt);
        itemspanel.getChildren().addAll(searchbar,gridlist);
        
        
        
        
        
        //Creating Bottom Interface for control buttons
        
        HBox bpanel = new HBox();
        Label lb4 = new Label("SubTotal");
        lb4.setPrefSize(155, 50);
        lb4.setStyle("-fx-background-color : teal ;-fx-border-color : black");

        
        lb4.setAlignment(Pos.CENTER);
        
        lb4.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null , null)));
        bpanel.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null , null)));
        VBox totalpanel = new VBox();
        totalpanel.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null , null)));
        totalpanel.setPrefSize(230, 200);
        
        
        Button BtnCash = new Button("Cash");
        Button btnDelete = new Button("Delete");
        Button btnMain = new Button ("Main Menu");
        BtnCash.setPrefSize(230, 75);
        btnDelete.setPrefSize(230, 75);
        btnDelete.setPrefSize(230, 75);
        btnMain.setPrefSize(100, 40);
        
//        bt1.setStyle("-fx-background-color : chartreuse ;-fx-border-color : black");
//        bt2.setStyle("-fx-background-color: chartreuse ;-fx-border-color:black");
//        bt3.setStyle("-fx-background-color: chartreuse ;-fx-border-color:black");
        
        
        // Creating Bottom Control panel 

        HBox controlbtns = new HBox();
        controlbtns.setSpacing(25);
        controlbtns.setPadding(new Insets (5,5,5,5));
        
        controlbtns.getChildren().add(btnMain);
        controlbtns.setAlignment(Pos.BOTTOM_RIGHT);
        
        bpanel.getChildren().addAll(totalpanel,controlbtns);

        totalpanel.getChildren().addAll(lb4,BtnCash,btnDelete);
        
      
        //Buttons Functions
        
        btnMain.setOnAction(e->{
            
            changeToHomePage();
        });
       
        
        
        this.setLeft(purchase);
        this.setBottom(bpanel);
        this.setCenter(itemspanel);
        this.setPadding(new Insets (10,10,10,10));
        
//       Scene = new Scene(root, 800, 600);


         
    }

    private void changeToHomePage() {
            HomePage.reset();
    }
    
   
      
 
    
}
