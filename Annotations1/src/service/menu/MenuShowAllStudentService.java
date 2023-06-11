/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import service.inter.menu.MenuShowAllStudentServiceInter;

/**
 *
 * @author Igrar
 */
public class MenuShowAllStudentService implements MenuShowAllStudentServiceInter{

    @Override
    public void process() {
        
        Student[] s = Config.getInstance().getStudents();
        for(int i=0; i<s.length;i++){
            System.out.println((i+1)+". "+s[i]);            
        }
    }
    
}
