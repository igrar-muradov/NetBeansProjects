/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import service.inter.menu.MenuAddTeacherServiceInter;
import util.Utils;

/**
 *
 * @author Igrar
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void processLogic() {
        
        String name = Utils.requestText("Name : ");
        String surname = Utils.requestText("Surname : ");

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config conf = Config.getInstance();
        conf.appendTeacher(t);
        System.out.println(t);
        System.out.println("Teacher added Succesfully");
    }

}
