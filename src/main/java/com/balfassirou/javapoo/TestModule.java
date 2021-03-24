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
public class TestModule {
    public static void main(String args[])
    {
    Module m1 = new Module();
    m1.setNomModule("Comtabilité");
    m1.setVolumHor(30);
    m1.setCoefficient(4);
    
    Module m2 = new Module ("Mathématique",40,5);
    
     System.out.println(m1.afficher());
     System.out.println("------*********--------");
     System.out.println(m2.afficher()); 
    }
    
}
