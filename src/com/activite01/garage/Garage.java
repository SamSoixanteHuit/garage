/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activite01.garage;

import com.activite01.voitures.*;
import java.util.ArrayList;

/**
 *
 * @author utilisateur
 */
public class Garage {
    
    ArrayList<Vehicule> voitures = new ArrayList<Vehicule>();
    
    public void addVoiture(Vehicule voiture) {
        
        voitures.add(voiture);
        
    }
    
    public String toString() {
        
        String str = "";
        
        for ( Vehicule item : voitures ) {
            
            str += item.toString() + "\n";
            
        }
        
        return str;
        
    }
    
        
    
}
