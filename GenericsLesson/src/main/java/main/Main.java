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

        Container container = new Container();
        Double u1 = container.<Double>doItAndReturn1(3.4);
        Integer u2 = container.<Integer>doItAndReturn2(3);

    }

}
