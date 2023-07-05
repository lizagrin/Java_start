package com.company.p02;

// примитивные типы: boolean; char; byte - 8, short - 16, int - 32, long - 64 (нет signed, unsigned); float, double
// ссылочные типы: string

public class Bool {
    public static void booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int i = 0;
        if (b) i++;
        if (c) i++;
        if (d) i++;
        if (a) i++;
        System.out.println(i == 2);
    }

    public static void main(String[] args) {
        booleanExpression(true, false, true, true);
    }
}
