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
public class TestProfesseur 
{
public static void main(String args[])
    {
    
    Professeur p1 = new Professeur ("Cheikh Ousmane","DIOP","18 Mai 1994","Pikine","DCO459","77 847 65 68",
            "Zac Mbao","codnoreyni00@gmail.com","Sénégalaise","5 Octobre 2018","Comptabilté de gestion","CG98");
    Professeur p2 = new Professeur ("Mouhamdoul Bachir","NDIAYE","11 Aout 1994","Dakar","MBN438","77 660 02 29",
            "Sénégalaise","2 Octobre 2018","informatique de gestion","IG45");
     System.out.println(p1);
     System.out.println("------****TTT*****--------");
     System.out.println(p2); 
    }     
}
