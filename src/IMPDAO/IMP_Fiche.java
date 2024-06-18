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
public class IMP_Fiche {
    String req="";
    PreparedStatement ps=null;
    ResultSet rs= null;
    Connection con=null;
    
    public int Enregistrer_fiche(String nom_cours, String nbrejour, String heureSeance, String duree,String nom_cours_frais){
        int retour=0;
        int id_cours=new IMP_Cours().Get_id_cours_selon_nom_cours(nom_cours);
        int id_fraisCours=new IMP_Frais_Cours().Get_id_frais_cours(nom_cours_frais);
        con = new Connexion().getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Serveur inaccessible");
        } else {
            req="insert into fiche_renseign(id_cours_fiche,nbre_jour,heures_seances,duree,id_fraisCours_fiche) values (?,?,?,?,?)";
            try {
                ps=con.prepareStatement(req,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, id_cours);
                ps.setString(2,nbrejour);
                ps.setString(3,heureSeance);
                ps.setString(4,duree);
                ps.setInt(5,id_fraisCours);
                ps.executeUpdate();
                rs=ps.getGeneratedKeys();
                if(rs.next()){
                    retour=rs.getInt(1);
                }
                rs.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erreur d'insertion fiche_Renseign" +ex.getLocalizedMessage());
                retour=ex.getErrorCode();
            }
        }
        return retour;
    }
    
    
    public boolean Modifier_fiche(String nom_cours,String nbrejour, String heureSeance, String duree) {
        boolean bol = false;
        int ID = new IMP_Cours().Get_id_cours_selon_nom_cours(nom_cours);
        con = new Connexion().getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Serveur inactif");
        } else {
            req = "update fiche_renseign set nbre_jour=?,heures_seances=?,duree=? where id_cours_fiche=?";
            try {
                ps = con.prepareStatement(req);
                ps.setString(1, nbrejour);
                ps.setString(2, heureSeance);
                ps.setString(3, duree);
                ps.setInt(4,ID); 
                ps.executeUpdate();
                bol = true;
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erreur de modification fiche_Renseign " + e.getLocalizedMessage());
            }
        }
        return bol;
    }
    
     public void charge_fiche_renseign(JTable table){
        con = new Connexion().getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Serveur inactif");
        } else{
            req="select lib_cours,nbre_jour,heures_seances,duree,montant_frais_cours from cours,fiche_renseign,frais_cours where id_cours_fiche=id_cours and id_fraisCours_fiche=id_frais_cours";
            try {
                DefaultTableModel model =(DefaultTableModel) table.getModel();
                model.setRowCount(0);
                int i=1;
                ps=con.prepareStatement(req);
                rs=ps.executeQuery();
                while(rs.next()){
                    model.addRow(new Object[]{i,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)});
                    i++;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur de charge liste fiche renseignement " +e.getLocalizedMessage());
            }
        }
    }
    
}
