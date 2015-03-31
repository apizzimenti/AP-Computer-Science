//  Anthony Pizzimenti
//
/*  Driver class for the bankaccount() class; creates two
 bank accounts and prints their information after a series
 of transfers.
*/
//  for AP, my best friend

import javax.swing.*;
import java.awt.*;

public class U8A1 extends JApplet {
    public void init() {
        //  makes initial window
        JTextArea area = new JTextArea();
        Container out = getContentPane();
        Font except = new Font("monospaced", Font.PLAIN, 12);
        area.setFont(except);
        out.add(area);
        
        String info = "Account Information";
        area.append(info+"\n");
        for(int i=0; i<info.length(); i++)
            area.append("-");
        
        area.append("\n\n");
        
        //  creates new bank accounts, gets balances and acct nums
        bankaccount first = new bankaccount();
        bankaccount second = new bankaccount(1500);
        
        String first_in = String.format("%.2f",first.getBalance());
        String second_in = String.format("%.2f",second.getBalance());
        
        int num = first.getAccountNum();
        int num2 = second.getAccountNum();
        
        area.append("Initial Balance for Account "+num+" = $"+first_in);
        area.append("\nInitial Balance for Account "+num2+" = $"+second_in);
        
        area.append("\n\n");
        
        //  does a bunch of withdrawals and deposits
        area.append(first.deposit(300)+"\n");
        area.append(second.deposit(200)+"\n");
        area.append(first.withdraw(250)+"\n");
        area.append(second.withdraw(125)+"\n");
        
        first.interest();
        second.interest();
        
        //  takes money out of one and tries to deposit in the other
        String transfer = first.withdraw(550);
        
        if(transfer.equals("Withdrawal Accepted")) {
            String first_withdraw = first.withdraw(550);
            String accept = second.deposit(550);
            area.append("Withdrawal Accepted\n");
            if(accept.equals("Deposit Accepted"))
                area.append("Deposit Accepted");
            else
                area.append("Deposit Rejected");
        }
        
        else {
            area.append(transfer);
            area.append("\nDeposit Rejected");
        }
        
        first.interest();
        second.interest();
        
        //  prints final balances and interest rate
        String first_out = String.format("%.2f",first.getBalance());
        String second_out = String.format("%.2f",second.getBalance());
        area.append("\n\nFinal Balance for Account "+num+" = $"+first_out);
        area.append("\nFinal Balance for Account "+num2+" = $"+second_out);
        String last_out = String.format("%.1f",bankaccount.getRate());
        area.append("\n\nInterest Rate = "+last_out+"%");
    }
}
