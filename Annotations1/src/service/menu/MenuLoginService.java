/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import service.inter.menu.MenuLoginServiceInter;
import util.Utils;

/**
 *
 * @author Igrar
 */
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process()  {
        String username = Utils.requestText("Username: ");
        String password = Utils.requestText("Password: ");
        
        if( !(username.equals("user") && password.equals("11111")) ){
            throw new IllegalArgumentException("Username or Password is invalid");
        }
        
        Config.setLoggedIn(true);
    }
    
}
