/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPDAO;

import DAO.Apprenants;
import DAO.Connexion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TableView;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Meeriame
 */
public class IMP_Apprenants {
    String req="";
    PreparedStatement ps=null;
    ResultSet rs= null;
    Connection con=null;
        public int Insertion_Apprenants( Apprenants elev){
        int retour=0;
        con= new Connexion().getConnection();
        if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
        else{
            req="insert into apprenants(matricule,nom_apprenant,prenom_apprenant,genre_apprenant,tel_apprenant,photo) values (?,?,?,?,?,?)";
            try {
                ps=con.prepareStatement(req,Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, elev.getMatricule());
                ps.setString(2, elev.getNom());
                ps.setString(3, elev.getPrenom());
                ps.setString(4, elev.getGenre());
                ps.setString(5, elev.getTel());
                ps.setBlob(6, new Image_vers_byte().get_byte_image(elev.getChemin_photo()));
                ps.executeUpdate();
                rs = ps.getGeneratedKeys();
                if(rs.next()){
                    retour = rs.getInt(1);
                }
                rs.close();
                con.close();
            } catch (SQLException ex) {
               // JOptionPane.showMessageDialog(null, "Erreur d'Enregistrement Eleves " + ex.getLocalizedMessage());
                retour=ex.getErrorCode();
            }
        }
        return retour;
    }
        
        public int Modifier_apprenant(Apprenants appre,String matricule,boolean etat_photo){
         int retour=0;
         con=new Connexion().getConnection();
    
      if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
      }
      else{
          if(etat_photo){
              req="UPDATE apprenants set nom_apprenant=?,prenom_apprenant=?,tel_apprenant=?,genre_apprenant=?,photo=? where matricule=?";  
          }
          else{
             req="UPDATE apprenants set nom_apprenant=?,prenom_apprenant=?,tel_apprenant=?,genre_apprenant=? where matricule=?";  
          }
        
          try {
              ps=con.prepareStatement(req);
              ps.setString(1, appre.getNom());
              ps.setString(2, appre.getPrenom());
              ps.setString(3, appre.getTel());
              ps.setString(4, appre.getGenre());
              if(etat_photo){
                  ps.setBlob(5, new Image_vers_byte().get_byte_image(appre.getChemin_photo()));
                   ps.setString(6, matricule);
              }
              else{
                 
               ps.setString(5, matricule);   
              }
              
              ps.executeUpdate();
              con.close();
              retour=1;
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "erreur de modification apprenant "+ex.getLocalizedMessage());
          }
      }
      return retour;
     }

     
    //===RECHERCHER 
 public boolean Recherche_apprenant(JTable table,String telephone){
      boolean bol=false; 
      con=new Connexion().getConnection();
      if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
      }
      else{
          req="Select matricule,nom_apprenant,prenom_apprenant,genre_apprenant,tel_apprenant from apprenants where tel_apprenant like'%"+telephone+"%'";
          try {
              DefaultTableModel model = (DefaultTableModel) table.getModel();
              model.setRowCount(0);
              int i=1;
              ps=con.prepareStatement(req);
              rs=ps.executeQuery();
              while(rs.next()){
                  model.addRow(new Object[]{i,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                  i++;
                  bol=true;
              }
              rs.close();
              con.close();
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur de recherche apprenant "+e.getLocalizedMessage());
          }
      }
          return bol;
      }
    
       //++++++++++++++++ get informations perseonnel selon le matricule
        
        public  Apprenants get_information_apprenant_selon_telephone(String tel){
        con=new Connexion().getConnection();
        Apprenants appren=new Apprenants();
      if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
      }
      else{
         req="select matricule,nom_apprenant,prenom_apprenant,genre_apprenant,tel_apprenant,photo from apprenants where tel_apprenant=?";
          try {
              ps=con.prepareStatement(req);
              ps.setString(1, tel);
              rs=ps.executeQuery();
              if(rs.next()){
                 // JOptionPane.showMessageDialog(null, "je suis la");
                  appren.setMatricule(rs.getString(1));
                  appren.setNom(rs.getString(2));
                  appren.setPrenom(rs.getString(3));
                  appren.setGenre(rs.getString(4));
                  appren.setTel(rs.getString(5));
                  appren.setPhoto(rs.getBytes(6));
              }
               con.close();
               rs.close();
             } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erreur de get_informations apprenants "+ex.getLocalizedMessage());
            
           }          
      }
      return appren;
    }
 
 
 
 
 
    //===MODIFIER
    public boolean ModifationApprenant(String matricule, String nom, String prenom, String genre, String tel){
        boolean bol =false;
        con=new Connexion().getConnection();
        if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
        else{
            req="update apprenants set nom_apprenant=?,prenom_apprenant=?,genre_apprenant=?,tel_apprenant=? where matricule=?";
            try {
                ps=con.prepareStatement(req);
                ps.setString(1, nom);
                ps.setString(2, prenom);
                ps.setString(3, genre);
                ps.setString(4, tel);
                ps.setString(5, matricule);
                int val=ps.executeUpdate();
                if(val!=0){
                    bol=true;
                }
                con.close();
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,"Erreur de modification "+ e.getLocalizedMessage());
            }
        }
        return bol;
    }
    
    public int Get_id_apprenants(String matricule){
        int retour=0;
        con= new Connexion().getConnection();
        if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
        else{
            req="select id_apprenant from apprenants where matricule=?";
            try {
                ps=con.prepareStatement(req);
                ps.setString(1, matricule);
                rs=ps.executeQuery();
                if(rs.next()){
                    retour=rs.getInt(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur de get_id_apprenant "+ e.getLocalizedMessage());
            }
        }
        return retour;
    }
    
    
        public int Get_id_apprenants_selon_tel(String telephone){
        int retour=0;
        con= new Connexion().getConnection();
        if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
        else{
             req="select id_apprenant from apprenants where tel_apprenant=?";
            try {
                ps=con.prepareStatement(req);
                ps.setString(1, telephone);
                rs=ps.executeQuery();
                if(rs.next()){
                    retour=rs.getInt(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur de get_id_apprenant "+ e.getLocalizedMessage());
            }
        }
        return retour;
    }
    
    
    
    
     public void liste_des_apprenants(JTable table ){
       
         con=new Connexion().getConnection();
        if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
        }
        else{
            req="select matricule,nom_apprenant,prenom_apprenant,genre_apprenant,tel_apprenant from apprenants";
            try {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                ps=con.prepareStatement(req);
                int i=1;
                rs=ps.executeQuery();
                while(rs.next()){
                    model.addRow(new Object[]{i,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                    i++;
                }
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,"Erreur d'affichage jtable Apprenant "+ e.getLocalizedMessage());
            }
        }
        }
    
     public void charge_combo_matricule(JComboBox com){
          con=new Connexion().getConnection();
        if(con == null){
            JOptionPane.showMessageDialog(null, "Serveur inaccessible");
        }
        else{
            req="select matricule from apprenants";
            try {
                ps=con.prepareStatement(req);
                rs=ps.executeQuery();
                com.addItem("Selectionner");
                while(rs.next()){
                    com.addItem(rs.getString(1));
                }
                rs.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur de charge_combo_matricule apprenant " + e.getLocalizedMessage());
            }
        }
     }
     

}
