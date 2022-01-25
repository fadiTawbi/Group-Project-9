
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

public class CreateAccount extends GridPane{

    
    public  CreateAccount()  {
        
        this.setAlignment(Pos.CENTER);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(25, 25, 25, 25));
       
       
        Text scenetitle = new Text("Create your account!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        this.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Username:");
        this.add(userName, 0, 1);

        TextField userTextField = new TextField();
        this.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        this.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        this.add(pwBox, 1, 2);
        
        Label accessCode = new Label("Access Code: ");
        this.add(accessCode, 0, 3);

        TextField accessType = new TextField();
        this.add(accessType, 1, 3);
        
        
        Button btn1 = new Button("Create Account");
        this.add(btn1, 1, 4);
        
        Button btn2 = new Button ("back");
        this.add(btn2, 1, 5);
        
       
        btn2.setOnAction(e->{
            
            HomePage.changeToLogin();
            
        });
        
        
        
    }
    
    
    
    
}
