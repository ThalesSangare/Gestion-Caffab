
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Thales
 */
public class Connexion {
    
    String url="jdbc:mysql://localhost:3306/gestionapprenantcaffab";
    String user="root";
    String password="";
    Connection con = null;
    
    public Connection getConnection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, user, password);
//            JOptionPane.showMessageDialog(null, "Connection etablie");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erreur de connection"+e.getLocalizedMessage());
        }
        return con;
    } 
    
}
