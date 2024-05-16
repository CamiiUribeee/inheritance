
package com.mycompany.inheritance;

import com.mycompany.inheritance.people.Admin;
import com.mycompany.inheritance.people.Person;
import com.mycompany.inheritance.people.Student;


public class Inheritance {

    public static void main(String[] args) {
        
        //Person person = new Person("Miguel", "Perez", "56", 25); 
        
        Student student = new Student (4.8, "lola", "mento", "AS34", 20); 
        
        Admin admin = new Admin ("Jefe de lab", "Jhony", "de tal", "a23", 40); 
        
        System.out.println("Tu nombre es: " + student.getName());
        System.out.println("Tu promedio es: " + student.getAverage());
        
        System.out.println("Hola, " + admin.getName());
        admin.doWork();
        
        
    }
}
