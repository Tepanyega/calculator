package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Please enter your expression: ");
            String expression = scanner.nextLine();
            double result = calculator.evaluate(expression);
            System.out.println("Result: " + result);
        }catch (Exception e){
            System.err.println("Invalid expression" + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}