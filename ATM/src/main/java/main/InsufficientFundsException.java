/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class InsufficientFundsException extends Exception{
    
    private double amount;
    
    public InsufficientFundsException(double amount){
    this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }
    
}
