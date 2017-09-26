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
public class OOPopgaver {

    static boolean bob = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (bob) {
            chooseTask();
        }

    }

    public static void chooseTask() {
        String o;
        System.out.print("Select task: ");
        Scanner iScn = new Scanner(System.in);
        if (iScn.hasNext()) {
            o = iScn.next();
            switch (o) {
                case "1":
                    //make an instance of the Investment class
                    Investment invest = new Investment();
                    //using the methods in invest to print out the result
                    System.out.println(invest.futureInvestmentValue(invest.getInvestDouble(), invest.getIntrestDouble(), invest.getYearsInt()));
                    break;
                case "q":
                case "quit":
                case "exit":
                    bob = false;
                    break;
                    
            }

        }

    }

}
