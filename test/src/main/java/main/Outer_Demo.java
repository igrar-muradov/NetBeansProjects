/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

class Outer_Demo {
    // private variable of the outer class

    private int num = 175;

    // inner class
    public class Inner_Demo {

        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return num;
        }
    }
}
