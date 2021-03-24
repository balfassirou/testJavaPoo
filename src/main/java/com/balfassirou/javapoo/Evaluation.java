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
public class Evaluation
{
    private String type;
    private String date;
    private int duree;
    
    public Evaluation ()
    { 
     
    }
    public Evaluation (String type, String date, int duree )
    {
        this.type = type;
        this.date = date;
        this.duree = duree;
    }    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Evaluation: " + "\nType: " + type + ", \nDate: " + date + ", \nDuree: " + duree;
    }
    
}
