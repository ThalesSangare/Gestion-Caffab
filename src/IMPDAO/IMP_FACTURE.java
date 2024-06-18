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
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Meeriame
 */
public class IMP_FACTURE {
    String req = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con = null;
    
    public int Enregistrer_facture(int montant_total,int montant_payer,int montant_restant){
        int retour=0;
        con = new Connexion().getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Serveur inaccessible");
        } else {
            req="insert into facture(Montant_total,Montant_Payer,Montant_restant) values (?,?,?)";
            try {
                ps=con.prepareStatement(req,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, montant_total);
                ps.setInt(2,montant_payer);
                ps.setInt(3,montant_restant);
                ps.executeUpdate();
                rs=ps.getGeneratedKeys();
                if(rs.next()){
                    retour=rs.getInt(1);
                }
                rs.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erreur d'insertion facture" +e.getLocalizedMessage());
            }
        }
        return retour;
    }
}
