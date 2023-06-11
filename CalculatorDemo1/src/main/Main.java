

package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        int emel = requestNumber("1.+\n2.-\n3.*\n4./\nEmeliyyatin nomresini\ndaxil edin: ");
        int a = requestNumber("Birinci eded: ");
        int b = requestNumber("Ikinci eded: ");
        switch (emel) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("1-4 arasi bir edd daxil edin");
                break;
        }
    }
    
    
    
    
    public static int requestNumber(String question){
        System.out.print(question);
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        return answer;
    }
}
