package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

         String input = "10 cm + 1 m - 10 mm";
         String outputType = "mm";

        System.out.println(calculator.calculate(input, outputType));


    }
}
