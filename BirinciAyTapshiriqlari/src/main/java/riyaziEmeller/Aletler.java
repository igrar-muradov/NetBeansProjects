/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riyaziEmeller;

import java.util.Scanner;

/**
 *
 * @author Igrar
 */
public class Aletler {
    public static void ededinAdi() {

        Scanner sc = new Scanner(System.in);
        System.out.print("9,223,372,036,854,775,807-i\nashmayan eded daxil edin z.o\n: ");
        long eded = sc.nextLong();

        String result = "";
        String[] arr = new String[20];
        String[] arr1 = {"", "bir", "iki", "uc", "dord", "bes", "alti", "yeddi", "sekkiz", "doqquz"};
        String[] arr2 = {"", "on", "iyirmi", "otuz", "qirx", "elli", "altmis", "yetmis", "seksen", "doxsan"};
        int reqem = 0;
        int say = 0;

        while (eded != 0) {

            for (int i = 0; i < 3; i++) {
                reqem = (int) (eded % 10);
                switch (i) {
                    case 0 ->
                        arr[say] = arr1[reqem];
                    case 1 ->
                        arr[say] = arr2[reqem];
                    default -> {
                        if (reqem!=0) {
                            arr[say] = arr1[reqem] + " yuz";
                        } else {
                            arr[say] = arr1[reqem];
                        }
                    }
                }
                eded /= 10;
                if (eded != 0) {
                    say++;
                } else {
                    break;
                }
            }
        }

        for (int i = say; i >= 0; i--) {
            
            if (i != 0 && !"".equals(arr[i])) {
                result += (arr[i] + " ");
            } else {
                result += arr[i];
            }    
                   
            if ((i%3==0)) {
                switch (i/3) {
                    case 1 ->
                        result += "min ";
                    case 2 ->
                        result += "milyon ";
                    case 3 ->
                        result += "milyard ";
                    case 4 ->
                        result += "trilyon ";
                    case 5 ->
                        result += "kvadrilyon ";
                    case 6 ->
                        result += "quintillion ";    
                    default -> {
                        }
                }
            }
            
        }
        System.out.println("Netice = " + result);
    }
}