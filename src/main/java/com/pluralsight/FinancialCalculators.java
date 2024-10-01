package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int whichCalculator = promptForChoosingCalculator();
        if (whichCalculator == 1){
            mortgageCalculator();
        }else if (whichCalculator == 2){
            futureValueCalculator();
        }else{
            presentValueCalculator();
        }
    }

    public static void mortgageCalculator(){

    }
//  FinalValue = deposit(1 + interestRate)^ years
    public static void futureValueCalculator(){
        double deposit = promptForDouble("Please enter your deposit amount: ");
        double interestRate = promptForDouble("Please enter your interest rate: ");
        int years = promptForInt("Please enter the number of years: ");

        double FinalValue = deposit * Math.pow((1 + (interestRate/100)), years);
        double totalInterest = FinalValue - deposit;
        System.out.println("Interest accrued is " + totalInterest);
        System.out.println("Your ending balance is " + FinalValue);

    }

    public static void presentValueCalculator(){

    }


    public static String promptForString(String prompt) {
        System.out.println(prompt);
        return myScanner.nextLine();
    }
    public static int promptForInt(String prompt){
        System.out.println(prompt);
        int num = myScanner.nextInt();
        myScanner.nextLine();
        return num;
    }

    public static double promptForDouble(String prompt){
        System.out.println(prompt);
        double num = myScanner.nextDouble();
        myScanner.nextLine();
        return num;
    }
    public static int promptForChoosingCalculator() {
        System.out.println("Calculator 1: Mortgage calculator");
        System.out.println("Calculator 2: Future Value Calculator");
        System.out.println("Calculator 3: Present Value Calculator");
        System.out.println("Please enter the number of the calculator you would like to use today?");
        int number = myScanner.nextInt();
        myScanner.nextLine();
        return number;

    }


}