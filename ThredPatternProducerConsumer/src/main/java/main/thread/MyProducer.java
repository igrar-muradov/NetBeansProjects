/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import java.util.UUID;

/**
 *
 * @author Igrar
 */
public class MyProducer extends Thread {

    @Override
    public void run() {
        while (true) {
            Base.list.add(UUID.randomUUID().toString());
        }
    }
}
