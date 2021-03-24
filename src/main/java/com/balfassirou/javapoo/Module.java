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
public class Module 
{
    private String nomModule;
    private int volumHor;
    private int coefficient;
    
    public Module ()
    { 
     
    }
    public Module (String nomModule, int volumHor, int coefficient)
    { /*constructeur avec parametre*/
        this.nomModule = nomModule;
        this.volumHor = volumHor;
        this.coefficient = coefficient;
    }

    public String getNomModule() {
        return nomModule;
    }

    public void setNomModule(String nomModule) {
        this.nomModule = nomModule;
    }

    public int getVolumHor() {
        return volumHor;
    }

    public void setVolumHor(int volumHor) {
        this.volumHor = volumHor;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
     public String afficher()
    {
        return ("Nom du module: " + nomModule + "\nVolume horaire: " + volumHor + "\nCoéfficient: " + coefficient);
    }
}
