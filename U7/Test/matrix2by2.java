// Anthony Pizzimenti
//
/* calculations class for a program that solves a
   system of equations using matrices
*/
// for AP, my best friend

public class matrix2by2
{
    private int[][]mat = new int[2][2];

    public void getMatrix(int[][]a)
    {
        mat = a;
    }

    private int determinant()
    {
        int determinant = (mat[1][1]*mat[0][0])-(mat[0][1]*mat[1][0]);
        return determinant;
    }

    public int getDeterminant()
    {
        int returnable = determinant();
		return returnable;
    }

    private double[][] inverse()
    {
        double[][]inverse = new double[2][2];

        int d = mat[1][1];
        int a = mat[0][0];

        inverse[0][0] = (double)d;
        inverse[0][1] = (double)(mat[0][1]*-1);
        inverse[1][0] = (double)(mat[1][0]*-1);
        inverse[1][1] = (double)a;

        double inv = 1/(double)(determinant());

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                inverse[i][j] = inverse[i][j] * inv;
            }
        }

        return inverse;
    }

    public double[] multiply(int[]c)
    {
        double[][]multi = inverse();
        double[]last = new double[2];

        last[0] = (multi[0][0]*c[0])+(multi[0][1]*c[1]);
        last[1] = (multi[1][0]*c[0])+(multi[1][1]*c[1]);

        return last;
    }
}