
package com.mycompany.moreinheritance.caracter;   //ESTA ES MI CLASE GENERICA DE LA CUAL VOY A GENERAR LA INFORMACION 

public class Caracter {
    private String name; 
    private int height;
    private String power;

    public Caracter(String name, int height, String power) {
        this.name = name;
        this.height = height;
        this.power = power;
    }
    
    
    
    public void walk(){
        System.out.println("Personaje caminando");
    }
    
    public void attack (){
        System.out.println("Personaje atacando");
    }
    
    final public void die(){    //si yo por algun motivo no quiero sobreescribir un metodo, (ejemplo, este de die) le pongo final al metodo y si quiero sobrecargar en la clase no me va a dejar, me bota error 
        System.out.println("Personaje muriò");
    }
    
    
    
    
    
    
    
    
    
    
    
}
