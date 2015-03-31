// Anthony Pizzimenti
//
// Sorts arrays using the Selection and Insertion sort methods.
// For AP, my best friend.

import java.util.Random;
import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U6A1 extends JApplet
{
  private int[]a = new int[10000];

  public void init()
  {
    JTextArea output = new JTextArea();
    Font except = new Font("Monospaced", Font.PLAIN, 12);
    output.setFont(except);
    Container x = getContentPane();
    x.add(output);

    buildArrays();
    int[]b = new int[a.length];
    int[]c = new int[a.length];
    System.arraycopy(a,0,b,0,a.length);
    System.arraycopy(a,0,c,0,a.length);

    // unsorted array printing
    output.append("Unsorted Array\n");

    for(int m=0; m<15; m++)
    {
      output.append(a[m]+"\t");
    }

    output.append("\n.\n.\n.\n");

    for(int n=a.length-16; n<a.length-1; n++)
    {
      output.append(a[n] +"\t");
    }

    // selection sort printing
    output.append("\n\nAfter Selection Sort\n");
    // timing the function
    long start1 = System.currentTimeMillis();
    selectionSort(b);
    long end1 = System.currentTimeMillis();
    long total1 = end1-start1;

    for(int o=0; o<15; o++)
    {
      output.append(b[o]+"\t");
    }

    output.append("\n.\n.\n.\n");

    for(int p=a.length-16; p<a.length-1; p++)
    {
      output.append(b[p]+"\t");
    }
    output.append("\nTime = "+total1+" milliseconds");

    // insertion sort printing
    output.append("\n\nAfter Insertion Sort\n");
    // timing the function
    long start2 = System.currentTimeMillis();
    insertionSort(c);
    long end2 = System.currentTimeMillis();
    long total2 = end2-start2;

    for(int q=0; q<15; q++)
    {
      output.append(c[q]+"\t");
    }

    output.append("\n.\n.\n.\n");

    for(int r=a.length-16; r<a.length-1; r++)
    {
      output.append(c[r]+"\t");
    }

    output.append("\nTime = "+total2+" milliseconds");
  }

  public void buildArrays()
  {
    Random gen1 = new Random();

    for(int i=0; i<a.length; i++)
    {
      a[i] = gen1.nextInt(1000);
    }
  }

  public void selectionSort(int[]y)
  {
    int temp;
    int ary[] = y;
    int low;

    for(int i=0; i<ary.length-1; i++)
    {
      low = i;
      for(int k=i+1; k<ary.length; k++)
      {
        if(ary[k] < ary[low])
          low = k;
      }

      temp = ary[i];
      ary[i] = ary[low];
      ary[low] = temp;
    }

  }
  public void insertionSort(int[]d)
  {
    int f, temp;

    int[]ary = d;

    for(int i=1; i<ary.length; i++)
    {
      temp = ary[i];
      f = i;
      while(f>0 && temp<ary[f-1])
      {
        ary[f] = ary[f-1];
        f--;
      }

      ary[f] = temp;
    }
  }
}