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
public class Seance
{
    private String dateSeance;
    private String seanceModule;
    private String seanceGroupe;
    private String profSeance;
    private String heureDebut;
    private String heureFin;
    private int volumHoraire;
    private int soldeHeure;
    
    public Seance (String dateSeance, String seanceModule,String seanceGroupe,String profSeance, String heureDebut, String heureFin,int volumHoraire, int soldeHeure )
    {
    this.dateSeance = dateSeance;
    this.seanceModule = seanceModule;
    this.seanceGroupe = seanceGroupe;
    this.profSeance = profSeance;
    this.heureDebut = heureDebut;
    this.heureFin = heureFin;
    this.volumHoraire = volumHoraire;
    this.soldeHeure = soldeHeure;  
    }

    public String getDateSeance() {
        return dateSeance;
    }

    public void setDateSeance(String dateSeance) {
        this.dateSeance = dateSeance;
    }

    public String getSeanceModule() {
        return seanceModule;
    }

    public void setSeanceModule(String seanceModule) {
        this.seanceModule = seanceModule;
    }
      public String getSeanceGroupe() {
        return seanceModule;
    }

    public void setSeanceGroupe(String seanceModule) {
        this.seanceModule = seanceModule;
    }
      public String getProfSeance() {
        return seanceModule;
    }

    public void setProfSeance(String seanceModule) {
        this.seanceModule = seanceModule;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public int getVolumHoraire() {
        return volumHoraire;
    }

    public void setVolumHoraire(int volumHoraire) {
        this.volumHoraire = volumHoraire;
    }

    public int getSoldeHeure() {
        return soldeHeure;
    }

    public void setSoldeHeure(int soldeHeure) {
        this.soldeHeure = soldeHeure;
    }



    @Override
    public String toString() {
        return "Date de seance: " + dateSeance + "\nModule du seance: " + seanceModule + "\nGroupe du seance: " + seanceGroupe + "\nProf du seance: " + profSeance + "\nHeure de Debut: " + heureDebut + "\nHeure de Fin: " + heureFin + " \nVolume Horaire: " +volumHoraire+ " \nSolde Heure: " + soldeHeure;
    }
    
 
        
    
}
