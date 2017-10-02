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
                case "9.1":
                    NineOne nineOne = new NineOne();
                    nineOne.run();
                    break;
                case "10.3":
                    System.out.print("Indtast et hel tal: ");
                    int n = iScn.nextInt();
                    MyInterger mi = new MyInterger(n);
                    System.out.println("Er tallet lige? " + mi.isOdd());
                    System.out.println("Er tallet ulige? " + mi.isEven());
                    System.out.println("Er tallet et primtal? " + mi.isPrime());

                case "q":
                case "quit":
                case "exit":
                    bob = false;
                    break;

            }

        }

    }

}
