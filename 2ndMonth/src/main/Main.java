package main;

import bean.BMW;
import bean.Car;

public class Main {

    public static void main(String[] args) {

        Car c = new BMW();
        c.stop();
        System.out.println("----------------");

        BMW.A ba = new BMW().new A();
        ba.foo();
        System.out.println("----------------");

        BMW.S bs = new BMW.S();
        bs.foo();
        System.out.println("----------------");

        Car.Sc csc = new Car.Sc();
        csc.foo();

        Car cc = new Car() {
            @Override
            public void drive() {
                
            }

            @Override
            public void speedUp() {
                
            }
        };

    }

}
