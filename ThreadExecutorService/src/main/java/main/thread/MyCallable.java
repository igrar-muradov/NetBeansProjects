/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import java.util.concurrent.Callable;
import lombok.SneakyThrows;

/**
 *
 * @author Igrar
 */
public class MyCallable implements Callable<Object> {

    private int index;
    
    public MyCallable(int index){
        this.index = index;
    }
    
    @Override
    public Object call(){
        doIt();
        return this;
    }
    
    @SneakyThrows
    public void doIt() {
        System.out.println(index+". MyRunnable ishe dushdu ve 3 saniye gozleyecek");
        Thread.sleep(3000);
        System.out.println("Ishi bitirdi");
    }
    
}
