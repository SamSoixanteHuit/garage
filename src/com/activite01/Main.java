package com.activite01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.activite01.voitures.*;
import com.activite01.garage.Garage;

import java.util.*;

/**
 *
 * @author utilisateur
 * 
*/



public class Main {
    
    public static void main(String[] args) {
        
          
        Vehicule lag1 = new Lagouna();
        Vehicule A300B_2 = new A300B();
        Vehicule d4_1 = new D4();
        Garage g1 = new Garage();
        
        g1.addVoiture(lag1);
        g1.addVoiture(A300B_2);
        g1.addVoiture(d4_1);
        
        System.out.println(g1.toString());
        System.out.println(lag1.nomMarque);
        
        
        
                      
        
    }
    
}
