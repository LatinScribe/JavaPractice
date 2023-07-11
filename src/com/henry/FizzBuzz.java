/*
Author: Henry "TJ" Chen
Last modified: July 10, 2023

Returns a different message depending on whether the inputted
number is divisible by 3, 5, or both
 */
package com.henry;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // get user's number of choice
        System.out.print("Number: ");
        int user_number = new Scanner(System.in).nextInt();

        // repetition of checking condition, but avoids nesting
        if (user_number % 3 == 0 && user_number % 5 == 0)
            System.out.println("FizzBuzz");
        else if (user_number % 3 == 0 )
            System.out.println("Buzz");
        else if (user_number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(user_number);
    }
}
