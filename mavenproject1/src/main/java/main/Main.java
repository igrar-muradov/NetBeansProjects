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
        
        User u = new User();
        System.out.println("---------------------");
        User u1 = new User("Igrar-1", "Muradov-1");
        System.out.println("---------------------");
        User u2 = new User("Igrar-2", "Muradov-2", 24);

        u.userInfo();
        u1.userInfo();
        u2.userInfo();
    }
}
