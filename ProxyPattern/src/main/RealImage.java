/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class RealImage implements Image {

   private final String fileName;

   public RealImage(String fileName){
      this.fileName = fileName;
      loadFromDisk(fileName);
   }

   private void loadFromDisk(String fileName){
      System.out.println("Loading " + fileName);
   }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    
}