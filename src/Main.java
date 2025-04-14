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
        double futureValue = 0;
        double totalInterestEarned = 0;
        int numberOfDays = (int) (365 * numberOfYears);

        //CALCULATIONS   FV = P × (1 + (r / 365))^(365 × t)
        futureValue = deposit * Math.pow((1 + (annualInterestRate / 365)),(numberOfDays));
        totalInterestEarned = futureValue - deposit;

        //OUTPUT
        System.out.printf("Your future value is %.2f \n",futureValue);
        System.out.printf("Your total interest earned is %.2f \n",totalInterestEarned);

//        a. It would accept the deposit, interest rate, and number of
//        years from the user

//        b. It would display the future value and the total interest
//        earned

//        Example: If you deposit $1,000 in a CD that earns 1.75%
//                interest and matures in 5 years, your CD's ending balance will
//                 be $1,092.62 and you would have earned $92.62 in interest
//        Note: The numbers above assume daily compounding
//        FV = P × (1 + (r / 365))^(365 × t)
//          • Future Value (FV)
//          • Principal (P): This is the initial deposit amount.
//          • Annual Interest Rate (r): The nominal annual interest rate in decimal form
//                   (e.g., 1.75% = 0.0175).
//          • Number of Years (t): The total number of years the deposit will earn interest.
//          • Days Per Year: Daily compounding assumes 365 days per year.
//          • Total Number of Days: This is 365 × t (because there are 365 days per year).
//          • Total Interest Earned = FV - P
    }
}