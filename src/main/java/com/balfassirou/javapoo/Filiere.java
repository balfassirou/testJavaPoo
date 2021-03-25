/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.javapoo;

/**
 *
 * @author BALFASSIROU
 */
public class Filiere 
{
    private String nomFiliere;
    private String description;
    
    public Filiere ()
    { 
     
    }
    public Filiere (String nomFiliere, String description)
    { /*constructeur avec parametre*/
        this.nomFiliere= nomFiliere;
        this.description = description;
    }

    public String getNomFil() {
        return nomFiliere;
    }

    public void setNomFil(String nomFil) {
        this.nomFiliere = nomFil;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Nom du Filiere: " + nomFiliere +  "\nDescription: " + description;
    }
    
}
