/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.beans;

import java.io.Serializable;

/**
 *
 * @author hamdi
 */
public class personne implements Serializable{
    private int cin ;
    private String nom; 
    private String prenom ; 
    private String email; 

    public personne(int cin, String nom, String prenom, String email) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
