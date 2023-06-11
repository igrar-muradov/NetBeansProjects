/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import lombok.SneakyThrows;

/**
 *
 * @author Igrar
 */
public class MyRunnable implements Runnable {
    
    private int index;
    
    public MyRunnable(int index){
        this.index = index;
    }
    

    @SneakyThrows
    @Override
    public void run() {
        System.out.println(index+". MyRunnable ishe dushdu ve 3 saniye gozleyecek");
        Thread.sleep(3000);
        System.out.println("Ishi bitirdi");
    }

}
