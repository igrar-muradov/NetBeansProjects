/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author Igrar
 */
public class RealInternet implements Internet{

    @Override
    public void connectTo(String serverhost){
        System.out.println("Connecting to "+ serverhost);
    }
    
}
