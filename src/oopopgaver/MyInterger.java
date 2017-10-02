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
public class MyInterger {

    int value;

    public MyInterger(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        if (this.value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (this.value % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        for (int i = 2; i < this.value; i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int n) {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
