/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activite01.garage;

import com.activite01.voitures.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author utilisateur
 */
public class Garage {
    
    ArrayList<Vehicule> voitures = new ArrayList<Vehicule>();
    
    public void addVoiture(Vehicule voiture) {
        
        voitures.add(voiture);
        
        File file = new File("garage.txt");
        FileWriter fw;
        
        
        try {
            
            fw = new FileWriter(file);
            String str = "\n";
            
            for (Vehicule item : voitures) {
                
                str += item.toString() + "\n";
                
            }
            
            fw.write(str);
            
            fw.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
    }
    
    public String toString() {
        
        
        File file = new File("garage.txt");
        FileReader fr;
        String str = "";
           
        try {
            
            fr = new FileReader(file);
            if(fr.read() == -1)
                System.out.println("\u001B[31mAucune voiture sauvegardée !\n");
            str += "****************************\n";
            str += "*  Garage OpenClassrooms   *\n";
            str += "****************************\n";
            int i = 0;
            
            while(( i = fr.read()) != -1 )
                str += (char)i;
            
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return str;
        
    }
    
        
    
}
