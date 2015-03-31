import java.util.Arrays;

public class multi1
{
    public static void main(String[]args)
    {
        int[][]m = new int[8][10];
        
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<10; j++)
            {
                m[i][j] = j*j;
            }
        }
        
        String output = "";
        
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<10; j++)
            {
                output += m[i][j]+"\t";
            }
            output += "\n";
        }
        
        System.out.println(output);
    }
}