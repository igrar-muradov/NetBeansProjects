/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 * @param <T>
 */
public class Container<T> {

    private T object;

    public Container(T object) {
        this.object = object;
    }

    public T doItAndReturn() {
        System.out.println("I did something");
        return object;
    }
}
