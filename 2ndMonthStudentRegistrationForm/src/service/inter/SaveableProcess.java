/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.inter;

import bean.Config;

/**
 *
 * @author Igrar
 */
public interface SaveableProcess extends Process{
    @Override
    public default void process(){
        processLogic();
        Config.save();
    }

    public void processLogic();
}
