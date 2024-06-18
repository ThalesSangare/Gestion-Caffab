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
public class Frais_cours {
    private String nom_cours;
    private int montant;
    private int id_frais_cours;

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }


    public String getNom_cours() {
        return nom_cours;
    }

    public void setNom_cours(String nom_cours) {
        this.nom_cours = nom_cours;
    }

    public int getId_frais_cours() {
        return id_frais_cours;
    }

    public void setId_frais_cours(int id_frais_cours) {
        this.id_frais_cours = id_frais_cours;
    }
    
    
}
