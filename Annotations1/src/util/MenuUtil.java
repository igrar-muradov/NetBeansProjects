/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import static util.Utils.requestNumber;

/**
 *
 * @author Igrar
 */
public class MenuUtil {

    public static void showMenu() {

        Menu.showAllMenu(); 
        int selectedMenu = requestNumber("Please select Menu: ");
        Menu selected = Menu.find(selectedMenu);
        selected.process();

    }

    

}
