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
        Cat c = new Cat();
        Dog d = new Dog();
    }

    public static void test(Animal a) {
        if (a instanceof Cat) {
            Cat a2 = (Cat) a;
        } else if (a instanceof Dog) {
            Dog a2 = (Dog) a;
        }
    }
    
}
