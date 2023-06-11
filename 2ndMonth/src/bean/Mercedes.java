/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Igrar
 */
public class Mercedes implements Car{

    @Override
    public void drive() {
        System.out.println("Mercedes Drive");
    }

    @Override
    public void speedUp() {
        System.out.println("SpeedUp Mercedes");
    }
    
}
