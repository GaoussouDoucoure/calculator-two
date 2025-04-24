// CALCULATOR 2 FROM FINANCIAL CALCULATOR PROJECTS ON BRIGHTSPACE

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Calculator 2: A calculator that determines the future value of a
//        one-time deposit assuming compound interest - it is used to help
//        you decide how much a CD will be worth when it matures
        Scanner sc = new Scanner(System.in);

        //VARIABLES
        System.out.print("Please enter your deposit amount, eg 100, 75.50: ");
        double deposit = sc.nextDouble();
        System.out.print("Please enter your Annual Interest Rate, eg 5.25, 10: ");
        double annualInterestRate = sc.nextDouble() / 100;
        System.out.print("Please enter the Number of Years for the CD, eg 5: ");
        double numberOfYears = sc.nextDouble();
        int numberOfDays = (int) (365 * numberOfYears);

        //CALCULATIONS   FV = P × (1 + (r / 365))^(365 × t)
        double futureValue = deposit * Math.pow((1 + (annualInterestRate / 365)), (numberOfDays));
        double totalInterestEarned = futureValue - deposit;

        //OUTPUT
        System.out.printf("Your future value is %.2f \n",futureValue);
        System.out.printf("Your total interest earned is %.2f \n",totalInterestEarned);
    }
}