/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import lombok.*;

@Data
public class ObjTest {

    public String name;
    private String surname;
    public int age;
    public static String salam="change-Me";

    @SneakyThrows
    public void foo(int i) {
        if (i > 9) {
            throw new Exception("i 9-dan boyuk olamamilidir!");
        }

    }

}
