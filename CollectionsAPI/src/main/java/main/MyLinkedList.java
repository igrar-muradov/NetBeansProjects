/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class MyLinkedList {

    private Node lastElement;

    class Node {

        private Object obj;
        private Node nextElement;

        public Node(Object obj) {
            this.obj = obj;
        }

        public void setNextElement(Node node) {
            this.nextElement = node;
        }
    }

    public void add(Object obj) {
        Node n = new Node(obj);
        if (lastElement == null) {
            lastElement=n;
        }else{
            lastElement.setNextElement(n);
            lastElement=n;
        }
    }

}
