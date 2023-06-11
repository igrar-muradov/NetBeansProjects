/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class Mercedes extends Car {
    public int yanacaqYandirma = 15;
    
    public Mercedes(){
        System.out.println("Bir Mercedes obyekti yaradildi");
    }
    
    
    
    @Override
    public void drive(){
        System.out.println("Drive Mercedes");
    }
}
