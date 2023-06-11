/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import java.util.LinkedList;

/**
 *
 * @author Igrar
 */
public class Main {

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        
        user1.setUser(user2);
        user2.setUser(user3);
        user3.setUser(user4);
        
        user1.getUser().getUser().getUser();
                
        LinkedList<String> l = new LinkedList<>();
        l.add("Eldar");
        l.add("Javid");
        l.add("Rashid");
        
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));            
        }
 
//-----------------------------------------------------        
       
        
//        User user1 = new User();
//        User user2 = new User();
//        User user3 = new User();
//        User user4 = new User();
//        
//        user1.setUser(user2);
//        user2.setUser(user3);
//        user3.setUser(user4);
//        
//        user1.getUser().getUser().getUser();
//                
//        LinkedList<String> l = new LinkedList<>();
//        l.add("Eldar");
//        l.add("Javid");
//        l.add("Rashid");
//        
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));            
//        }
        
        
//-----------------------------------------------------        

        
//        ArrayList<String> l = new ArrayList<>();
//        l.add("Eldar");
//        l.add("Javid");
//        l.add("Rashid");
//        
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));            
//        }
        
        
//-----------------------------------------------------        
        
//        MyArrayList list = new MyArrayList();
//        list.add("Test1");
//        list.add("Test2");
//        list.add("Test3");
//        list.add("Test4");
//        list.add("Test5");
//        list.add("Test6");
//        list.add("Test7");
//        list.add("Test8");
//        list.add("Test9");
//        list.add("Test10");
//        list.add("Test11");
//        list.add("Test12");
//        System.out.println(list.getSize());
//        System.out.println(list.get(3));
//        System.out.println(list.toString());
    }
}
