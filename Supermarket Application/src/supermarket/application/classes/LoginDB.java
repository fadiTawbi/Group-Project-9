/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.application.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class LoginDB {
    
    private static LoginDB _loginDb=null;
    
    private LoginDB(){
        
    }
    
    public static LoginDB getInstance(){
        if(_loginDb==null){
            _loginDb = new LoginDB();
        }
        return _loginDb;
    }
    
    public boolean login(String username, String password){
        Connection connection = null;
        boolean userExists = false;
        try{
            connection = ConnectToDb.getInstance().getConnection();
            ResultSet result = ConnectToDb.getInstance().executeQuery(connection, "SELECT * FROM User WHERE username='"+username+"' AND "
                        + "pass='"+password+"'");
            if(result.next()){
                userExists = true;
            }
        }
        catch(Exception ex){

        }
        finally{
            try {
                if(connection!=null)
                    connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(LoginDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return userExists;
    }
}
