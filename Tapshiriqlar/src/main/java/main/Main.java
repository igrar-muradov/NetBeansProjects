/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Igrar
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = 48;
        int b = 100;
        
        System.out.println("EBOB = "+ebob(a, b));
        System.out.println("EKOB = "+ekob(a, b));

    }



    public static int ebob(int a, int b) {

        int[] arrA = ededinSadeBolenleri(a);
        int[] arrB = ededinSadeBolenleri(b);
        int ebob = 1;

        for (int i = 0; i < arrA.length; i++) {

            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) {
                    ebob *= arrB[j];
                    break;
                }
            }
        }
        return ebob;
    }

        public static int ekob(int a, int b) {

        if (b > a) {
            int c = a;
            a = b;
            b = c;
        }

        int[] arrA = ededinSadeBolenleri(a);
        int[] arrB = ededinSadeBolenleri(b);

        for (int i = 0; i < arrA.length; i++) {

            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) {

                    arrB[j] = 1;
                    break;
                }
            }
        }
        int hasil = 1;
        for (int i : arrB) {
            hasil *= i;
        }
        
        return a * hasil;
    }
    
    public static int[] ededinSadeBolenleri(int a) {
        List<Integer> list = new ArrayList<>();
        int sv = 0;
        while (a > 2) {
            sv = 2;
            while (true) {
                if (a % sv == 0) {
                    a /= sv;
                    list.add(sv);
                    break;
                }
                sv++;
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

}
