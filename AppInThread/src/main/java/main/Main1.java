/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import main.thread.MyWorker1;

/**
 *
 * @author Igrar
 */
public class Main1 {

    public static void main(String[] args) {
        MyWorker1 m1 = new MyWorker1();
        MyWorker1 m2 = new MyWorker1();
        MyWorker1 m3 = new MyWorker1();
        
        m1.start();
        m2.start();
        m3.start();
        
    }
}
