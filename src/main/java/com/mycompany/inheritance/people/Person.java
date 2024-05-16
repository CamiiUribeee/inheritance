
package com.mycompany.inheritance.people;


public class Person {
    private String name; 
    private String lastName;
    private String id;
    private int age;

    public Person(String name, String lastName, String id, int age) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    
    
}
