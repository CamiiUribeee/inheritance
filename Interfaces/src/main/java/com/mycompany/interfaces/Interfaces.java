
package com.mycompany.interfaces;

import com.mycompany.interfaces.vehicles.classic.Renault4;
import com.mycompany.interfaces.vehicles.sport.BMW;


public class Interfaces {

    public static void main(String[] args) {
        BMW bmw = new BMW ("BMW" , "Blanco y azul" , 2); 
        
        bmw.addTurbo();
        bmw.openCeiling();
        bmw.run();
        
        Renault4 renault4 = new Renault4 ("Renault" , "Azul" , 4);
        renault4.openCeiling();
        bmw.run();
    }
}
