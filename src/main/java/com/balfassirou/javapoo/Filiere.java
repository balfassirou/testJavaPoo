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
    private String nomFil;
    private String moduleFil;
    private String description;
    
    public Filiere ()
    { 
     
    }
    public Filiere (String nomFil, String moduleFil, String description)
    { /*constructeur avec parametre*/
        this.nomFil= nomFil;
        this.moduleFil = moduleFil;
        this.description = description;
    }

    public String getNomFil() {
        return nomFil;
    }

    public void setNomFil(String nomFil) {
        this.nomFil = nomFil;
    }

    public String getModuleFil() {
        return moduleFil;
    }

    public void setModuleFil(String moduleFil) {
        this.moduleFil = moduleFil;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Nom du Filiere: " + nomFil + "\nModule des Filires: " + moduleFil + "\nDescription: " + description;
    }
    
}
