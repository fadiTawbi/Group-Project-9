
package supermarket.application.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import supermarket.application.CreateAccount;

/**
 *
 * @author scorp
 */
public class ConnectToDb {
    private static ConnectToDb _connectToDb = null;
    
    String host = "localhost";
    String username = "root";
    String rootPassword = "";
    String connectionString="jdbc:mysql://"+host+"/local_database";
    
    private ConnectToDb(){
        
    }
    
    public static ConnectToDb getInstance(){
        if(_connectToDb==null){
            _connectToDb=new ConnectToDb();
            init();
        }
        return _connectToDb;
    }
    
    public static void init(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectToDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
       
  
        // Load the JDBC driver

        // Establish a connection
       return DriverManager.getConnection(connectionString,username,rootPassword);

    }
    
    public void executeStatement(Connection connection, String statementStr){
        
        try{
            connection = getConnection();
            
            Statement statement = connection.createStatement();
            
            statement.executeUpdate(statementStr);
        }
        catch(ClassNotFoundException ex1){
            
        }
        catch(SQLException ex2){
            
        }
        
    }
    
    public ResultSet executeQuery(Connection connection, String query){
        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            return statement.executeQuery(query);
        }
        catch(ClassNotFoundException ex1){
            
        }
        catch(SQLException ex2){
            
        }
        return null;
    }
    
    
       
   
}
