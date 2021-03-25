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
public class TestEtudiant 
{
    public static void main(String args[])
    {
    Etudiant e1 = new Etudiant();
    e1.setPrenom("Mouhamadoul Bachir");
    e1.setNom("CISSE");
    e1.setDateNaiss("11 Aout 1994");
    e1.setLieuNaiss("Dakar");
    e1.setMatricule("CMB438");
    e1.setTelephone("77 847 78 52");
    e1.setAdresse("Pikine Tally boumack");
    e1.setEmail("balfassirou@gmail.com");
    e1.setNationalite("Gambien");
    e1.setDateInscp("03 Octobre 2019");
    e1.setFiliere("Informatique de gestion");
    e1.setGroupe("IG212");

    
    Etudiant e2 = new Etudiant ("Cheikh Ousmane","DIOP","18 Mai 1994","Pikine","DCO459","77 847 65 68",
            "Zac Mbao","codnoreyni00@gmail.com","Sénégalaise","5 Octobre 2018","Comptabilté de gestion","CG203");
    
     System.out.println(e1);
     System.out.println("------*********--------");
     System.out.println(e2); 
    }
    
}
