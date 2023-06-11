/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class MyArrayList {

    private String[] arr = new String[10];
    private int size = 0;

    public void add(String elem) {
        int arrL = arr.length;
        if (size == arrL) {
            String[] arrNew = new String[arrL / 2 + arrL];
            for (int i = 0; i < arrL; i++) {
                arrNew[i] = arr[i];
            }
            arr=arrNew;
        }
        arr[size] = elem;
        size++;
    }

    public String get(int i) {
        return arr[i-1];
    }
    
    public int getSize(){
        return size;
    }
    
    @Override
    public String toString(){
        String listAll = "";
        for (int i = 0; i < size; i++) {
            listAll+=arr[i];
            listAll+="\n";
        }
        return listAll;
    }
}
