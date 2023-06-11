/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import lombok.SneakyThrows;
import main.thread.Base;
import main.thread.MyConsumer;

/**
 *
 * @author Igrar
 */
public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new MyConsumer("Thread-" + i));

        }
        for (int i = 0; i < 100; i++) {
           threads[i].start();

        }

        Thread.sleep(4000);

        System.out.println(Base.a);

    }
}
