package com.henry;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // get user input
        System.out.print("Principal: ");
        int principle = scanner.nextInt();

        // note, this is converted to monthly
        System.out.print("Annual Interest Rate: ");
        float mon_rate = scanner.nextFloat() / 1200;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();

        // calculate monthly payment
        float monthly_payment = (float) ((principle * mon_rate * Math.pow((1 + mon_rate), (12.0f * period))) /
                (Math.pow((1 + mon_rate), (12.0f * period)) - 1));
        // display the result
        System.out.println("Mortgage (per month): " + currency.format(monthly_payment));
    }
}
