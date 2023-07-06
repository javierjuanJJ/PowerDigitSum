package org.example;

import org.example.PowerDigitSum.PowerDigitSum;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int y = PowerDigitSum.powerDigitsSum(2,15);
        System.out.println(y);
        int x = PowerDigitSum.powerDigitsSum2(2, 1000);
        System.out.println(x);
    }
}