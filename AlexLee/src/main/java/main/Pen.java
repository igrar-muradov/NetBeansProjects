/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class Pen {
    
    String type = "gel";
    String color = "blue";
    int point = 10;
    
    static boolean clicked = false;
    
    public static void click() {
        clicked  = true;
    }
    
    public static void unclick(){
        clicked  = false;
    }
            
    
    
    
}
