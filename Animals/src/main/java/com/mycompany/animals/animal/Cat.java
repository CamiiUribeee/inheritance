
package com.mycompany.animals.animal;


public class Cat extends Animal {
    String color;

    public Cat(String color, String gender, String specie, int size, String name) {
        super(gender, specie, size, name);
        this.color = color;
    }
    
    
    
    public void play(){
        System.out.println("Soy un gato jugando");
    }
    
    @Override
    public void talk(){
        System.out.println("Emite maullido");
    }
    
    
}
