
package supermarket.application.classes;

/**
 *
 * @author Manuel
 */

    public class user {
        
    private String username;
    private String id;
    private String pass;

    public user(String username, String id, String pass) {
        this.username = username;
        this.id = id;
        this.pass = pass;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}
