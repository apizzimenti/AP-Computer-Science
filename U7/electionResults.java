//  Anthony Pizzimenti
//
//  Collects and places election results into separate arrays.
//  For AP, my best friend.

public class electionResults
{
    private int numCandidates;
    private int numPrecincts;
    private int[][]results;
    private int[]cTotals;
    private int[]pTotals;
    private int grandTotal;

    public electionResults(int nC, int nP, int[][]r)
    {
        numCandidates = nC;
        numPrecincts = nP;
        results = r;

        cTotals = new int[numCandidates];
        pTotals = new int[numPrecincts];

        // grand total
        for(int f=0; f<results.length; f++)
        {
            for(int m=0; m<results[0].length; m++)
            {
                grandTotal += results[f][m];
            }
        }

        // candidate totals
        for(int row=0; row<numCandidates; row++)
        {
            for(int i=0; i<numPrecincts; i++)
            {
                cTotals[row] += results[row][i];
            }
        }

        // precinct totals
        for(int col=0; col<numPrecincts; col++)
        {
            for(int j=0; j<numCandidates; j++)
            {
                pTotals[col] += results[j][col];
            }
        }
    }

    public int getGrandTotal()
    {
        return grandTotal;
    }

    public int[] getCandidateTotals()
    {
        return cTotals;
    }

    public int[] getPrecinctTotals()
    {
        return pTotals;
    }
}


