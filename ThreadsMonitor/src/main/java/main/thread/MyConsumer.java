/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import lombok.SneakyThrows;

/**
 *
 * @author Igrar.Muradov
 */
public class MyConsumer implements Runnable{

    private String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @SneakyThrows
    @Override
    public void run() {
//        System.out.println("I am started");
        Thread.sleep(1000);
        Base.incA();
        

    }
}
