
package com.mycompany.moreinheritance.caracter;


public class Mario extends Caracter{

    public Mario(String name, int height, String power) {
        super(name, height, power);
    }
    
    public void eatMushroom (){
        System.out.println("Comiendo hongos");
    }
    
    public void jump(){
        System.out.println("Saltando");
    }
    
    public void takeCoins(){
        System.out.println("Recogiendo monedas");
    }
    
}
