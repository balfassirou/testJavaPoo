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
public class TestEvaluation
{
 public static void main(String args[])
    {
    Evaluation ev1 = new Evaluation();
    ev1.setType("Devoir");
    ev1.setDate("15 Octobre 2020");
    ev1.setDuree(2);
    
    Evaluation ev2 = new Evaluation ("Examen","5 Décembre 2020 ",3);
    
     System.out.println(ev1);
     System.out.println("------*********--------");
     System.out.println(ev2); 
    }   
}
