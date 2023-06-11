/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import main.thread.MyWorker2;

/**
 *
 * @author Igrar
 */
public class Main2 {

    public static void main(String[] args) {
        
        MyWorker2 m1 = new MyWorker2("Azay");
        MyWorker2 m2 = new MyWorker2("Eldar");
        MyWorker2 m3 = new MyWorker2("Javid");
        MyWorker2 m4 = new MyWorker2("Nargiz");
        MyWorker2 m5 = new MyWorker2("Rashid");
        MyWorker2 m6 = new MyWorker2("Tural");
        
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();
        
        
    }
}
