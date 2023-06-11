/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import lombok.SneakyThrows;
import main.thread.Base;
import main.thread.MyConsumer;
import main.thread.MySyncConsumer;

/**
 *
 * @author Igrar.Muradov
 *
 */
// Shared resource eyni deyishene 1 den çox Thread-in muraciet edilmesidir
// hemin muracietleri novbeye salmaq uchun synchronized istifade olunur
// yeni muracietleri siralayir
// normalda java her bir thread uchun yaddash sahesini kopyalayir
// bezen problem ola biler. Bunun ucun Volatile istifade edilir
// yeni yaddaş sahesini butun threadler uchun sinoxranizasiya edir
public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("Thread count = " + Thread.activeCount());
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new MySyncConsumer("Thread-a-" + i));
        }

        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }
        System.out.println("Thread count = " + Thread.activeCount());
        Thread.sleep(2000);

        
        
        
        
        
        System.out.println("--------------------------------------");

        Thread[] threads2 = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads2[i] = new Thread(new MyConsumer("Thread-b-" + i));
        }

        for (int i = 0; i < 100; i++) {
            threads2[i].start();
        }
        
        
        
        System.out.println("Thread count = " + Thread.activeCount());
        Thread.sleep(3000);

        
        System.out.println("Synchronized a = " + Base.getA());
        System.out.println("Base.b = " + Base.b);
        
        
        

    }
}
