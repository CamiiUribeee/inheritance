
package com.mycompany.animals;

import com.mycompany.animals.animal.Animal;
import com.mycompany.animals.animal.Cat;
import com.mycompany.animals.animal.Dog;

public class Animals {

    public static void main(String[] args) {
        Animal animal = new Animal("macho", "Desconocida", 50, "Generico"); 
        
        Cat cat = new Cat("Amarillo", "hembra", "mamifero", 21, "Gato"); 
        
        Dog dog = new Dog ("corto", "macho", "mamifero", 80, "Perro" ); 
        
        animal.talk();
        cat.talk();
        dog.talk();
    }
}
