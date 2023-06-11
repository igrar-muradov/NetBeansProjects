/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

/**
 *
 * @author Igrar.Muradov
 */
public class Base {

// Shared resource eyni deyishene 1 den çox Thread-in muraciet edilmesidir
// hemin muracietleri novbeye salmaq uchun synchronized istifade olunur
// yeni muracietleri siralayir
    
// normalda java her bir thread uchun yaddash dsahesi kopyalayir
// bezen problem ola biler. Bunun uchgu volatile istifade edilir
// yeni yaddaş sahesini butun threadler uchun sinoxranizasiya edir
        
    
    private static volatile int a = 0;
    public static int b=0; 

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Base.a = a;
    }
    
    public synchronized static void incA(){
        a++;
    }
    
}
