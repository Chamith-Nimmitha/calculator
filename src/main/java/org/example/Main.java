package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        double total = 0.0;

        System.out.println("########### CALTUCATOR ###############\n");

//        test 1 - addition
        System.out.println("TEST ADDING");
        cal.add(12, 1.2);
        total = cal.getTotal();
        System.out.format("Ans : %s \n\n", total);

//        test 2 - subtraction
        System.out.println("TEST SUBTRACTION");
        cal.sub(total, 1.2);
        total = cal.getTotal();
        System.out.format("Ans : %s \n\n", total);

//        test 3 - multiplication
        System.out.println("TEST MULTIPLY");
        cal.multiply(total, 10);
        total = cal.getTotal();
        System.out.format("Ans : %s \n\n", total);

//        test 4 - division
        System.out.println("TEST DIVIDE");
        cal.divide(total, 5);
        total = cal.getTotal();
        System.out.format("Ans : %s \n\n", total);

//        test 4 - division by 0
        System.out.println("TEST DIVIDE BY ZERO");
        cal.divide(total, 0);
        total = cal.getTotal();
        System.out.format("Ans : %s \n\n", total);


    }
}
