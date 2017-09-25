/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activite01.moteurs;

/**
 *
 * @author utilisateur
 */
public abstract class Moteur {
    
    public TypeMoteur type;
    String cylindre;
    Double prix;
    
    void Moteur() {}
    
    public String toString() {
        
        String str = "Moteur " + this.type + " " + this.cylindre + " (" + this.getPrix() + "€)";
        return str;
        
    }
    
    public Double getPrix() {
        
        return this.prix;
        
    }
    
}
