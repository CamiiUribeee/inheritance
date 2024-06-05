
package com.mycompany.interfaces.vehicles;

public class Vehicle {
    private String brand;
    private String color; 
    private int doorsQtty;

    public Vehicle(String brand, String color, int doorsQtty) {   //al yo crear el constructor debo poner constructores en las demàs clases (bmw, renault y porshe) 
        this.brand = brand;
        this.color = color;
        this.doorsQtty = doorsQtty;
    }
    
    
    
    public void run (){
        System.out.println("Carro andando");
    }
                                                                    
    
}
    