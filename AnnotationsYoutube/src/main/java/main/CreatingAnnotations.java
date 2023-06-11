/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class CreatingAnnotations {

    public static void main(String[] args) {

        @SuppressWarnings("unused")
        Cat myCat = new Cat("Stella");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very Important");
        } else {
            System.out.println("This thing is NOT important");

        }

    }
}
