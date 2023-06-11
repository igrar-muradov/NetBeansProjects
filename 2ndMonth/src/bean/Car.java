/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bean;

/**
 *
 * @author Igrar
 */
public interface Car extends Mechanical {
    
    public class Ac{
        public void foo(){
            System.out.println("I am an Inner Class in Car object");
        }
    }
    
    public static class Sc{
        public void foo(){
            System.out.println("I am an Nested Class (Static) in Car class");
        }
    }

    public abstract void drive();

    public abstract void speedUp();

    default public void stop() {
        drive();
        speedUp();
    }
}
