/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Random;
import static main.Main.requestNumber;

/**
 *
 * @author Igrar.Muradov
 */
public class Oyun {

    public static void main(String[] args) {

        Random rand = new Random();
        int selectedNum = rand.nextInt(1000);
        System.out.println(selectedNum);
        System.out.println("1-1000 araligindaki sechilmish ededi tapin.");
        int  ceht=0;
        while (true) {
            ceht++;
            int number = requestNumber("Ededi daxil edin: ");
            if (number == selectedNum) {
                System.out.println("Tebriklerrr!!!\n" + ceht + " cehtde tapdiniz.");
                break;
            } else if (number > selectedNum) {
                System.out.println("Daxil etdiyiniz eded boyukdur");
            } else {
                System.out.println("Daxil etdiyiniz eded balacadir");
            }

        }

    }

}
