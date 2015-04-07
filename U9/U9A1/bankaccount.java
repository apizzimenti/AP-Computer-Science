//  Anthony Pizzimenti
//
/*  bankaccount() class, which has a series of methods
    to allow the user to track banking information.
*/
//  for AP, my best friend

import java.util.*;

public class bankaccount implements Measurable {

    private double balance;
    private static int account = 100;
    private int second;
    private static final double rate = .04;

    public bankaccount() {
        setBalance();
        account++;
        second = account;
    }

    public bankaccount(double initial) {
        balance = initial;
        account++;
        second = account;
    }

    public void setBalance() {
        balance = Math.random()*1000;
    }

    public String deposit(double deposit) {
        if(deposit > 0) {
            balance += deposit;
            return "Deposit Accepted";
        }

        else
            return "Deposit Rejected";
    }

    public String withdraw(double withdraw) {
        if(withdraw <= balance) {
            balance -= withdraw;
            return "Withdrawal Accepted";
        }

        else
            return "Withdrawal Denied - Insufficient Funds";
    }

    public void interest() {
        balance = balance*(1+rate);
    }

    public int getAccountNum() {
        return second;
    }

    public double getMeasure() {
        return balance;
    }

    public static double getRate() {
        return (rate*100);
    }
}