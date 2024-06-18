/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Meeriame
 */
public class Fiche {
    int id_fiche,id_cours_fiche,id_fraisCours;
    String nbreJour,heures_Seance,duree;

    public int getId_fiche() {
        return id_fiche;
    }

    public void setId_fiche(int id_fiche) {
        this.id_fiche = id_fiche;
    }

    public int getId_cours_fiche() {
        return id_cours_fiche;
    }

    public void setId_cours_fiche(int id_cours_fiche) {
        this.id_cours_fiche = id_cours_fiche;
    }

    public int getId_fraisCours() {
        return id_fraisCours;
    }

    public void setId_fraisCours(int id_fraisCours) {
        this.id_fraisCours = id_fraisCours;
    }

    public String getNbreJour() {
        return nbreJour;
    }

    public void setNbreJour(String nbreJour) {
        this.nbreJour = nbreJour;
    }

    public String getHeures_Seance() {
        return heures_Seance;
    }

    public void setHeures_Seance(String heures_Seance) {
        this.heures_Seance = heures_Seance;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }
    
}
