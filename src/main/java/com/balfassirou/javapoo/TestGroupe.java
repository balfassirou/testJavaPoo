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
public class TestGroupe
{
   public static void main(String args[])
    {
    Groupe g1 = new Groupe();
    g1.setNomGroupe("PR115");
    g1.setDateCreation("10 Octobre 2018");
    g1.setNombreEtudiant(20);
    
    Groupe g2 = new Groupe ("RT230","8 Janvier 2018",16);
    
     System.out.println(g1);
     System.out.println("------*********--------");
     System.out.println(g2); 
    }    
}
