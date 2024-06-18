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
public class frais_inscription {
    int id_frais_inscrip;
    String type_inscription,montant_inscrip;

    public int getId_frais_inscrip() {
        return id_frais_inscrip;
    }

    public void setId_frais_inscrip(int id_frais_inscrip) {
        this.id_frais_inscrip = id_frais_inscrip;
    }

    public String getType_inscription() {
        return type_inscription;
    }

    public void setType_inscription(String type_inscription) {
        this.type_inscription = type_inscription;
    }

    public String getMontant_inscrip() {
        return montant_inscrip;
    }

    public void setMontant_inscrip(String montant_inscrip) {
        this.montant_inscrip = montant_inscrip;
    }
    
}
