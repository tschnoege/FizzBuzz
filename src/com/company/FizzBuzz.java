package com.company;

public class FizzBuzz {

    public static boolean checkFizz(int number) {
        return (number % 3) == 0;
    }

    public static boolean checkBuzz(int number) {
        return (number % 5) == 0;
    }

    public static String get(int number) {
        String result = "";

        if (checkFizz(number)) {
            result = "Fizz";
        }

        if (checkBuzz(number)) {
            result += "Buzz";
        }

        return (result == "") ? String.valueOf(number) : result;
    }
}