/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class CustomExceptionHandler extends Exception implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        // Handle the exception here
        System.out.println("CustomExceptionHandler: An uncaught exception occurred!");
        System.out.println("Thread: " + t.getName());
        System.out.println("Exception: " + e.getMessage());
        e.printStackTrace();
    }
}
