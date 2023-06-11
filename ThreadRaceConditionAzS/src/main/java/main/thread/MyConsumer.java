/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

/**
 *
 * @author Igrar.Muradov
 */
public class MyConsumer implements Runnable {
        private final String name;

    public MyConsumer(String name) {
        this.name = name;
    }
        
    @Override
    public void run() {
//            while(true){
                Base.a++;
//                System.out.println("Base.a = "+Base.a);
//            }
    }
}
