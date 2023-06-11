/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Igrar
 */
public class MenuUtil {
    public static void processMenu(int option) {
         switch (option) {
                case 1 -> StudentUtil.registerStudents();
                case 2 -> StudentUtil.printAllRegisteredStudents();
                case 3 -> StudentUtil.findStudentsAndPrint();
                case 4 -> StudentUtil.updateStudentInfo();
                default -> {
            }
            }
    }
}
