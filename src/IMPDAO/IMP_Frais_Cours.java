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
public class IMP_Frais_Cours {

    String req = "";
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con = null;

    public int Enregistrer_frais_cours(String montant, String nom_cours) {
        int retour = 0;
        int id_cour = new IMP_Cours().Get_id_cours_selon_nom_cours(nom_cours);
        con = new Connexion().getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Serveur inactif");
        } else {
            req = "insert into frais_cours(montant_frais_cours,id_cours_frais) values(?,?)";
            try {
                ps = con.prepareStatement(req, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, montant);
                ps.setInt(2, id_cour);
                ps.executeUpdate();
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    retour = rs.getInt(1);
                }
                rs.close();
                con.close();
            } catch (SQLException ex) {
//                  JOptionPane.showMessageDialog(null,"Erreur d'insertion frais_cours "+ ex.getLocalizedMessage());
                retour = ex.getErrorCode();
            }
        }
        return retour;
    }

    public boolean Modifier_frais_cours(String nom_cours, int montant) {
        boolean bol = false;
        int ID = new IMP_Cours().Get_id_cours_selon_nom_cours(nom_cours);
        con = new Connexion().getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Serveur inactif");
        } else {
            req = "update frais_cours set montant_frais_cours=? where id_cours_frais=?";
            try {
                ps = con.prepareStatement(req);
                ps.setInt(1, montant);
                ps.setInt(2, ID);
                ps.executeUpdate();
                bol = true;
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erreur de modification frais_cours " + e.getLocalizedMessage());
            }
        }
        return bol;
    }
    
        public boolean recherche_frais_cours(JTable table, String nom_cours){
         boolean bol=false;
         int id_frais_cours=Get_id_frais_cours(nom_cours);
         con=new Connexion().getConnection();
      if(con==null){
          JOptionPane.showMessageDialog(null, "Service inactif");
      }
      else{
          req="select montant_frais_cours,id_cours_frais from frais_cours where id_cours_frais=? like'%"+nom_cours+"%'";
          try {
              ps=con.prepareStatement(req);
              DefaultTableModel mode=(DefaultTableModel) table.getModel();
              mode.setRowCount(0);
              ps.setInt(1, id_frais_cours);
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
    
    
    

    public int Get_id_frais_cours(String nom_cours) {
        int retour = 0;
        int id_cours = new IMP_Cours().Get_id_cours_selon_nom_cours(nom_cours);
        con = new Connexion().getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Serveur inactif");
        } else {
            req = "select id_frais_cours from frais_cours where id_cours_frais=?";
            try {
                ps = con.prepareStatement(req);
                ps.setInt(1, id_cours);
                rs = ps.executeQuery();
                while (rs.next()) {
                    retour = rs.getInt(1);
                }
                con.close();
                rs.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur de get_id_frais_cours " + e.getLocalizedMessage());
            }
        }
        return retour;
    }

    public String Get_montant_cours_selon_nom_cours(String nom_cours) {
        String retour = "";
        int id_cours = new IMP_Cours().Get_id_cours_selon_nom_cours(nom_cours);
        con = new Connexion().getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Serveur inactif");
        } else {
            req = "select montant_frais_cours from frais_cours where id_cours_frais=?";
            try {
                ps = con.prepareStatement(req);
                ps.setInt(1, id_cours);
                rs = ps.executeQuery();
                while (rs.next()) {
                    retour = rs.getString(1);
                }
                con.close();
                rs.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur de get_id_frais_cours " + e.getLocalizedMessage());
            }
        }
        return retour;
    }

    
    public void charge_liste_frais_cours(JTable table){
        con = new Connexion().getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Serveur inactif");
        } else{
            req="select lib_cours,montant_frais_cours from cours,frais_cours where id_cours=id_cours_frais";
            try {
                DefaultTableModel model =(DefaultTableModel) table.getModel();
                model.setRowCount(0);
                int i=1;
                ps=con.prepareStatement(req);
                rs=ps.executeQuery();
                while(rs.next()){
                    model.addRow(new Object[]{i,rs.getString(1),rs.getInt(2)});
                    i++;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur de charge liste frais_cours");
            }
        }
    }
}
