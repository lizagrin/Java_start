package com.company.p02;

public class Flip {
    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value    any number
     * @param bitIndex index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        int bit = 1 << (bitIndex - 1);
        return value ^ bit;
    }
    public static void main(String[] args) {
        System.out.println(flipBit(13, 2));
    }
}
