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
public class FicheNote
{
    private int numFiche;
    private String dateFiche;
    private String module; //prof , salle, groupe
    
    public FicheNote ()
    { 
     
    }
    public FicheNote (int numFiche, String dateFiche, String module )
    {
        this.numFiche = numFiche;
        this.dateFiche = dateFiche;
        this.module = module;
    }

    public int getNumFiche() {
        return numFiche;
    }

    public void setNumFiche(int numFiche) {
        this.numFiche = numFiche;
    }

    public String getDateFiche() {
        return dateFiche;
    }

    public void setDateFiche(String dateFiche) {
        this.dateFiche = dateFiche;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
    public String afficher()
    {
        return ("Numéro du fiche: " + numFiche + "\nDate du fiche: " + dateFiche + "\nModule: " + module);
    }
}
