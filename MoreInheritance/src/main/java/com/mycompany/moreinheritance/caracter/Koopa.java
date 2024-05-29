
package com.mycompany.moreinheritance.caracter;

public class Koopa extends Caracter {
    private String shellType;

    public Koopa(String name, int height, String power, String shellType) {  //agregas el string shellType
        super(name, height, power);
        this.shellType = shellType; 
    }
    
    @Override 
    public void attack (){
        super.attack();
        System.out.println("Lanzar martillos"); //esto se llama refinamiento de metodos 
    }
    
    
}
