
package DAO;

/**
 *
 * @author Thales
 */
public class Inscription {
    int id_inscrip,id_apprenand_inscrip,id_frais_cours_inscrip,id_fra_inscrip,id_cours;
     String nom_cours,type_inscrip,date_inscrip,matricule,netapayer;

    public int getId_cours() {
        return id_cours;
    }

    public void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }
   

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNetapayer() {
        return netapayer;
    }

    public void setNetapayer(String netapayer) {
        this.netapayer = netapayer;
    }

    public String getDate_inscrip() {
        return date_inscrip;
    }

    public void setDate_inscrip(String date_inscrip) {
        this.date_inscrip = date_inscrip;
    }

    public String getType_inscrip() {
        return type_inscrip;
    }

    public void setType_inscrip(String type_inscrip) {
        this.type_inscrip = type_inscrip;
    }

    public String getNom_cours() {
        return nom_cours;
    }

    public void setNom_cours(String nom_cours) {
        this.nom_cours = nom_cours;
    }

    public int getId_inscrip() {
        return id_inscrip;
    }

    public void setId_inscrip(int id_inscrip) {
        this.id_inscrip = id_inscrip;
    }

    public int getId_apprenand_inscrip() {
        return id_apprenand_inscrip;
    }

    public void setId_apprenand_inscrip(int id_apprenand_inscrip) {
        this.id_apprenand_inscrip = id_apprenand_inscrip;
    }

    public int getId_frais_cours_inscrip() {
        return id_frais_cours_inscrip;
    }

    public void setId_frais_cours_inscrip(int id_frais_cours_inscrip) {
        this.id_frais_cours_inscrip = id_frais_cours_inscrip;
    }

    public int getId_fra_inscrip() {
        return id_fra_inscrip;
    }

    public void setId_fra_inscrip(int id_fra_inscrip) {
        this.id_fra_inscrip = id_fra_inscrip;
    }
    
}
