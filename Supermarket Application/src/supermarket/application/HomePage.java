package supermarket.application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author Owner
 */



public class HomePage extends Application{

    
    static Scene scene;
    static Stage primaryStage;
    
   
    
    @Override
    public void start(Stage primaryStage)  {
        VBox root = new VBox(20);
        this.primaryStage=primaryStage;
       
        Text scenetitle = new Text("Home Page");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        root.getChildren().add(scenetitle);
        root.setAlignment(Pos.CENTER);
        
        Button cashierBtn = new Button("Cashier");
        root.getChildren().add(cashierBtn);
        
        Button inventoryBtn = new Button("Inventory");
        root.getChildren().add(inventoryBtn);
        
        Button notificationBtn = new Button("Notifications");
        root.getChildren().add(notificationBtn);
        
        Button back = new Button("Back");
        root.getChildren().add(back);
        
        cashierBtn.setPrefSize(125,40);
        inventoryBtn.setPrefSize(125,40);
        notificationBtn.setPrefSize(125,40);
        back.setPrefSize(125,40);

        
         //Buttons Functions
        
        back.setOnAction(e->{
            
            changeToLogin();
        });
        
         cashierBtn.setOnAction(e->{
             
             changeToCashier();
         });
         
         
          inventoryBtn.setOnAction(e->{
             
             changeToInventory();
         });
      
          
          
         scene = new Scene(root, 300, 275);
        primaryStage.setTitle("Main Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
        changeToLogin();

    }
    
 
    
         public static  void changeToCashier(){
         
              CashierScene scene2 = new CashierScene();        

              Scene newwindow = new Scene(scene2,800,600);
              
              primaryStage.setScene(newwindow);
              primaryStage.centerOnScreen();
              primaryStage.setTitle("Cashier");
              
    }
    
         public static void changeToLogin() {
            
              LoginPage scene3 = new LoginPage();        

              Scene newwindow = new Scene(scene3,300,275);
              
              primaryStage.setScene(newwindow);
              primaryStage.centerOnScreen();
              primaryStage.setTitle("LoginPage");
        
    }
   
           public static  void changeToInventory() {
            
              Inventory scene4 = new Inventory();        

              Scene newwindow = new Scene(scene4,800,600);
              
              primaryStage.setScene(newwindow);
              primaryStage.centerOnScreen();
              primaryStage.setTitle("Inventory");
        
    }
           
        public  static void changeToCreate() {
            
            CreateAccount scene5 = new CreateAccount();        

              Scene newwindow = new Scene(scene5,300,275);
              
              primaryStage.setScene(newwindow);
              primaryStage.centerOnScreen();
              primaryStage.setTitle("Create Account");
        
    }
     
         public  static void changeToProduct() {
            
            Product scene6 = new Product();        

              Scene newwindow = new Scene(scene6,800,600);
              
              primaryStage.setScene(newwindow);
              primaryStage.centerOnScreen();
              primaryStage.setTitle("Product");
        
    }
         
    
            
        public  static void changeToProduct(String invSelected) {
            
            Product scene7 = new Product();        
            scene7.setInvTitle(invSelected);
              Scene newwindow = new Scene(scene7,800,600);
              
              primaryStage.setScene(newwindow);
              primaryStage.centerOnScreen();
              primaryStage.setTitle("Product");
        
    }
        
       
    
    static void reset() {
        
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.setTitle("Main Menu");
    }
    
    
     public static void main(String[] args) {
        launch(args);
    }
 
}
