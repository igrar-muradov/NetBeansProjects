/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Igrar
 */
public class InputUtil {
    
    public static String requireText(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        String text = sc.nextLine();
        return text;
    }
    
    public static int requireNumber(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        int number = sc.nextInt();
        return number;
    }
}
