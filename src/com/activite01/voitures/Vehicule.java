package com.activite01.voitures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

/**
 *
 * @author utilisateur
 */
public class Vehicule {
    
    Double prix;
    String nom;
    // List<Option> options;
    public Marque nomMarque;
    
    public Vehicule() {
        
    }
    
    public Vehicule(String Nom, Double Prix, Marque nomMarque) {
        
        System.out.println("Création d'une voiture.");
        nom = Nom;
        prix = Prix;
        this.nomMarque = nomMarque;
                
    }
    
    public Double getPrix() {
        return this.prix;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public String toString() {
        
        String str = "Je suis une voiture de modele " + this.getNom() + ", nom numéro est " + this.getPrix();
        
        return str;
        
    }
    
}
