
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Thales
 */
public class Implements {
    String req="";
    PreparedStatement ps=null;
    ResultSet rs= null;
    Connection con=null;
    
    //================ APPRENANTS ======================================================
    //===INSERTION 

    //================ FIN APPRENANTS ======================================================
    
     //================ COURS =============================================================
    //=== AJOUT DES COURS
    public int AjouterCours(Cours cours){
        int retour=0;
        con= new Connexion().getConnection();
         if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
         else{
             req="insert into cours (lib_cours) values (?)";
             try {
                 ps=con.prepareStatement(req);
                 ps.setString(1, cours.getLibelCours());
                 ps.executeUpdate();
                 con.close();
             } catch (SQLException ex) {
                 retour=ex.getErrorCode();
             }
         }
        return retour;
    }
    
    //=== modification DES COURS
    public boolean ModifierCOURS(int ID,String libCours){
    boolean bol=false;
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
    
    //=== RECERCHER UN COURS 
    public String RechercheCours(String libelle){
        String retour="";
        con =new Connexion().getConnection();
        if(con==null){
            JOptionPane.showMessageDialog(null,"Serveur inactif");
        }
        else{
            req="select lib_cours from cours where lib_cours=?";
            try {
                ps=con.prepareStatement(req);
                ps.setString(1, libelle);
                rs=ps.executeQuery();
                while(rs.next()){
                    retour ="Le cour est : "+rs.getString(1);
                }
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur de recherche du cours "+ e.getLocalizedMessage());
            }
        }
        return retour;
    }
    
    
    
    //================ FIN COURS =============================================================
    
        //=== AJOUT frais inscription
    
    
    }
    
    
    
    
