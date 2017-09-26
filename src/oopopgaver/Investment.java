/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopopgaver;

import java.util.Scanner;

/**
 *
 * @author clutt
 */
public class Investment {
    

    /**
     * 
     * @param investmentAmount amount that the users wants to invest
     * @param monthlyInterestRate the monthly intrestrate
     * @param years the years the users wants to invest
     * @return returns the expected outcome of the investment
     */
    public double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double profit;

        profit = investmentAmount * Math.pow((1 + (monthlyInterestRate)), 12 * years);

        return profit;
    }
    
    
    /**
     * 
     * @return returns a double that should be used for the amount the user wants to invest
     */
    public double getInvestDouble() {
        System.out.print("Enter amount to like to invest: ");
        double invest;
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextDouble()) {
            invest = scn.nextDouble();
        } else {
            System.out.println("Error, expecting a number, try again!");
            return getInvestDouble();
        }

        return invest;
    }

    
    /**
     * 
     * @return return the monthly intrestrate as a double from the yearly intrestrate from the scanner
     */
    public double getIntrestDouble() {
        System.out.print("Enter intrest rate: ");
        double intrest;
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextDouble()) {
            intrest = scn.nextDouble();
        } else {
            System.out.println("Error, expecting a number, try again!");
            return getIntrestDouble();
        }

        return intrest / 12 / 100;
    }

    /**
     * 
     * @return returns an int that should be used as the yearly input
     */
    public int getYearsInt() {
        System.out.print("How long you want to invest in years: ");
        int years;
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            years = scn.nextInt();
        } else {
            System.out.println("Error, expecting a whole number, try again!");
            return getYearsInt();
        }

        return years;
    }
}
