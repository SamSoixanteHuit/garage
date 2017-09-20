/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activite01.voitures;

/**
 *
 * @author utilisateur
 */
public enum Marque {
    
    Reno("RENO"),
    Pigeot("PIGEOT"),
    Troen("TROEN");
    
    private String nomMarque = "";
    
    // Constructeur
    Marque(String nomMarque) {
        this.nomMarque = nomMarque;
    }
    
    
    
    /*Reno,
    Pigeot,
    Troen;
    
    private Marque nomMarque;
    
    // Constructeur
    Marque(Marque nomMarque) {
        this.nomMarque = nomMarque;
    }*/
}
