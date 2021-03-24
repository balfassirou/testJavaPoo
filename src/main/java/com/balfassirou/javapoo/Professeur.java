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
public class Professeur
{

    private String prenom;
    private String nom;
    private String dateNaiss;
    private String lieuNaiss;
    private String matricule;
    private String telephone;
    private String adresse;
    private String email;
    private String nationalite;
    private String dateCommencement;
    private String typeDeContrat;
    private String moduleEnseigne;
    
    
    public Professeur ( String prenom,String nom,String dateNaiss,String lieuNaiss,String matricule,String telephone,
     String adresse,String email,String nationalite,String dateCommencement,String typeDeContrat,String moduleEnseigne )
    {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.lieuNaiss = lieuNaiss;
        this.matricule = matricule;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.nationalite = nationalite;
        this.dateCommencement = dateCommencement;
        this.typeDeContrat = typeDeContrat;
        this.moduleEnseigne = moduleEnseigne;
        
    }
    
   public Professeur ( String prenom,String nom,String dateNaiss,String lieuNaiss,String matricule,String telephone,
   String nationalite,String dateCommencement,String typeDeContrat,String moduleEnseigne )
    {
    
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.lieuNaiss = lieuNaiss;
        this.matricule = matricule;
        this.telephone = telephone;
        this.nationalite = nationalite;
        this.dateCommencement = dateCommencement;
        this.typeDeContrat = typeDeContrat;
        this.moduleEnseigne = moduleEnseigne;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getLieuNaiss() {
        return lieuNaiss;
    }

    public void setLieuNaiss(String lieuNaiss) {
        this.lieuNaiss = lieuNaiss;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getDateCommencement() {
        return dateCommencement;
    }

    public void setDateCommencement(String dateCommencement) {
        this.dateCommencement = dateCommencement;
    }

    public String getTypeDeContrat() {
        return typeDeContrat;
    }

    public void setTypeDeContrat(String typeDeContrat) {
        this.typeDeContrat = typeDeContrat;
    }

    public String getModuleEnseigne() {
        return moduleEnseigne;
    }

    public void setModuleEnseigne(String moduleEnseigne) {
        this.moduleEnseigne = moduleEnseigne;
    }

    @Override
    public String toString() {
        return "Professeur" + "prenom=" + prenom + ", nom=" + nom + ", dateNaiss=" + dateNaiss + ", lieuNaiss=" + lieuNaiss + ", matricule=" + matricule + ", telephone=" + telephone + ", adresse=" + adresse + ", email=" + email + ", nationalite=" + nationalite + ", dateCommencement=" + dateCommencement + ", typeDeContrat=" + typeDeContrat + ", moduleEnseigne=" + moduleEnseigne;
    }
   
}
