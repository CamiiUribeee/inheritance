
package com.mycompany.moreinheritance.caracter;

public class Peach extends Caracter {   //al heredar de la clase generica se debe crear el constructor porque si no se queja el computador

    public Peach(String name, int height, String power) {
        super(name, height, power);
    }
    
    public void longJump(){
        System.out.println("Flotando");
    }
    
}
