/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fayllar;

import static fayllar.FileUtility.*;
/**
 *
 * @author Igrar
 */
public class FaylDemo {

    public static void main(String[] args) throws Exception {
        
        appendToFile("Salam.txt", "\nNecesen?");
        
        byte[] data = readBytesNio("invoice.png");
        writeBytes("salam.png", data);
    }
    
    
    
    
}

