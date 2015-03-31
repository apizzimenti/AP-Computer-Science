public class TemperatureGrid
{
    private double[][]temps;
    private double[][]newTemps;
    
    public TemperatureGrid(double[][]t)
    {
        temps = t;
        newTemps = new double[temps.length][temps[0].length];
        setNewTemps();
    }
    
    private double computeTemp(int row, int col)
    {
        double temp1 = temps[row][col];
        
        if(row==0 || col==0 || row==temps.length-1 || col==temps[0].length-1)
            return temp1;
        else
        {
            double avg = temps[row][col-1]+temps[row][col+1]+temps[row-1][col]+temps[row+1][col];
            avg /= 4;
            return avg;
        }
    }
    
    private void setNewTemps()
    {
        for(int i=0; i<temps.length; i++)
        {
            for(int j=0; j<temps[0].length; j++)
            {
                newTemps[i][j] = computeTemp(i,j);
            }
        }
    }
    
    public boolean withinTolerance(double tolerance)
    {
        int falsecount = 0;
        int truecount = 0;
        boolean returner = false;
        
        for(int i=0; i<temps.length; i++)
        {
            for(int j=0; j<temps[0].length; j++)
            {
                if(Math.abs(newTemps[i][j]-temps[i][j])>tolerance)
                    falsecount++;
                else
                    truecount++;
            }
        }
        
        if(falsecount>=1)
            returner = false;
        else
            returner = true;
        
        return returner;
    }
    
    public String toString()
    {
        String output = "";
        
        for(int i=0; i<temps.length; i++)
        {
            for(int j=0; j<temps[0].length; j++)
            {
                output += (newTemps[i][j]+"\t");
            }
            output += ("\n");
        }
        
        return output;
    }
}

