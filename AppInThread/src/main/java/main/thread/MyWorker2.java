/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

/**
 *
 * @author Igrar
 */
public class MyWorker2 extends Thread {
    
    String name;
    
    public MyWorker2(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(name+" is processed");
        }
        
    }

}
