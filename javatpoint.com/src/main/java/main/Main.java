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
        
        Object sObj = s;
        Object ssObj = ss;
        
        boolean b = sObj.equals(ssObj);
        
        System.out.println("b = "+b);

    }
}
