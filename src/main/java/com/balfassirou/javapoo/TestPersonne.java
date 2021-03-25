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
public class TestPersonne {
    public static void main(String args[])
    {
        
        Personne p1 = new Personne();
        p1.setPrenom("Fatu");
        p1.setNom("CEESAY");
        p1.setAge(30);
        p1.setTelephone("+220 995 93 65");
        p1.setAdresse("Sifo");
        
        
        Personne p2 = new Personne("Mariama", "CEESAY", 20, "+220 459 88 59", "Yundum","mariamajokong@gmail.com");
        
        Personne p3 = new Personne("Basiru", "CEESAY");
        
    
        System.out.println(p1); 
        System.out.println("********************************");
        System.out.println(p2); 
        System.out.println("********************************");
        System.out.println(p3); 
        System.out.println("********************************");
        System.out.println(Personne.getnombreObjetCree()); 
            
        
    }
}
   
/*p.prenom = "Yankhouba";  NB: il peut etres exécuter que s'il sont en public
        p.nom = "NDIAYE";
        p.age = 29;
        p.telephone = "77 065 11 13";
        p.adresse = "Pikine";
        
            System.out.println(p.prenom);
            System.out.println(p.nom);
            System.out.println(p.age);
            System.out.println(p.telephone);
            System.out.println(p.adresse);*/ 