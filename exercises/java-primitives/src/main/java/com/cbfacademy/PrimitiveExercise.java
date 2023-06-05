package com.cbfacademy;
// Unary Operator
public class PrimitiveExercise {
//    public static void main(String[] args) {
//
//        int number1 = 12;
//        int number2 = 12;
//
//        System.out.println(number1++);
//        System.out.println(++number2);
//    }
//
//}
//        The code demonstrates pre and post increment by 1. incremented before
//        and after the operation.

//public class DecimalArithmetic {
    //arithmetic operations
//    public static void main(String[] args) {
//        // Using float data type
//        float num1 = 3.5f;
//        float num2 = 2.0f;
//        float sumFloat = num1 + num2;
//        float diffFloat = num1 - num2;
//        float prodFloat = num1 * num2;
//        float divFloat = num1 / num2;
//
//        System.out.println("Float Results:");
//        System.out.println("Sum: " + sumFloat);
//        System.out.println("Difference: " + diffFloat);
//        System.out.println("Product: " + prodFloat);
//        System.out.println("Division: " + divFloat);
//
//        // Using double data type
//        double num3 = 3.5;
//        double num4 = 2.0;
//        double sumDouble = num3 + num4;
//        double diffDouble = num3 - num4;
//        double prodDouble = num3 * num4;
//        double divDouble = num3 / num4;
//
//        System.out.println("\nDouble Results:");
//        System.out.println("Sum: " + sumDouble);
//        System.out.println("Difference: " + diffDouble);
//        System.out.println("Product: " + prodDouble);
//        System.out.println("Division: " + divDouble);
//    }
//}

    //Relational Operations
    public static void main(String[] args) {
        double num1 = 3.14;
        double num2 = 2.71;

        // Compare equality of decimal numbers
        boolean isEqual = num1 == num2;

        // Evaluate which decimal is higher
        boolean isNum1Higher = num1 > num2;

        // Evaluate which decimal is smaller
        boolean isNum1Smaller = num1 < num2;

        System.out.println("Equality: " + isEqual);
        System.out.println("Is num1 higher? " + isNum1Higher);
        System.out.println("Is num1 smaller? " + isNum1Smaller);
    }
}
