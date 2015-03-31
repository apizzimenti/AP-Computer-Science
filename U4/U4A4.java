// Anthony Pizzimenti
//
// Determines how much cold hard ca$h you
// owe the credit card company.
// For AP, my best friend.

import java.util.Scanner;

public class U4A4
{
 private int months;
 private double accum, balance, minpay, monthpay, newbal, profit, apr;

 public static void main(String[]args)
 {
  U4A4 x = new U4A4();
 }

 public U4A4()
 {
  Scanner y = new Scanner(System.in);

  System.out.print("Enter credit card balance: ");
  balance = y.nextDouble();

  System.out.print("\nEnter miminum monthly payment (as a % of the balance): ");
  minpay = y.nextDouble();

  System.out.print("\nEnter the annual percentage rate: ");
  apr = y.nextDouble();

  profit = getMonths(balance);

  String a = (String.format("%.2f", profit));

  System.out.println("\n\nNumber of months to pay off debt: " + months);
  System.out.println("\nProfit for the credit card copmpay = $" + a);
  System.out.println();


 }

 public double getMonths(double bal)
 {

  monthpay = bal * (minpay/100);

  if(bal > 20 && monthpay <= 20)
  {
   monthpay = 20;
   accum += monthpay;
   newbal = bal * (1 + (apr/1200)) - monthpay;
  }
  else if(bal > 20 && monthpay > 20)
  {
   accum += monthpay;
   newbal = bal * (1 + (apr/1200)) - monthpay;
  }
  
  else
  {
    monthpay = bal;
    accum += monthpay;
    newbal = 0;
  }
  
  months++;

  if(newbal == 0)
  {
   return (accum - balance);
  }
  else
  {
   return (getMonths(newbal));
  }
 }
}






