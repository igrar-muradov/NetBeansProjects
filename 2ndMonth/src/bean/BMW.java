/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Igrar
 */
public class BMW implements Car{
    
    public class A{
        public void foo(){
            System.out.println("I am an Inner Class in BMW object");
        }
    }
    public static class S{
        public void foo(){
            System.out.println("I am an Nested Class (Static) in BMW class");
        }
    }

    @Override
    public void drive() {
        System.out.println("BMW drive");
    }

    @Override
    public void speedUp() {
        System.out.println("SpeedUp BMW");
    }
    
    
}
