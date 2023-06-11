/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar.Muradov
 */
public class Siralama {

    public static void main(String[] args) {
        
        
        
        
        
        
    }

    public static int[] SiraliMassiv(int arr[]){
        int elem;
        int q=arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < q - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    elem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = elem;
                }
                
            }
            q--;
        }
        return arr;
    }
    
    public static void arrayToString(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
