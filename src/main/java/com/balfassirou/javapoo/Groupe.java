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
public class Groupe
{
    private String nomGroupe;
    private String dateCreation;
    private int nombreEtudiant;
    //private int nombreEtudiant[ ] = new int[30];
    
    public Groupe ()
    { 
     
    }
    public Groupe (String nomGroupe, String dateCreation, int nombreEtudiant)
    { /*constructeur avec parametre*/
        this.nomGroupe = nomGroupe;
        this.dateCreation = dateCreation;
        this.nombreEtudiant = nombreEtudiant;
    }  

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getNombreEtudiant() {
        return nombreEtudiant;
    }

    public void setNombreEtudiant(int nombreEtudiant) {
        this.nombreEtudiant = nombreEtudiant;
    }

    @Override
    public String toString() {
        return "Groupe" + "_nnomGroupe: " + nomGroupe + ", \ndateCreation: " + dateCreation + ", \nnombreEtudiant: " + nombreEtudiant;
    }
    
    
}
