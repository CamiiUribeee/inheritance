
package com.mycompany.moreinheritance.caracter;

public class Goomba extends Caracter {
    private String color;
    private boolean Wings; 
    
    //aqui podriamos crear el metodo de atacar pero no lo vamos a hacer porque lo va a heredar de la clase generica 

    public Goomba(String name, int height, String power) {
        super(name, height, power);
    }
    
    @Override
    public void walk(){
        System.out.println("Caminando despacio, no tengo piernitas");
        
    }

    
    //si no quiero poner los atributos del goomba en el public void hago setters, como quiera trabajar: 
    public void setColor(String color) {
        this.color = color;
    }

    public void setWings(boolean Wings) {
        this.Wings = Wings;
    }
    
}
