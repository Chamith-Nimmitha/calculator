package org.example;

public class Calculator {

    private double total;

    Calculator(){
        this.total = 0;
    }

    void add(double num1, double num2){
        this.total = num1 + num2;
    }

    void sub(double num1, double num2){
        this.total = num1 - num2;
    }

    void multiply(double num1, double num2){
        this.total = num1 * num2;
    }

    void divide(double num1, double num2){

        if (num2 == 0){
            System.out.println("You can't divide by 0.");
            return;
        }
        this.total = num1 / num2;
    }

    double getTotal(){
        return this.total;
    }

}
