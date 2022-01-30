


package supermarket.application;



import com.sun.tracing.ProviderName;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
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
import supermarket.application.classes.ConnectToDb;
import supermarket.application.classes.products;




/**
 *
 * @author Fadi
 */


public class CashierScene extends BorderPane {
    
    
    
    
    public  CashierScene()  {
        
        
        //added coment to test push
        
        //Creating Left Panel with items purchases 
        
        HBox purchase = new HBox();
        VBox items = new VBox();
        VBox quantity = new VBox();
        VBox price = new VBox();
        Label lb1 = new Label("Items");
        Label lb2 = new Label("Quantity");
        Label lb3 = new Label ("Total");
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
        GridPane gridlist2 = new GridPane();

        gridlist.setHgap(5);
        gridlist.setVgap(5);
        gridlist2.setHgap(5);
        gridlist2.setVgap(5);
        
        HBox searchbar = new HBox();
        searchbar.setSpacing(25);
        searchbar.setPadding(new Insets (0,10,10,10));
        itemspanel.setPadding(new Insets (5,5,5,5));
        Button searchbtn = new Button("Search");
        TextField searchtxt = new TextField();
        Button backButton = new Button("Back");
        
        searchtxt.setPrefSize(200,40);
        searchbtn.setPrefSize(100, 40);
        backButton.setPrefSize(100, 40);
        
        gridlist.setPadding(new Insets (0,10,10,10));
        gridlist2.setPadding(new Insets (0,10,10,10));
 
        
        Button[] categories = new Button[6];

        
            
           
 
       //Filling Categories in Girdlist
       
     
       
       categories[0]= new Button("bread");
       categories[1]= new Button("Cheese");
       categories[2]= new Button("Fruit");
       categories[3]= new Button("Meat");
       categories[4]= new Button("Pasta");
       categories[5]= new Button("Vegetables");
       
       
       
       
       for (int i = 0 ; i < categories.length;i++){
           
                if (i<5){     
                gridlist.add(categories[i],i , 0);
              }
                if (5 <= i && i<10){
                gridlist.add(categories[i],i-5 ,1);
              }        
            
             categories[i].setPrefSize(110, 100);
             
             String categoryName = categories[i].getText();
       
              categories[i].setOnAction(e -> {
              
                 String[] names= getProducts(categoryName);
              
                  
                 
                  
                 
                         
       //Filling products in Girdlist
            
       Button[] products = new Button[names.length];
       
       
       for (int i2 = 0 ; i2 < products.length;i2++){
                    products[i2]= new Button(names[i2]);
                         if (i2<5){     
                         gridlist2.add(products[i2],i2 , 0);
                       }
                         if (5 <= i2 && i2<10){
                         gridlist2.add(products[i2],i2-5 ,1);
                       }
                      
                         
                      products[i2].setPrefSize(110, 100);
                      
                      
                }
//       
//       
//       
       
//                  itemspanel.getChildren().remove(gridlist);
//                  itemspanel.getChildren().addAll(gridlist2);
       });
                  
       
       
       }
   
       
       
       
       
       
        searchbar.getChildren().addAll(searchbtn,searchtxt,backButton);
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
       
        backButton.setOnAction(e ->{ 
            
           itemspanel.getChildren().remove(gridlist2);
           itemspanel.getChildren().addAll(gridlist);
            
        });
        
        this.setLeft(purchase);
        this.setBottom(bpanel);
        this.setCenter(itemspanel);
        this.setPadding(new Insets (10,10,10,10));
        



         
    }
    
    private void getProduct (){
        
        products product = new products();
        
        
    }

    private void changeToHomePage() {
            HomePage.reset();
    }
    
    public String[] getProducts(String name){
        
        
        Connection connection =null;
        String[] prodname = null;
        
        try {
            connection = ConnectToDb.getInstance().getConnection();
            
            ResultSet num=ConnectToDb.getInstance().executeQuery(connection,"Select item_id From inventory Where name ='"+name+"'");
             int prod_id;
             int i = 0 ;
            
            while(num.next()){
           
                i++;
           
            }  
            
            prodname = new String[i+1];
            
            
            
            
             ResultSet num2 =ConnectToDb.getInstance().executeQuery(connection,"Select item_id From inventory Where name ='"+name+"'");
             
             int[] itemsnumber= new int[i];
             
             
             for (int index = 0 ; index <i+1 ; index++){
             
                 prod_id = num2.getInt("item_id");
                 
                 itemsnumber[index]= prod_id;
                 
                 
                 num2.next();
                         }
            
//             ResultSet names =ConnectToDb.getInstance().executeQuery(connection,"Select Name From Product Where Code ='"+prod_id+"'");
//                 
//                 prodname[index] = names.getString("Name");
//                 
//             
            
            
            
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CashierScene.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CashierScene.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prodname;
        
        
        
    }
 
    
}
