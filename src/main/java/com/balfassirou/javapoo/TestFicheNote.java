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
public class TestFicheNote 
{
   public static void main(String args[])
    {
    FicheNote f1 = new FicheNote();
    f1.setNumFiche(5);
    f1.setDateFiche("22 Mars 2020");
    f1.setModule("JAVA");
    
    FicheNote f2 = new FicheNote (10,"30 Novenbre 2020 ","PHP");
    
     System.out.println(f1.afficher());
     System.out.println("------*********--------");
     System.out.println(f2.afficher()); 
    }
}
