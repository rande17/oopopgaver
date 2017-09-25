/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopopgaver;

/**
 *
 * @author clutt
 */
public class OOPopgaver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make an instance of the Investment class
        Investment invest = new Investment();
        
        //using the methods in invest to print out the result
        System.out.println(invest.futureInvestmentValue(invest.getInvestDouble(), invest.getIntrestDouble(), invest.getYearsInt()));
    }

}
