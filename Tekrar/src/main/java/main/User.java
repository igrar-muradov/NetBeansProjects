/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class User {

    
    
    
    
    public User() {
        System.out.println("User yaradildi");
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    public static void foo() {
        System.out.println("Foo method invoked");
    }
}
