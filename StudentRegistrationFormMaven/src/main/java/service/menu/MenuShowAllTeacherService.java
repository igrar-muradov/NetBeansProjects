/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import service.inter.menu.MenuShowAllTeacherServiceInter;

/**
 *
 * @author Igrar
 */
public class MenuShowAllTeacherService implements MenuShowAllTeacherServiceInter {

    @Override
    public void process() {

        Teacher[] t = Config.getInstance().getTeachers();
        for (int i = 0; i < t.length; i++) {
            System.out.println((i + 1) + ". " + t[i]);
        }
    }

}
