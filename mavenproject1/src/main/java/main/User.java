/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class User extends Person {

    public String companyName = "Igi-Tech";

    static {
        System.out.println("Salam");
    }

    {
        System.out.println("19 -cu setir");
    }

    public User() {
        this("Name NOT Defined", "Surname NOT Defined");
        System.out.println("Constructor User 1");

    }

    public User(String ad, String soyad) {
        this(ad, soyad, -1);
        System.out.println("Constructor User 2");

    }

    public User(String ad, String soyad, int yash) {
        super.setName(ad);
        super.setSurname(soyad);
        super.setAge(yash);
        System.out.println("Constructor User 3");
    }
    
    public void userInfo(){
        System.out.println(super.getName()+" "+super.getSurname()+" "+super.getAge());
    }

}
