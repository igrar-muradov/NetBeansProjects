/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import lombok.SneakyThrows;
import main.thread.Base;
import main.thread.MyConsumer;
import main.thread.MyConsumer;
import main.thread.MyProducer;

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
        
         MyProducer m = new MyProducer();
         
         m.doIt1();
         m.doIt2();
         m.doIt3();
        
        

    }
}
