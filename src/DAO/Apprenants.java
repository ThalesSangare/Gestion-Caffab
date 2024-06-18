
package DAO;

/**
 *
 * @author Thales
 */
public class Apprenants {
    int id_apprend;
    String matricule;
    String nom;
    String prenom;
    String genre;
    String tel;
    String chemin_photo;
    byte [] photo;
    
        
    public int getId_apprend() {
        return id_apprend;
    }

    public void setId_apprend(int id_apprend) {
        this.id_apprend = id_apprend;
    }
      
    public String getChemin_photo() {
        return chemin_photo;
    }

    public void setChemin_photo(String chemin_photo) {
        this.chemin_photo = chemin_photo;
    }
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    
     public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public Apprenants(){
         
}
    
}
