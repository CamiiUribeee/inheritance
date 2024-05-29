
package com.mycompany.moreinheritance;

import com.mycompany.moreinheritance.caracter.Goomba;
import com.mycompany.moreinheritance.caracter.Koopa;
import com.mycompany.moreinheritance.caracter.Peach;

public class MoreInheritance {

    public static void main(String[] args) {
        
        
        Peach peach = new Peach("Princesa", 140, "Congelar"); 
        peach.longJump(); 
        
        Goomba goomba = new Goomba("Goomba", 50, "ninguno"); 
        goomba.walk();
        
        Koopa koopa = new Koopa("Koopa", 120, "Escudo", "Espinas");
        koopa.attack();
        koopa.walk();
    }
}
