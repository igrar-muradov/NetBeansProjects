/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import main.thread.Base;
import main.thread.MyConsumer;

/**
 *
 * @author Igrar.Muradov
 */
public class Main {

    public static void main(String[] args) {
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i]=new Thread(new MyConsumer("Test-"+i));
        }
        
        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }
        
        System.out.println(Base.a);
         
    }
}
