/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import service.inter.menu.MenuAddStudentServiceInter;
import util.Utils;

/**
 *
 * @author Igrar
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter{

    @Override
    public void processLogic(){
        
        String name = Utils.requestText("Name : ");
        String surname = Utils.requestText("Surname : ");
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        
        Config conf = Config.getInstance();
        conf.appendStudent(s);
        System.out.println(s);
        System.out.println("Student added Succesfully");
    }
    
}
