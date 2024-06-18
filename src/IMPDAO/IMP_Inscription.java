
package IMPDAO;

import DAO.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Meeriame
 */
public class IMP_Inscription {
    String req="";
    PreparedStatement ps=null;
    ResultSet rs= null;
    Connection con=null;

    
   
    public boolean InscriptionApprenant(String matricule_appren,String nom_cours,String nom_cour_frais,String type_inscrip,String type_inscripp,int id_facture){
         boolean retour=false;
         int id_apprenant= new IMP_Apprenants().Get_id_apprenants(matricule_appren);
         int id_cours = new IMP_Cours().Get_id_cours_selon_nom_cours(nom_cours);
         int id_frais_cours= new IMP_Frais_Cours().Get_id_frais_cours(nom_cour_frais);
         int id_frais_inscrip= new IMP_Frais_inscription().get_id_frais_inscrip(type_inscrip);
         String date=new Imp_Get_DATE().get_date_systeme();
        con=new Connexion().getConnection();
      if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
      }
      else{ //id_fraisInscrip_inscrip
          req="insert into inscription(id_apprenant_inscrip,id_cours_inscrip,id_frais_cours_inscrip,id_fraisInscrip_inscrip,type_inscrip,id_facture_inscrip,date_inscrip) values(?,?,?,?,?,?,?)";
          try {
              ps=con.prepareStatement(req);
              ps.setInt(1, id_apprenant);
              ps.setInt(2, id_cours);
              ps.setInt(3, id_frais_cours);
              ps.setInt(4, id_frais_inscrip);
              ps.setString(5, type_inscripp);
              ps.setInt(6, id_facture);
              ps.setString(7, date);
              int val=ps.executeUpdate();
              if(val!=0){
                  retour= true;
              }
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"Erreur d'insertion Inscription "+ e.getLocalizedMessage());
          }
      }
      return retour;
    }
    
    //=============MODIFICATION INSCRIPTION
     public int ModificationApprenant(String matricule,String nom_cour,String nom_cour_frais,String typefrais,String type){
         int retour=0;
         int id_apprenant= new IMP_Apprenants().Get_id_apprenants(matricule);
         int id_cours = new IMP_Cours().Get_id_cours_selon_nom_cours(nom_cour);
         int id_frais_cours= new IMP_Frais_Cours().Get_id_frais_cours(nom_cour_frais);
         int id_frais_inscrip= new IMP_Frais_inscription().get_id_frais_inscrip(typefrais);
         int id_inscrip=new IMP_Inscription().get_id_inscrip_selon_matri_et_cours(matricule, nom_cour);
         String date=new Imp_Get_DATE().get_date_systeme();
        con=new Connexion().getConnection();
      if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
      }
      else{ //id_fraisInscrip_inscrip
          req="update inscription set id_apprenant_inscrip=?,id_cours_inscrip=?,id_frais_cours_inscrip=?,id_fraisInscrip_inscrip=?,type_inscrip=?,date_inscrip=? where id_inscrip=?";
          try {
              ps=con.prepareStatement(req);
              ps.setInt(1, id_apprenant);
              ps.setInt(2, id_cours);
              ps.setInt(3, id_frais_cours);
              ps.setInt(4, id_frais_inscrip);
              ps.setString(5, type);
              ps.setString(6, date);
              ps.setInt(7, id_inscrip);
              retour=ps.executeUpdate();
              con.close();
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"Erreur de modification Inscription "+ e.getLocalizedMessage());
              retour = e.getErrorCode();
          }
      }
      return retour;
    }
     
     
    
    public int Net_a_payer(String type_inscrip, String nom_cours){
       int retour=0;
        int id_frais_inscrip= new IMP_Frais_inscription().get_id_frais_inscrip(type_inscrip);
        int id_frais_cours= new IMP_Frais_Cours().Get_id_frais_cours(nom_cours);
        con=new Connexion().getConnection();
        if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
        }
        else{
            req="SELECT SUM(montant_frais_inscrip + montant_frais_cours) FROM frais_inscription, frais_cours WHERE id_frais_inscrip=? AND id_frais_cours=?";
            try {
                ps=con.prepareStatement(req);
                ps.setInt(1, id_frais_inscrip);
                ps.setInt(2, id_frais_cours);
                rs=ps.executeQuery();
                if(rs.next()){
                    retour=rs.getInt(1);
                }
                con.close();
                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur de calcule net a payer "+ e.getLocalizedMessage());
            }
        }
        return retour;
    }
    //============VERIFICATION SI UN APPRENANT EST DEJA INSCRIT DANS UN COURS
    public int Verification_apprenant_inscrit(String matricule,String nom_cours){
        int retour=0;
        con=new Connexion().getConnection();
        if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
        }
        else{
            req="select id_inscrip from inscription,apprenants,cours where matricule=? and lib_cours=? and id_apprenant_inscrip=id_apprenant and id_cours_inscrip=id_cours;";
            try {
                ps=con.prepareStatement(req);
                ps.setString(1, matricule);
                ps.setString(2, nom_cours);
                rs=ps.executeQuery();
                if(rs.next()){
                    retour=rs.getInt(1);
                }
                rs.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur de verification apprenant inscrit " +e.getLocalizedMessage());
            }
        }
        return retour;
    }
    
    
    //======== AFFICHAGE DANS LA JTABLE
    public void liste_des_inscrits_et_reinscrits(JTable table){
       
         con=new Connexion().getConnection();
        if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
        }
        else{
            req="select matricule,nom_apprenant,prenom_apprenant,tel_apprenant,type_inscription,lib_cours,montant_payer,montant_restant,date_inscrip from apprenants,inscription,cours,frais_inscription,facture where id_apprenant=id_apprenant_inscrip and id_cours=id_cours_inscrip and id_frais_inscrip=id_fraisInscrip_inscrip and id_facture=id_facture_inscrip";
            try {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                ps=con.prepareStatement(req);
                int i=1;
                rs=ps.executeQuery();
                while(rs.next()){
                    model.addRow(new Object[]{i,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getString(9)});
                    i++;
                }
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,"Erreur d'affichage jtable Inscription "+ e.getLocalizedMessage());
            }
        }
    }
    
    public int get_id_inscrip_selon_matri_et_cours(String matricule,String nom_cours){
        int retour=0;
        int id_apprenant=new IMP_Apprenants().Get_id_apprenants(matricule);
        int id_cours=new IMP_Cours().Get_id_cours_selon_nom_cours(nom_cours);
        con=new Connexion().getConnection();
        if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
        }
        else{
            req="select id_inscrip from inscription where id_apprenant_inscrip=? and id_cours_inscrip=?";  
            try {
                ps=con.prepareStatement(req);
                 ps.setInt(1, id_apprenant);
                 ps.setInt(2, id_cours);
                 rs=ps.executeQuery();
                 while(rs.next()){
                     retour=rs.getInt(1);
                 }
                 rs.close();
                 con.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur de get id inscrip" +e.getLocalizedMessage());
            }
        }
        return retour;
    }
    
    
     public int get_id_inscrip_selon_telephone(String telephone){
        int retour=0;
        int id_apprenant=new IMP_Apprenants().Get_id_apprenants_selon_tel(telephone);
//        int id_cours=new IMP_Cours().Get_id_cours_selon_nom_cours(nom_cours);
        con=new Connexion().getConnection();
        if(con==null){
          JOptionPane.showMessageDialog(null, "Serveur inactif");
        }
        else{
            req="select id_inscrip from inscription where id_apprenant_inscrip=?";  
            try {
                ps=con.prepareStatement(req);
                 ps.setInt(1, id_apprenant);
//                 ps.setInt(2, id_cours);
                 rs=ps.executeQuery();
                 while(rs.next()){
                     retour=rs.getInt(1);
                 }
                 rs.close();
                 con.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur de get id inscrip" +e.getLocalizedMessage());
            }
        }
        return retour;
    }
    
    
    
    
    
////    ============METHODE DE RECHERCHE DANS INSCRIPTION===============================
    
     public boolean recherche_inscription_par_tel(JTable table, String telephone){
         boolean bol=false;
       //  int id_frais_cours=Get_id_frais_cours(nom_cours);
         con=new Connexion().getConnection();
      if(con==null){
          JOptionPane.showMessageDialog(null, "Service inactif");
      }
      else{
          req="select matricule,nom_apprenant,prenom_apprenant,tel_apprenant,type_inscription,lib_cours,montant_payer,montant_restant,date_inscrip from apprenants,inscription,cours,frais_inscription,facture where id_apprenant=id_apprenant_inscrip and id_cours=id_cours_inscrip and id_frais_inscrip=id_fraisInscrip_inscrip and id_facture=id_facture_inscrip and tel_apprenant like'%"+telephone+"%'";
          try {
              ps=con.prepareStatement(req);
              DefaultTableModel mode=(DefaultTableModel) table.getModel();
              mode.setRowCount(0);
             // ps.setInt(1, id_frais_cours);
              rs=ps.executeQuery();
              int i=1;
              while(rs.next()){
                 mode.addRow(new Object[]{i,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getString(9)});
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
    
}
