


package supermarket.application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import javafx.stage.Stage;

/**
 *
 * @author Fadi
 */
public class Cashier extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
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
        HBox searchbar = new HBox();
        Button searchbtn = new Button("Search");
        TextField search = new TextField();
        search.setPrefWidth(300);
        searchbar.setPadding (new Insets (10,0,10,0));
        gridlist.setPadding(new Insets (0,10,10,10));
        
        
        Button[] categories = new Button[20];
        
        Button[] products = new Button[20];
        
        
       //Filling Categories in Girdlist
       
       for (int i = 0 ; i < categories.length;i++){
           
           categories[i]= new Button("Product " +(i+1));
           
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
        
        searchbar.getChildren().addAll(searchbtn,search);
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
        
        
        Button bt1 = new Button("Cash");
        Button bt2 = new Button("Delete");
        Button bt3 = new Button ("Main Menu");
        bt1.setPrefSize(230, 75);
        bt2.setPrefSize(230, 75);
        bt3.setPrefSize(230, 75);
        
//        bt1.setStyle("-fx-background-color : chartreuse ;-fx-border-color : black");
//        bt2.setStyle("-fx-background-color: chartreuse ;-fx-border-color:black");
//        bt3.setStyle("-fx-background-color: chartreuse ;-fx-border-color:black");
        
        
        // Creating Bottom Control panel 

        HBox controlbtns = new HBox();
       
        controlbtns.getChildren().add(bt3);
        controlbtns.setAlignment(Pos.BOTTOM_RIGHT);
        
        bpanel.getChildren().addAll(totalpanel,controlbtns);

        totalpanel.getChildren().addAll(lb4,bt1,bt2);
        
        root.setLeft(purchase);
        root.setBottom(bpanel);
        root.setCenter(itemspanel);
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("Cashier");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
