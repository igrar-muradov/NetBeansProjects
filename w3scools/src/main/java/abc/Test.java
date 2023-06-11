
package abc;

public class Test {
    public static void main(String[] args) {
        int i = 5;
        int i1 = 0;
        System.out.println(i + "\n" + i1);
        System.out.println("Cavab = " + i / i1);
    }
}


//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at main.Test.main(Test.java:9)