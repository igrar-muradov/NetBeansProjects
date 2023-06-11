/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import lombok.SneakyThrows;

/**
 *
 * @author Igrar
 */
public class MyConsumer implements Runnable {

    String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("I am started and waiting 2 seconds");
        Thread.sleep(2000);
            Base.a++; 
//            System.out.println("Azay = "+Base.a);

    }

}
