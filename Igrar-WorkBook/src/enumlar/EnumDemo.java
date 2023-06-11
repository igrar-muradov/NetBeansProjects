/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumlar;

/**
 *
 * @author Igrar
 */
public class EnumDemo {


    public static void main(String[] args) {
       
        EMELIYYAT e = EMELIYYAT.TOPLA;
        
        double net = e.hesabla(7, 8);
        System.out.println(net);
        
        System.out.println(e.getOperationSymbol());
        System.out.println(e.name());
        System.out.println(e.ordinal());
        System.out.println(e.getClass().getName());
        System.out.println(e.getClass().getSuperclass());
        System.out.println(e.getClass().getInterfaces().length);
    }
    
}
