/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import bean.Fanar;
import bean.Fanar.FanarBuilder;

/**
 *
 * @author Igrar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FanarBuilder fb = new Fanar.FanarBuilder();
        fb.setName("dd");
        fb.build();

        System.out.println(fb);

    }

}
