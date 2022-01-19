
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
public class HomePage extends Application{

    @Override
    public void start(Stage primaryStage)  {
        VBox root = new VBox(20);
        
        Scene scene = new Scene(root, 300, 275);
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
        
        
        
        
        primaryStage.setTitle("Homepage");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
