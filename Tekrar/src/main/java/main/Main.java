/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class Main {

    public static void main(String[] args) {
        String s = new String("Java");
        String ss = new String("Java");
        System.out.println("s+ss "+s.equals(ss));
        
        Object sObj = s;
        Object ssObj = ss;
        System.out.println("sObj+ssObj "+sObj.equals(ssObj));
        
        Animal c = new Cat();
        Animal d = new Dog();
        
        c.eat();
        d.eat();
        
        
    }
    
}
