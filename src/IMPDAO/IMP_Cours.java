/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMPDAO;

import DAO.Connexion;
import DAO.Cours;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Meeriame
 */
public class IMP_Cours {
     String req="";
    PreparedStatement ps=null;
    ResultSet rs= null;
    Connection con=null;
    
     public boolean verifi_cours(String nom_cours){
         boolean retour = false;
        con = new Connexion().getConnection();
        if(con == null){
            JOptionPane.showMessageDialog(null, "Serveur inactif");
        }
        else{
            req = "select lib_cours from cours where lib_cours=?";
             try {
                 ps = con.prepareStatement(req);
                 ps.setString(1, nom_cours);
                 rs = ps.executeQuery();
                 if(rs.next()){
                     retour = true;
                 }
                 rs.close();
                 con.close();
                } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erreur de vériification Nom_cours " + ex.getLocalizedMessage());
             }
        }
        return retour;
    } 
    
    public boolean AjouterCours(Cours cours){
        boolean retour=false;
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="insert into cours (lib_cours) values (?)";
             try {
                 ps=con.prepareStatement(req);
                 ps.setString(1, cours.getLibelCours());
                int val= ps.executeUpdate();
                if(val!=0){
                    retour=true;
                }
                 con.close();
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,"Erreur d'ajout du cours "+ ex.getLocalizedMessage());
//                 retour=ex.getErrorCode();
             }
         }
        return retour;
    }
    
    //=== modification DES COURS
    public boolean ModifierCOURS(String anCours,String libCours){
    boolean bol=false;
    int ID=Get_id_cours_selon_nom_cours(anCours);
    con= new Connexion().getConnection();
      if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
      else{
          req="update cours set lib_cours=? where id_cours=?";
          try {
              ps=con.prepareStatement(req);
              ps.setString(1, libCours);
              ps.setInt(2, ID);
              int val=ps.executeUpdate();
              if(val!=0){
                  bol=true;
              }
              con.close();
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur de modification du cours "+ e.getLocalizedMessage());
          }
      }
      return bol;
    }
    
    //=== SUPPRIMER DES COURS
    public boolean SupprimerCours(String libelle){
        boolean bol=false;
        con=new Connexion().getConnection();
        if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
        else{
            req="delete from cours where lib_cours=?";
            try {
                ps=con.prepareStatement(req);
                ps.setString(1, libelle);
                int val=ps.executeUpdate();
                if(val!=0){
                    bol=true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur de Supperssion du cours "+ e.getLocalizedMessage());
            }
        }
        return bol;
    }
    
    //=== AFFICHER DES COURS
    public void AfficherCours(){
        con =new Connexion().getConnection();
        if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
        else{
            req="Select * from cours";
            try {
                ps=con.prepareStatement(req);
                rs=ps.executeQuery();
                while(rs.next()){
                    System.out.println("===========================");
                    System.out.println(" Cours de : " +rs.getString(2));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur d'Affichage des cours "+ e.getLocalizedMessage());
            }
        }
    }
    
    //=============== RECERCHER UN COURS 
    public boolean recherche_cours(JTable table, String nom_cours){
         boolean bol=false;
         con=new Connexion().getConnection();
      if(con==null){
          JOptionPane.showMessageDialog(null, "Service inactif");
      }
      else{
          req="select lib_cours from cours where lib_cours like'%"+nom_cours+"%'";
          try {
              ps=con.prepareStatement(req);
              DefaultTableModel mode=(DefaultTableModel) table.getModel();
              mode.setRowCount(0);
             // ps.setString(1, nom_cours);
              rs=ps.executeQuery();
              int i=1;
              while(rs.next()){
                  mode.addRow(new Object[]{i,rs.getString(1)});
                  i++;
                  bol=true;
              }
              rs.close();
               con.close();
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur de recherche cours"+e.getLocalizedMessage());
          }
      }
      return bol;
     }
    
    public int Get_id_cours_selon_nom_cours(String nom_cours){
        int retour=0;
         con =new Connexion().getConnection();
        if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
        else{
            req="select id_cours from cours where lib_cours=?";
            try {
                ps=con.prepareStatement(req);
                ps.setString(1, nom_cours);
                rs=ps.executeQuery();
                 while(rs.next()){
                    retour =rs.getInt(1);
                }
                con.close();
                rs.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur de get_id_cours "+ e.getLocalizedMessage());
            }
        }
        return retour;
    }
    
    public String Get_nom_cours_selon_id(int id){
        String retour="";
         con =new Connexion().getConnection();
        if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
        else{
            req="select lib_cours  from cours where id_cours=?";
            try {
                ps=con.prepareStatement(req);
                ps.setInt(1, id);
                rs=ps.executeQuery();
                 if(rs.next()){
                    retour =rs.getString(1);
                }
                con.close();
                rs.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur de get_nom_cours "+ e.getLocalizedMessage());
            }
        }
        return retour;
    }
    
    
     public void charge_combo_cours(JComboBox comb){
//        String type=new IMP_Frais_inscription().get_type_inscrip(id_frais_inscrip);
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="select lib_cours from cours";
             try {
                 ps=con.prepareStatement(req);
//                 ps.setString(1, type);
                 rs=ps.executeQuery();
                 comb.removeAllItems();
                 comb.addItem("Selectionner");
                 while(rs.next()){
                     comb.addItem(rs.getString(1));
                 }
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,"Erreur de charge combo_type_inscription "+ e.getLocalizedMessage());
             }
         }
    }
     
     public void Liste_des_cours(JTable tabl){
          con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="select lib_cours from cours";
             try {
                 DefaultTableModel model = (DefaultTableModel) tabl.getModel();
                 model.setRowCount(0);
                 ps=con.prepareStatement(req);
                 int i=1; 
                 rs=ps.executeQuery();
                  while(rs.next()){
                      model.addRow(new Object[]{i,rs.getString(1)});
                      i++;
                  }
                  rs.close();
                  con.close();
             } catch (Exception e) {
                  JOptionPane.showMessageDialog(null,"Erreur d'affichage jtable Cours "+ e.getLocalizedMessage());
             }
         }
     }
}
