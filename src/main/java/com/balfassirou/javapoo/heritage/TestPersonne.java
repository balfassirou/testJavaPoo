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
public class TestPersonne
{
    public static void main(String[] args){
        Personne p = new Personne();
        p.setId(1);
        p.setPrenom("Mouhamed");
        p.setNom("Diop");
        p.setDateNaissance("22/09/1988");
        p.setLieuNaissance("Bakel");
        p.setAdresse("Sedhiou");
        p.setTelephone("77 541 42 51");
        p.setEmail("momreck@gmail.it");
        p.setNationalite("iatalienne");
        p.setGenre("masculin");
        p.setSituationMatrimoniale("compliqué");
                
        
    
       Etudiant etudiant = new Etudiant(2,"LS1200","David","Fall","14-08-1980","Rufisque","Derklé","774940449","kiddmorr@yahoo.fr","Senegalaise","masculin","Celibataire","B+");
       
       Professeur Prof = new Professeur(1,"KJ254l","Badara","Dianté","12-01-1975","Kaolack","Dalifort","705461247","badarazogmail.com","Senegalaise","masculin","Marié","Mathematique");
       
       Secretaire secre = new Secretaire(1,"CML8874","Momodou Lamine","CISSE","10-01-2002","Serakunda","New yundum","+220 995 45 12","momodoulamine@gmail.com","gambienne","masculin","celibataire","Eablir les bulletins");
       
       ResponsableFiliere respofil = new ResponsableFiliere(1,"YD065","Aissatou","DRAME","11-11-1985","Karefour diaroume","Medina wandifa","78 452 15 53","aissadrame@gmail.com","Senegalaise","feminin","veuve","Concevoir les programme");
       
       System.out.println(p);
       System.out.println("**********-----**********");
       System.out.println(etudiant);
       System.out.println("**********-----**********");
       System.out.println(Prof);
       System.out.println(secre);
       System.out.println("**********-----**********");
       System.out.println(respofil);
       
       
       
    }
    
}
