/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class Car extends Vehicle {
    
    public int a=3;

    public String modelName = "Mustang";

    public int yanacaqYandirma = 12;
        
    
    public void signal() {
        System.out.println("Bam! Bam!");
    }
    
    @Override
    public void drive() {
        System.out.println("Drive Car");
    }
    
   

    
}
