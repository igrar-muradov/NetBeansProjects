
package main;

public class Main{
    
    public static void main(String[] args) {
        
    Cat.CatBuilder cb = new Cat.CatBuilder();
    cb.setName("Scotish Fold")
            .setAge(12);
    Cat c = cb.build();
    
        System.out.println(c);
        
    
    
        
        
//        Cat c = new Cat();
    }
    
}