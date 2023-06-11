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
        
        MyProducer p1 = new MyProducer();
        MyProducer p2 = new MyProducer();
        
        MyConsumer m1 = new MyConsumer("Azay");
        MyConsumer m2 = new MyConsumer("Eldar");
//        MyConsumer m3 = new MyConsumer("Javid");
//        MyConsumer m4 = new MyConsumer("Nargiz");
//        MyConsumer m5 = new MyConsumer("Rashid");
//        MyConsumer m6 = new MyConsumer("Tural");
        
        p1.start();
        p2.start();
        
        m1.start();
        m2.start();
//        m3.start();
//        m4.start();
//        m5.start();
//        m6.start();
        
        
    }
}
