/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Notification extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TableView table=new TableView();
        TableColumn date=new TableColumn("dat");
        TableColumn prod=new TableColumn("product");
        TableColumn msg=new TableColumn("message");
        table.getColumns().add(date);
        table.getColumns().add(prod);
        table.getColumns().add(msg);
        
        
        StackPane root = new StackPane();
       // root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10,10,10,10));
        root.setPrefSize(200, 200);
        root.getChildren().add(table);
        
        Scene scene = new Scene(root, 300, 400);
        
        primaryStage.setTitle("Notification");
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
