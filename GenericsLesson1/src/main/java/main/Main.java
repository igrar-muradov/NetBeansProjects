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
    
    // Raw type     
    // type Erasure 

    public static void main(String[] args) {
        Container<User> container = new Container<>(new User());
        container.doItAndReturn();
        doSomething(container);
        
        
    }
    
    public static void doSomething(Container<User> container) {
        User u = (User) container.doItAndReturn();
        System.out.println("u = "+u);
        
        
    }
    
}
