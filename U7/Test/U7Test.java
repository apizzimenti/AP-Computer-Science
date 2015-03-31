// Anthony Pizzimenti
//
/* driver class for a program that solves a system of
   equations using matrices
*/
// for AP, my best friend

import java.util.Scanner;

public class U7Test
{
    public static void main(String[]args)
    {
        matrix2by2 matrix = new matrix2by2();
        Scanner in = new Scanner(System.in);

        for(int i=0; i<2; i++)
        {
            int[][]coefs = new int[2][2];
            int[]consts = new int[2];

            // first set
            System.out.print("Enter 1st X coefficient: ");
            coefs[0][0] = in.nextInt();

            System.out.print("Enter 1st Y coefficient: ");
            coefs[0][1] = in.nextInt();

            System.out.print("Enter 1st constant: ");
            consts[0] = in.nextInt();
            System.out.println();


            // second set
            System.out.print("Enter 2nd X coefficient: ");
            coefs[1][0] = in.nextInt();

            System.out.print("Enter 2nd Y coefficient: ");
            coefs[1][1] = in.nextInt();

            System.out.print("Enter 2nd constant: ");
            consts[1] = in.nextInt();
            System.out.println();
            System.out.println();

            matrix.getMatrix(coefs);
            int breakable = matrix.getDeterminant();
            if(breakable==-1)
                System.out.println("NO SOLUTION\n\n");
            else
            {
                double[]finals = matrix.multiply(consts);

                System.out.println("X = "+finals[0]);
                System.out.println("Y = "+finals[1]);
                System.out.println("\n\n");
            }
        }
    }
}




