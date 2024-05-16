
package com.mycompany.inheritance.people;


public class Student extends Person {
    private double average; 

    public Student(double average, String name, String lastName, String id, int age) {
        super(name, lastName, id, age);
        this.average = average;
    }

    
    
    public void study (){
        System.out.println("voy a estudiar");
    }
    
    public void homework(){
        System.out.println("voy a hacer tareas");
    }
    
    public void goToClass (){
        System.out.println("voy a clase");
    }

    public double getAverage() {
        return average;
    }
    
    
    
}
