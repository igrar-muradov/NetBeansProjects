/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Igrar
 */
public class Main {

    public static void main(String[] args) {

        String metn = "  Salam   necesen      ishler nece gedir   ?    ";
        System.out.println(foo(metn));

    }

    public static String foo(String s) {
        String result = "";
        boolean b = true;
        for (int i = 0; i < s.length()-2; i++) {
            b = s.charAt(i) == ' ' && s.charAt(i + 1) == s.charAt(i);
            
            if (!b){
                result += s.charAt(i);
            }
        }
        return result.trim();
    }

}
