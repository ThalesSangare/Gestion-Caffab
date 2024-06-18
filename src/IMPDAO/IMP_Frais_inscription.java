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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Meeriame
 */
public class IMP_Frais_inscription {
    String req="";
    PreparedStatement ps=null;
    ResultSet rs= null;
    Connection con=null;
    
    
    public int get_id_frais_inscrip(String type){
        int retour=0;
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="select id_frais_inscrip from frais_inscription where type_inscription=?";
             try {
                 ps=con.prepareStatement(req);
                 ps.setString(1, type);
                 rs=ps.executeQuery();
                 if(rs.next()){
                     retour=rs.getInt(1);
                 }
                 rs.close();
                 con.close();
             } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null,"Erreur de get_id_frais_inscription "+ e.getLocalizedMessage());
             }
         }
         return retour;
    }
    
    
    
     public String get_type_inscrip(int id){
        String retour="";
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="select type_inscription from frais_inscription where id_frais_inscrip=?";
             try {
                 ps=con.prepareStatement(req);
                 ps.setInt(1, id);
                 rs=ps.executeQuery();
                 if(rs.next()){
                     retour=rs.getString(1);
                 }
                 rs.close();
                 con.close();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,"Erreur de get_type_inscrip "+ e.getLocalizedMessage());
             }
         }
         return retour;
    }
     
     
     public String get_montant_inscrip(String type){
        String retour="";
        int id_frais_inscrip=get_id_frais_inscrip(type);
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="select montant_frais_inscrip from frais_inscription where id_frais_inscrip=?";
             try {
                 ps=con.prepareStatement(req);
                 ps.setInt(1, id_frais_inscrip);
                 rs=ps.executeQuery();
                 if(rs.next()){
                     retour=rs.getString(1);
                 }
                 rs.close();
                 con.close();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,"Erreur de get_type_inscrip "+ e.getLocalizedMessage());
             }
         }
         return retour;
    }
    
    public int AjouterfraisInscrip(int montant, String type){
        int retour=0;
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="insert into frais_inscription (montant_frais_inscrip,type_inscription) values (?,?)";
             try {
                 ps=con.prepareStatement(req,Statement.RETURN_GENERATED_KEYS);
                 ps.setInt(1, montant);
                 ps.setString(2, type);
                 ps.executeUpdate();
                 rs = ps.getGeneratedKeys();
                 if(rs.next()){
                     retour = rs.getInt(1);
                 }
                 rs.close();
                 con.close();
             } catch (SQLException ex) {
                 retour=ex.getErrorCode();
             }
         }
        return retour;
    }
    
    public boolean Modifier_Frais_inscription(int montant, String type){
        boolean bol=false;
        int id = get_id_frais_inscrip(type);
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="update frais_inscription set montant_frais_inscrip=? where id_frais_inscrip=?";
             try {
                 ps=con.prepareStatement(req);
                 ps.setInt(1, montant);
                 ps.setInt(2, id);
                 ps.executeUpdate();
                 bol=true;
                 con.close();
             } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null,"Erreur de modification frais_inscription "+ e.getLocalizedMessage());
             }
         }
         return bol;
    }
    
    public void charge_liste_frais_inscrip(JTable table){
       
         con=new Connexion().getConnection();
        if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
        }
        else{
            req="select type_inscription,montant_frais_inscrip from frais_inscription";
            try {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                ps=con.prepareStatement(req);
                int i=1;
                rs=ps.executeQuery();
                while(rs.next()){
                    model.addRow(new Object[]{i,rs.getString(1),rs.getInt(2)});
                    i++;
                }
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,"Erreur d'affichage jtable Apprenant "+ e.getLocalizedMessage());
            }
        }
        }
    
    //===== CHARGEMENT DU COMBO TYPE INSCRIPTION
    public void charge_combo_typeInscription(JComboBox comb){
//        String type=new IMP_Frais_inscription().get_type_inscrip(id_frais_inscrip);
        
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="select type_inscription from frais_inscription";
             try {
                 ps=con.prepareStatement(req);
//                 ps.setString(1, type);
                 rs=ps.executeQuery();
                 comb.addItem("Selectionner");
                 while(rs.next()){
                     comb.addItem(rs.getString(1));
                 }
             } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null,"Erreur de charge combo_type_inscription "+ e.getLocalizedMessage());
             }
         }
    }
    
}
