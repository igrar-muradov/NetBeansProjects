/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

/**
 *
 * @author Igrar
 */
// Synchronized block
// synchronized (this) - burdaki this Monitor adlanir
// Thread Monitora chatanda. eyni monitor terefinden
// idare olunan butun yerlerde gozleme bash verir
// bu gozleme lock adlanir

public class MyProducer1 {
    
    private Object monitor1 = new Object();
    private Object monitor2 = new Object();
    

    public void doIt1() {
        System.out.println("doIt-1 basladi");
        synchronized (monitor1) {
            System.out.println("doIt-1");
        }
        System.out.println("doIt-1 bitti");
    }

    public void doIt2() {
        System.out.println("doIt-2 basladi");
        synchronized (monitor1) {
            System.out.println("doIt-2");
        }
        System.out.println("doIt-2 bitti");
    }

    public void doIt3() {
        System.out.println("doIt-3 basladi");
        synchronized (monitor2) {
            System.out.println("doIt-3");
        }
        System.out.println("doIt-3 bitti");
    }

}
