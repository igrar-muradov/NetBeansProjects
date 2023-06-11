package main;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        BMW b = new BMW();
        if(b.name==null){
            try {
                throw new CarNameNullException("Ad Yoxdur");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                
                System.out.println(ex.getCause());
                
                System.out.println(ex.toString());
                
                ex.printStackTrace();
                
                System.out.println(ex.getStackTrace().toString());
                
                System.out.println(ex.fillInStackTrace());
            }
        }
    }

}
