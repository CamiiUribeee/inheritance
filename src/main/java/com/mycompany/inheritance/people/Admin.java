
package com.mycompany.inheritance.people;


public class Admin extends Person  {
    private String role; 

    public Admin(String role, String name, String lastName, String id, int age) {
        super(name, lastName, id, age);
        this.role = role;
    }
    
    
    
    public void doWork(){
        System.out.println("Hola estoy trabajando");
    }
    
}
