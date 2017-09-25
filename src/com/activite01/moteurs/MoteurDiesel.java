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
public class MoteurDiesel extends Moteur {
    
        
    public MoteurDiesel(String cylindre, Double prix) {
        
        super();
        this.cylindre = cylindre;
        this.prix = prix;
        this.type = TypeMoteur.values()[0];
        
    }
    
}
