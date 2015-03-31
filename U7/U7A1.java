// Anthony Pizzimenti
//
// Playing a simulated Game of Life
// For AP, my best friend.

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U7A1 extends JFrame
{
    private JTextArea area = new JTextArea();
    private String[][] board =
    {{" "," "," "," "," "," "},
     {" "," ","*"," "," "," "},
     {" "," "," ","*"," "," "},
     {" ","*","*","*"," "," "},
     {" "," "," "," "," "," "},
     {" "," "," "," "," "," "}};
    private boolean occupied;

    public U7A1()
    {
        Container contain = getContentPane();
        contain.add(area);
        Font except = new Font("monospaced", Font.PLAIN, 12);
        area.setFont(except);

        setSize(200,500);
        setVisible(true);
        
        area.setText("Generation 0\n");
        PrintMatrix();
        
        for(int i=1; i<5; i++)
        {
            changeCells();
            if(i%2==0)
            {
                area.append("Generation "+i+"\n");
                PrintMatrix();
            }
        }
        
    }

    public void PrintMatrix()
    {
        for(int j=0; j<6; j++)
        {
            for(int i=0; i<6; i++)
            {
                area.append(board[j][i]+"|");
            }

            area.append("\n");
            area.append("-------------\n");
        }
    }

    public static void main(String[]args)
    {
        U7A1 x = new U7A1();
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int neighbors(int row, int col)
    {
        int count=0;

        for(int i=row-1; i<=row+1; i++)
        {
            for(int j=col-1; j<=col+1; j++)
            {
                try
                {
                    if(board[i][j].equals("*"))
                        count++;
                }
                
                catch(ArrayIndexOutOfBoundsException except_1)
                {
                    continue;
                }
            }
        }
        
        if(board[row][col].equals("*"))
        {
            occupied = true;
            return count-1;
        }
        
        else
        {
            occupied = false;
            return count;
        }
    }

    
    public void changeCells()
    {
        String[][]temp = new String[6][6];
        
        for(int i=0; i<board.length; i++)
        {
            System.arraycopy(board[i],0,temp[i],0,board[0].length);
        }
        
        for(int j=0; j<6; j++)
        {
            for(int k=0; k<6; k++)
            {
                int num = neighbors(j,k);
                
                if(num==3 && occupied==false)
                    temp[j][k] = ("*");
                
                else if((num<2 || num>3) && occupied==true)
                    temp[j][k] = (" ");
            }
        }
  
        board = temp;
    }
}
        