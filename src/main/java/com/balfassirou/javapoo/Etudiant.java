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
public class Etudiant
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
    private String dateInscp;
    private String filiere;
    private String groupe;
    
    public Etudiant ( )
    {
       
        
    }
    public Etudiant ( String prenom,String nom,String dateNaiss,String lieuNaiss,String matricule,String telephone,
     String adresse,String email,String nationalite,String dateInscp,String filiere,String groupe )
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
        this.dateInscp = dateInscp;
        this.filiere = filiere;
        this.groupe = groupe;
        
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

    public String getDateInscp() {
        return dateInscp;
    }

    public void setDateInscp(String dateInscp) {
        this.dateInscp = dateInscp;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return "Etudiant" + "prenom: " + prenom + ", \nnom: " + nom + ", \ndateNaiss: " + dateNaiss + ", \nlieuNaiss: " + lieuNaiss + ", \nmatricule: " + matricule + ", \ntelephone: " + telephone + ", \nadresse: " + adresse + ", \nemail: " + email + ", \nnationalite: " + nationalite + ", \ndateInscp: " + dateInscp + ", \nfiliere: " + filiere + ", \ngroupe: " + groupe ;
    }
   
}
