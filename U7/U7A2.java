// Anthony Pizzimenti
//
// Aggregates election results and sorts them by precinct and by candidate, then determines a winner.
// For AP, my best friend.

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class U7A2
{
    public static void main(String[]args)
    {
        for(int f=1; f<4; f++)
        {
            String aw = JOptionPane.showInputDialog("Enter Number of Candidates:\n");
            int candidates = Integer.parseInt(aw);
            String bw = JOptionPane.showInputDialog("Enter Number of Precincts:\n");
            int precincts = Integer.parseInt(bw);
            
            int[][]firstresults = new int[candidates][precincts];
            
            Scanner in;
            try
            {
                FileReader reader = new FileReader("Results"+(f)+".txt");
                in = new Scanner(reader);
            }
            catch(IOException except_1)
            {
                throw new RuntimeException(except_1.toString());
            }
            
            for(int i=0; i<candidates; i++)
            {
                for(int j=0; j<precincts; j++)
                {
                    firstresults[i][j] = in.nextInt();
                }
            }
            in.close();
            
            electionResults election = new electionResults(candidates,precincts,firstresults);
            
            String totalpre = "Total votes cast in each Precinct";
            String totalcan = "Total votes cast for each Candidate";
            
            // precincts
            System.out.println(totalpre);
            
            for(int k=0; k<totalpre.length(); k++)
            {
                System.out.print("-");
            }
            
            System.out.println();
            
            int[]a = election.getPrecinctTotals();
            
            for(int l=0; l<precincts; l++)
            {
                int precinctTotal = a[l];
                System.out.println("Precinct "+(l+1)+": "+precinctTotal);
            }
            
            System.out.println("\nTotal votes cast: "+election.getGrandTotal()+"\n");
            
            // candidates
            System.out.println(totalcan);
            
            for(int m=0; m<totalcan.length(); m++)
            {
                System.out.print("-");
            }
            
            System.out.println();
            
            int[]b = election.getCandidateTotals();
            
            for(int n=0; n<candidates; n++)
            {
                int candidateTotal = b[n];
                double percent = ((double)candidateTotal/(double)election.getGrandTotal())*100;
                System.out.print("Candidate "+(n+1)+": "+candidateTotal+"\t");
                String canPercent = String.format("%.1f",percent);
                System.out.println(canPercent+"%");
            }
            
            int winner = 0;
            int small = b[0];
            for(int ex=0; ex<b.length; ex++)
            {
                if(b[ex]>small)
                    winner = (ex+1);
                else if(b[ex]==small)
                    winner = (ex+1);
            }
            
            System.out.println("\nCandidate "+winner+" is the WINNER!");
            System.out.print("\n\n\n");
        }
    }
}