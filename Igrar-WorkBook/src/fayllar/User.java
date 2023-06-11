 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fayllar;

/**
 *
 * @author Igrar
 */
public class User {
    
//Classin icherisi editlenenden sonra 
//Class evvelki vaziyyetde iken yaratdigimiz obyekti fayldan chagirmaq uchun 
    private static final long serialVersionUID = 1L;
    
    public String name;
//obyektin sechilmish parametrinin deyerini 
//obyekte yazmamaq uchun transient keywordu ishledirik    
    public transient String password;
    
    public int i;
}
