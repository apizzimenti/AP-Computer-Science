//	Anthony Pizzimenti
//
//	Making some arrays.
//	For AP, my best friend.

import javax.swing.JOptionPane;
import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;

public class U5A3 extends JApplet
{
   private JTextArea area = new JTextArea();
   private int[]arr;
   private int datasize;

   public void init()
   {
     Container output = getContentPane();
     output.add(area);

     int a = (int)((Math.random()*51)+50);
     arr = new int[a];
     datasize = 50;
     fill();
     
     area.append("Original Array\n\n");
     
     for(int ef=0; ef<5;ef++)
     {
       for(int am=0; am<10; am++)
       {
         area.append(arr[am+ef*10]+"\t");
       }
       area.append("\n");
     }
     
     area.append("\n\nArray Length = "+arr.length+"\n\n");
     

     for(int i=0; i < 30; i++)
     {
       int rand = (int)((Math.random()*256));
       System.out.println(rand + "...  ");
       insert(rand);
     }

     area.append("Updated Array\n\n");
     for(int z = 0; z < 8; z++)
     {
       for(int y = 0; y < 10; y++)
       {
         area.append(arr[y+z*10]+"\t");
       }
       area.append("\n");
     }
     area.append("\n\nArray Length = "+arr.length);
   }
   

   public void fill()
   {
     for(int am = 0; am < 50; am++)
     {
        int fill = (int)((Math.random()*5)+(am*5));
       arr[am] = fill;
     }
   }

   public void insert(int num)
   {
     int j = 0, k = datasize;
     boolean flag = false;

     while((j < datasize) && (!flag))
     {
       if(num > arr[j])
         j++;
       else
         flag = true;
     }
     try
     {
       for(k = datasize; k > j; k--)
       {
         arr[k] = arr[k-1];
       }
     }
     catch(ArrayIndexOutOfBoundsException exception)
     {
       JOptionPane.showMessageDialog(null, "Index out of Bounds - Resizing Array","U5A3",JOptionPane.ERROR_MESSAGE);
       resize();
       arr[k] = arr[k-1];
     }

     arr[j] = num;
     datasize++;
   }

   public void resize()
   {
     int[]copy = new int[2*arr.length];
     System.arraycopy(arr,0,copy,0,arr.length);
     arr = copy;
   }
}




