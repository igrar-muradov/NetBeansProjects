/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student.Builder stud = new Student.Builder();
        stud.setId(23)
                .setName("Igrar");
        Student s = stud.build();
        
        System.out.println(s);
        
        
    }
    
    

}
