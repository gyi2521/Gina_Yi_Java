package com.company;

public class App {
    public static void main(String[] args) {

    Calculator calculator = new Calculator();

    int intAddition = calculator.add(1,1);
    int intSubtraction = calculator.subtract(23,52);
    int intMultiplication = calculator.multiply(34,2);
    int intDivision = calculator.divide(12,3);
    int intDivision2 = calculator.divide(12,7);
    double doubleAddition = calculator.add(3.4, 2.3);
    double doubleMultiplication = calculator.multiply(6.7, 4.4);
    double doubleSubtraction = calculator.subtract(5.5, 0.5);
    double doubleDivision = calculator.divide(10.8, 2.2);


        System.out.println("1+1 = " + intAddition);
        System.out.println("23-52 = " + intSubtraction);
        System.out.println("34*2 = " + intMultiplication);
        System.out.println("12/3 = " + intDivision);
        System.out.println("12/7 = " + intDivision2);
        System.out.println("3.4+2.3 = " + doubleAddition);
        System.out.println("6.7*4.4 = " + doubleMultiplication);
        System.out.println("5.5-0.5 = " + doubleSubtraction);
        System.out.println("10.8 / 2.2 = " + doubleDivision);


    }
}
