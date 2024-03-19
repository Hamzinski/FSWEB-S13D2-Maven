package org.example;

public class Main {
    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -1226;

        System.out.println(num1 + " is a palindrome: " + isPalindrome(num1));
        System.out.println(num2 + " is a palindrome: " + isPalindrome(num2));

        System.out.println("isPerfectNumber(28): " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5): " + isPerfectNumber(5));

        System.out.println("numberToWords(123): " + numberToWords(123));
        System.out.println("numberToWords(1010): " + numberToWords(1010));
        System.out.println("numberToWords(123): " + numberToWords(-123));
    }

    public static boolean isPalindrome(int number) {
        boolean isNegative = number < 0;
        number = Math.abs(number);
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10; // bir basamak sağa kay
        }
        if (isNegative && reversedNumber != originalNumber) {
            return false;
        }
        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int digit = number % 10;
            result.insert(0, words[digit] + " ");
            number /= 10;
        }

        return result.toString().trim();
    }


}
