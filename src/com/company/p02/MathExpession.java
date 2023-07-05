package com.company.p02;
import static java.lang.Math.*;

// класс Math для математических выражений, длинная арифметика - BigInteger, BigDecimal
public class MathExpession {
    public static boolean doubleExpression(double a, double b, double c) {
        double k = a + b;
        return (abs(k - c) <= 0.0001);
    }

    public static void main(String[] args) {
        System.out.println(doubleExpression(2, 3, 5));
        System.out.println(java.lang.Math.PI);
    }

}
