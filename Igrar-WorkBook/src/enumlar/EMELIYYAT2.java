/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumlar;

/**
 *
 * @author Igrar
 */



// ENUMlarin ishleme prinsipi

public final class EMELIYYAT2 {

    public static final EMELIYYAT2 TOPLA = new EMELIYYAT2('+');
    public static final EMELIYYAT2 CIX = new EMELIYYAT2('-');
    public static final EMELIYYAT2 VUR = new EMELIYYAT2('*');
    public static final EMELIYYAT2 BOL = new EMELIYYAT2('/');
    
    private char c;
    
    private EMELIYYAT2(){
        
    }

    private EMELIYYAT2(char c) {
        this.c = c;
    }
    
    public char getOperationSymbol(){
        return this.c;
    }
    
    public double hesabla(double a, double b){
        if(c=='+'){
            return a+b;
        }
        if(c=='-'){
            return a-b;
        }
        if(c=='*'){
            return a*b;
        }
        if(c=='/'){
            return a/b;
        }
        return -1;
    }
    
}
