/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


public class MyThisTest {
  private int a;

  public MyThisTest() {
    this(42); // calls the other constructor
  }

  public MyThisTest(int a) {
    this.a = a; // assigns the value of the parameter a to the field of the same name
  }

  public void frobnicate() {
    int a = 1;

    System.out.println(a); // refers to the local variable a
    System.out.println(this.a); // refers to the field a
    System.out.println(this); // refers to this entire object
  }

  public String toString() {
    return "MyThisTest a=" + a; // refers to the field a
  }
  
  public void salam(){
      System.out.println("salam");
  }
}