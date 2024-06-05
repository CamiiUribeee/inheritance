
package com.mycompany.interfaces.vehicles.classic;

import com.mycompany.interfaces.vehicles.Convertible;
import com.mycompany.interfaces.vehicles.Vehicle;


public class Renault4 extends Vehicle implements Convertible {   //herada las propiedades de la clase padre (Vehicle) 
    
    

    public Renault4(String brand, String color, int doorsQtty) {
        super(brand, color, doorsQtty);
    }

    @Override
    public void openCeiling() {
        System.out.println("Soy cool!!!!");
    }
    
}
