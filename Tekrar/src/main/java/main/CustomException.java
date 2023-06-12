/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class CustomException extends Exception {

    public static void main(String[] args) throws CustomExceptionHandler {
        
        

        try {
            //code that may raise exception  
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            throw new CustomExceptionHandler();
        }
        //rest code of the program   
        System.out.println("rest of the code...");

    }

}
