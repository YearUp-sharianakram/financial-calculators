package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the number of the calculator you would like to use today?");
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

    public static void futureValueCalculator(){

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