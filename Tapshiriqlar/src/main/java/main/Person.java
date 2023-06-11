/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class Person {

    public String name;
    public String surname;
    public int age;

    public void personInfo() {
        System.out.println("Name Surname = " + name + " " + surname);
    }
    
    public static void foo(Person pp){
        System.out.println("Person name = "+pp.name);    }
    
    public static void foo(User uu){
        System.out.println("User name = "+uu.name);    }
}
