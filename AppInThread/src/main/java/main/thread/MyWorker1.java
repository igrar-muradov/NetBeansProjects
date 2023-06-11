/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import java.util.Scanner;

/**
 *
 * @author Igrar
 */
public class MyWorker1 extends Thread {

    @Override
    public void run() {
        System.out.println("Azay");
        System.out.println("Eldar");
        System.out.println("Javid");
        System.out.println("Nargiz");
        
        System.out.print("Gozleyir: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    }

}
