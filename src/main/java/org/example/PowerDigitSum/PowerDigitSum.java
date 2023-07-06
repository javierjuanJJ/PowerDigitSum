package org.example.PowerDigitSum;

import java.math.BigInteger;

public class PowerDigitSum {

    public static int potence(int number, int exponent){
        int result = 1;

        for (int counter = 0; counter < exponent; counter++) {
            result *= number;
        }

        return result;
    }

    public static BigInteger potence2(int number, int exponent){
        BigInteger result = BigInteger.ONE;

        for (int counter = 0; counter < exponent; counter++) {
            // result *= number;
            result = new BigInteger(String.valueOf(result.multiply(new BigInteger(String.valueOf(number)))));
        }

        return result;
    }


    public static int sumDigitsNumber(int number){
        int reverseNumber = 0;
        int temp = number;
        int remainder = 0;

        while (temp > 0){
            remainder = (temp % 10);
            reverseNumber += remainder;
            temp /= 10;
        }

        return reverseNumber;
    }

    public static int powerDigitsSum(int number, int exponent){
        int potence = potence(number, exponent);

        return sumDigitsNumber(potence);
    }

    public static int powerDigitsSum2(int number, int exponent){
        BigInteger potence = potence2(number, exponent);
        // System.out.println(potence);
        return sumDigitsNumber2(potence).intValue();
    }


    public static BigInteger sumDigitsNumber2(BigInteger number){
        BigInteger reverseNumber = BigInteger.ZERO;
        BigInteger temp = number;
        BigInteger remainder = BigInteger.ZERO;

        while (temp.compareTo(BigInteger.ZERO) > 0){
            // System.out.println(temp.compareTo(BigInteger.ZERO));
            // remainder = (temp % 10);
            remainder = new BigInteger(String.valueOf(temp.mod(new BigInteger(String.valueOf(10)))));
            // System.out.println(remainder);
            // reverseNumber = reverseNumber + remainder;
            reverseNumber = new BigInteger(String.valueOf(reverseNumber.add(new BigInteger(String.valueOf(remainder)))));
            // System.out.println(reverseNumber);
            // temp /= 10;
            temp = new BigInteger(String.valueOf(temp.divide(new BigInteger(String.valueOf(10)))));
        }

        return reverseNumber;
    }

}
