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
public class TestFiliere 
{
    public static void main(String args[])
    {
    Filiere fi1 = new Filiere();
    fi1.setNomFil("Programmation");
    fi1.setDescription("c'est une filiere qui forme des etudiant dans le but de concevoir des logiciels...");
    
    
    Filiere fi2 = new Filiere ("Réseaux Télécome","c/'est une filiere qui forme des etudiant dans le but de regler les reseaux informatiques...");
    
     System.out.println(fi1);
     System.out.println("------*********--------");
     System.out.println(fi2); 
    }
}
