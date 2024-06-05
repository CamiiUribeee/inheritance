
package com.mycompany.interfaces.vehicles.sport;

import com.mycompany.interfaces.vehicles.Convertible;
import com.mycompany.interfaces.vehicles.Turbo;
import com.mycompany.interfaces.vehicles.Vehicle;

public class BMW extends Vehicle implements Turbo, Convertible {   //para que bmw firme el contrato
    
    

    public BMW(String brand, String color, int doorsQtty) {
        super(brand, color, doorsQtty);
    }

    @Override
    public void addTurbo() {
        System.out.println("Nitro añadido");
    }

    @Override
    public void openCeiling() {
        System.out.println("Abriendo el techo");
    }

    @Override
    public void superTurbo() {
        System.out.println("A volar!!!!");
    }
    
}
