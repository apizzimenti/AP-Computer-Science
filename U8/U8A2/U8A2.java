//  Anthony Pizzimenti
//
/*  driver class for the bankaccount() class which generates
	new bank account info from a text file
*/
//  for AP, my best friend.
/*  ---------------------- */

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;

public class U8A2 extends JFrame {
    private ArrayList<bankaccount> accounts = new ArrayList<bankaccount>();
    private JTextArea area = new JTextArea();
    private Container contain = getContentPane();

    public U8A2() {
        contain.add(area);
        Font brand = new Font("monospaced", Font.PLAIN, 12);
        area.setFont(brand);

        BuildList();
        PrintList();

        Deposit("103s", 500.0);
        Withdraw("110s", 304.52);
        InsertNewAcct("105c", 300.0);
        DeleteDormantAccts();
        CorrectError("107s", 1113.88);
        ApplyInterest();
        InsertNewAcct("111s", 100.0);
        fileUpdated();
    }

    public static void main(String[]args) {
        U8A2 x = new U8A2();
        x.setSize(500, 500);
        x.setVisible(true);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void BuildList() {
        try {
            Scanner read = new Scanner(new File(
             "C:\\Users\\Anthony\\Dropbox\\Comp Sci\\U8\\U8A2\\myCreditUnion.txt"
            	));
            while (read.hasNext()) {
                String[] data = new String[1];
                String input = read.nextLine();
                data = input.split(" ");
                double init = Double.parseDouble(data[1]);

                accounts.add(new bankaccount(data[0], init));
            }
            read.close();
        } catch (IOException except) {
            throw new RuntimeException(except.toString());
        }
    }

    public void PrintList() {
        area.append("Account #\tBalance\n");
        for (int i = 0; i < accounts.size(); i++) {
            bankaccount newacct = accounts.get(i);
            String accountNum = newacct.getAccountNum();
            double bal = newacct.getBalance();
            area.append(accountNum + "\t\t$ " + bal + "\n");
        }
        area.append("\n");
    }

    public void Deposit(String accountNum, double amt) {
        String out = null;

        for (int i = 0; i < accounts.size(); i++) {
            bankaccount newacct = accounts.get(i);
            if (accountNum.equals(newacct.getAccountNum())) {
                out = newacct.deposit(amt);
            } else {
                continue;
            }
        }
        area.append("\n" + out);
    }

    public void Withdraw(String accountNum, double amt) {
        String out = null;

        for (int i = 0; i < accounts.size(); i++) {
            bankaccount newacct = accounts.get(i);
            if (accountNum.equals(newacct.getAccountNum())) {
                out = newacct.withdraw(amt);
            } else {
                continue;
            }
        }
        area.append("\n" + out + "\n");
    }

    public void InsertNewAcct(String accountNum, double init) {
        String num = accountNum.substring(0, 3);
        String type = accountNum.substring(3, 4);

        if (type.equals("c")) {
            for (int i = 0; i < accounts.size(); i++) {
                String newnum = accounts.get(i).getAccountNum();
                newnum = newnum.substring(0, 3);
                if (num.equals(newnum)) {
                    bankaccount newer = new bankaccount(accountNum, init);
                    accounts.add(i+1, newer);
                    break;
                } else {
                    continue;
                }
            }
        } else {
            bankaccount newer = new bankaccount(accountNum, init);
            accounts.add(accounts.size(), newer);
        }
        area.append("New Account Added\n");
    }

    public void DeleteDormantAccts() {
        int counter = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getBalance() <= 0) {
                counter++;
                accounts.remove(i);
            } else {
                continue;
            }
        }
        String total = counter + "";
        area.append(counter + " Account(s) Deleted\n");
    }

    public void CorrectError(String accountNum, double bal) {
        bankaccount setter = new bankaccount(accountNum, bal);
        for (int i = 0; i < accounts.size(); i++) {
            bankaccount newer = accounts.get(i);
            if (newer.getAccountNum().equals(accountNum)) {
                accounts.set(i, setter);
            } else {
                continue;
            }
        }
        area.append("Correction Completed\n");
    }

    public void ApplyInterest() {
        for(int i = 0; i < accounts.size(); i++) {
            bankaccount apply = accounts.get(i);
            apply.interest();
        }
        area.append("Interest Applied to all Savings Accounts\n");
    }

    public void fileUpdated() {
        try {
            FileWriter writer = new FileWriter(
             "C:\\Users\\Anthony\\Dropbox\\Comp Sci\\U8\\U8A2\\temp.txt"
            	);
            PrintWriter out = new PrintWriter(writer);

            String file = "";
            for (int i = 0; i < accounts.size(); i++) {
                bankaccount newer = accounts.get(i);
                file += newer.getAccountNum() + " ";
                String bal = String.format("%.2f%n", newer.getBalance());
                file += bal;
            }
            out.println(file);
            out.close();
        } catch (IOException except) {
            throw new RuntimeException(except.toString());
        }
        area.append("File Updated\n");
    }
}