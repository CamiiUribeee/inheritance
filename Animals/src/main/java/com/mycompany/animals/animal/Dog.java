
package com.mycompany.animals.animal;


public class Dog extends Animal {
    String fur; 

    public Dog(String fur, String gender, String specie, int size, String name) {
        super(gender, specie, size, name);
        this.fur = fur;
    }
    
    
    
    public void sniff(){
        System.out.println("Soy un perro olfateando");
    }
    
    @Override
    public void talk(){
        System.out.println("guau guau!!!");
        
    }
    
}
