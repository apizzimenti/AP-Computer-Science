//  Anthony Pizzimenti
//
/*  bankaccount() class, which has a series of methods
 to allow the user to track banking information.
 */
//  for AP, my best friend.
/*  ---------------------- */

public class bankaccount {

    private double balance;
    private String accountType;
    private String currentnum;
    private static final double rate = .04;

    public bankaccount(String accountNum, double initial) {
        setAccountType(accountNum);
        currentnum = accountNum;
        balance = initial;
    }

    public void setAccountType (String accountNum) {
        accountType = accountNum.substring(3, 4);
    }

    public void setBalance() {
        balance = Math.random()*1000;
    }

    public String deposit(double deposit) {
        if(deposit > 0) {
            balance += deposit;
            return "Deposit Accepted";
        } else {
            return "Deposit Rejected";
        }
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
        if (accountType.equals("s")) {
            balance = balance*(1+rate);
        }
    }

    public String getAccountNum() {
        return currentnum;
    }

    public double getBalance() {
        return balance;
    }
}