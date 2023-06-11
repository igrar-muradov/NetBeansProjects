/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import static main.Main.requestNumber;

/**
 *
 * @author Igrar.Muradov
 */
public class Anar {

    public static void main(String[] args) {
        int a = requestNumber("1-ci Eded: ");
        int b = requestNumber("2-ci Eded: ");
        if (a != b) {
            System.out.println("Bele bir reqem yoxdur");
        } else{
            System.out.println("Beraberir!");
        }
        
    }

}
