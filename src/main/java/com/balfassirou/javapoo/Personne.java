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
public class Personne
{
    private String prenom;
    private String nom;
    private String adresse;
    private int age;
    private String telephone;
    private String email;
    private static int nombreObjetCree = 0;
    private final String PAYS = "Sénégal";
    private final double TAUXTVA = 18.5;
    
    
    public Personne () 
    { /*constructeur sans parametre*/
         Personne.nombreObjetCree++;
    }
    public Personne (String prenom, String nom)
    { /*constructeur avec parametre*/
        this.prenom = prenom;
        this.nom = nom; 
        Personne.nombreObjetCree++;
    }
    public Personne (String prenom, String nom, int age, String tel, String adresse, String email)
    { /*constructeur avec parametre*/
        this(prenom, nom); // appel du constructeur precedent avec les deux paramtres
       // this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.telephone = tel;
        this.adresse = adresse;
        this.email = email;
        Personne.nombreObjetCree++;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   /* public String afficher()
    {
        return ("prénom:" + prenom + "\n Nom:" + nom + "\n Age:" + age + "\n Téléphone:" + telephone + "\n Adresse:" + adresse);
    }*/
    
    public static int getnombreObjetCree()
    {
        return Personne.nombreObjetCree;
    }
    public String getPays()
    {
        return this.PAYS;
    }
    public double getTauxTva()
    {
        return this.TAUXTVA;
    }
    @Override
    public String toString() {
        return "prenom: " + prenom + ", \nNom: " + nom + ", \nAdresse: " + adresse + ", \nAge: " + age + ", \nTelephone: " + telephone + ", \nEmail: " + email;
    }
}
