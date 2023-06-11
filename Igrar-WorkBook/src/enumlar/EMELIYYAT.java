/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumlar;

/**
 *
 * @author Igrar
 */
public enum EMELIYYAT {
    
    TOPLA('+'), CIX('-'), VUR('*'), BOL('/');
    private final char c;

    private EMELIYYAT(char c) {
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
