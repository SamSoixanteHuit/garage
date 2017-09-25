package com.activite01.voitures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import com.activite01.moteurs.*;
import com.activite01.options.*;

/**
 *
 * @author utilisateur
 */
public class Vehicule {
    
    Double prix;
    String nom;
    public List<Option> options = new ArrayList();
    public Moteur moteur;
    public Marque nomMarque;
    
    public Vehicule() {
        
    }
    
    public Vehicule(String nom, Double prix, Marque nomMarque) {
        
        System.out.println("Création d'une voiture.");
        this.nom = nom;
        this.prix = prix;
        this.nomMarque = nomMarque;
                
    }
    
    public Double getPrix() {
        return this.prix;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public String toString() {
        
        String str = "";
        
        Double prixOptions = 0.0;
        for ( Option item : options ) {
            
            prixOptions += item.getPrix();
            
        }
        
        if ( this.moteur != null )       
            str = "+ Voiture " + this.nomMarque + " : " + this.getNom() + " " + this.moteur.toString() + " " + this.getOptions() + " d'une valeur totale de " + (this.moteur.getPrix() + prixOptions) + "€"; 
        else 
            str = "+ Voiture " + this.nomMarque + " : " + this.getNom() + " [pas de moteur] " + this.getOptions() + " d'une valeur totale de " + (prixOptions) + "€";
        return str;
        
    }
    
    public void setMoteur(Moteur moteur) {
        
        this.moteur = moteur;
        
    }
    
    public void addOption(Option opt) {
        
        this.options.add(opt);
        
    }
    
    public String getOptions() {
        
        String str = "[";
        
        if ( this.options.size() > 0 ) {
            int length = options.size();

            for ( int i = 0; i < length; i++) {

                str += options.get(i).getNom() + " (" + options.get(i).getPrix() + "€)";
                if ( length - i > 1 )
                    str += ", ";           
            }
        }
        else
            str += "pas d'option";
        
        str += "]";
        return str;
    }
    
}
