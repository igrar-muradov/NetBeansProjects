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
public class Utils {
    public static int requestNumber(String question){
        System.out.print(question);
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        return answer;
    }
    
    public static String requestText(String question){
        System.out.print(question);
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }
    
}
