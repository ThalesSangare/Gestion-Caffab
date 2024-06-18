/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPDAO;

import DAO.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Meeriame
 */
public class IMP_USERS {
    String req="";
    PreparedStatement ps=null;
    ResultSet rs= null;
    Connection con=null;
    
    public int Enregistrer_user(String login,String pass,String droit,String etat){
        int retour=0;
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="insert into users(login,password,droit,etat) values(?,?,?,?)";
             try {
                 ps=con.prepareStatement(req,Statement.RETURN_GENERATED_KEYS);
                 ps.setString(1, login);
                 ps.setString(2, pass);
                 ps.setString(3, droit);
                 ps.setString(4, etat);
                 ps.executeUpdate();
                 rs=ps.getGeneratedKeys();
                 if(rs.next()){
                     retour=rs.getInt(1);
                 }
                 rs.close();
                 con.close();
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erreur denregistrer user "+ex.getLocalizedMessage());
                 retour=ex.getErrorCode();
             }
         }
         return retour;
    }
    
    public boolean modification_user(String anLogin,String nvLogin,String pass,String droit,String etat){
        boolean bol=false;
         con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="update users set login=?,password=?,droit=?,etat=? where login=?";
             try {
                 ps=con.prepareStatement(req);
                 ps.setString(1, nvLogin);
                 ps.setString(2, pass);
                 ps.setString(3, droit);
                 ps.setString(4, etat);
                 ps.setString(5, anLogin);
                 int val=ps.executeUpdate();
                 if(val!=0){
                     bol=true;
                 }
                 con.close();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,"Erreur de modification user");
             }
         }
         return bol;
    }
    
    public void charge_liste_user(JTable table){
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="select login,droit,etat from users";
             try {
                 DefaultTableModel model =(DefaultTableModel) table.getModel();
                 model.setRowCount(0);
                 int i=1;
                 ps=con.prepareStatement(req);
                 rs=ps.executeQuery();
                 while(rs.next()){
                     model.addRow(new Object[]{i,rs.getString(1),rs.getString(2),rs.getString(3)});
                     i++;
                 }
                 rs.close();
                 con.close();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,"Erreur de charge liste users " +e.getLocalizedMessage());
             }
         }
    }
    
}
