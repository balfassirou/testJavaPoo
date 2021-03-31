/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.javapoo.heritage;

/**
 *
 * @author BALFASSIROU
 */
public class  Secretaire extends Personne 
{
    private String fonction;
    
    public Secretaire ()
    {
        super();
    }
    public Secretaire(int id, String matricule, String prenom, String nom, String dateNaissance, 
                     String lieuNaissance, String adresse, String telephone, String email, 
                     String nationalite, String genre, String situationMatrimoniale,String fonction)
    {
       super(id, matricule, prenom, nom,
            dateNaissance, lieuNaissance, adresse, telephone,
            email, nationalite, genre, situationMatrimoniale);
      this.fonction = fonction;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFonction: " + fonction ;
    }
    
}
