/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import util.InputUtil;

/**
 *
 * @author Igrar
 */
public class Main {

    public static void main(String[] args) {

        while (true) {
            int menu = InputUtil.requireNumber("----------------------\nWhat do you want to do?\n1. Register Student\n2. Show All Students\n3. Find Student\n4. Update Student\n:");
            util.MenuUtil.processMenu(menu);
        }
    }
}
