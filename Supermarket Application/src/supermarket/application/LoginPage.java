
package supermarket.application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Charbel
 */



public class LoginPage extends GridPane {
    
    
        
        private TextField username;
        private PasswordField pwBox;
        private Text scenetitle;
        public  LoginPage (){ 
        GridPane grid = new GridPane();
        this.setAlignment(Pos.CENTER);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(25, 25, 25, 25));
        
        
        Text scenetitle = new Text("Welcome");
        this.scenetitle = scenetitle;
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        this.add(scenetitle, 0, 0, 2, 1);

        Label userlbl = new Label("Username:");
        this.add(userlbl, 0, 1);

        TextField username = new TextField();
        this.add(username, 1, 1);

        Label pwlbl = new Label("Password:");
        this.add(pwlbl, 0, 2);

        PasswordField pwBox = new PasswordField();
        this.add(pwBox, 1, 2);
        
        Button login = new Button("Login");
        this.add(login, 1, 3);
        
        Button create = new Button("Create Account");
        this.add(create, 1, 4);
        
        login.setPrefSize(150,25);
        create.setPrefSize(150,25);

        login.setOnAction(e ->{
            
                this.username= username;
                this.pwBox=pwBox;
            
                changeToMain();
        });
        
        create.setOnAction(e ->{
            
            HomePage.changeToCreate();
            
        });
     }

        
       public void changeToMain(){
           
           //Admin Access
        
           if ("admin".equals(username.getText()) && "admin".equals(pwBox.getText())){
               
               
               HomePage.reset();
               
           }
           else {
               
               scenetitle.setText("Incorrect Username or\n"+"Password");
               System.out.println("Incorrect Username or Password");
           }
          
       }
   
}
