/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import main.thread.MyConsumer;
import main.thread.MyProducer;

/**
 *
 * @author Igrar
 */
public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyProducer());
        Thread t2 = new Thread(new MyProducer());

        Thread tc1 = new Thread(new MyConsumer("Azay"));
        Thread tc2 = new Thread(new MyConsumer("Azay"));
        Thread tc3 = new Thread(new MyConsumer("Azay"));

        t1.start();
        t2.start();

        tc1.start();
        tc2.start();
        tc3.start();

    }
}
