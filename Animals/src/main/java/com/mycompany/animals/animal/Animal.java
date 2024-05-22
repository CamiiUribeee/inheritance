
package com.mycompany.animals.animal;


public class Animal {
    private String gender;
    private String specie; 
    private int size; 
    private String name; 

    public Animal(String gender, String specie, int size, String name) {
        this.gender = gender;
        this.specie = specie;
        this.size = size;
        this.name = name;
    }
    
    

    public void talk(){
        System.out.println("Say something");
    }
    
    
    
    
    
}
