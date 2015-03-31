// Anthony Pizzimenti
//
// sorts arrays with mergesort and quicksort.
// For AP, my best friend.

import java.awt.Font;
import java.util.Random;
import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;

public class U6A2 extends JApplet
{
  private int[]merge = new int[5000];
  private int[]quick = new int[5000];
  JTextArea area = new JTextArea();
  
  public void init()
  {
    Font except = new Font("Monospaced", Font.PLAIN, 12);
    area.setFont(except);
    Container out = getContentPane();
    out.add(area);
    
    buildArrays();
    
    // prints unsorted array
    area.append("Unsorted Array\n");
    for(int i=0; i<15; i++)
    {
      area.append(merge[i]+"\t");
    }
    area.append("\n.\n.\n.\n");
    for(int a=merge.length-16; a<merge.length-1; a++)
    {
      area.append(merge[a]+"\t");
    }
    
    // prints mergeSort method of sorting
    area.append("\n\nMerge Sort\n");
    // timing the function
    long start1 = System.currentTimeMillis();
    mergeSort sort_1 = new mergeSort(merge);
    sort_1.sort();
    long end1 = System.currentTimeMillis();
    long time_1 = (end1-start1);
    // the end of time
    
    for(int b=0; b<15; b++)
    {
      area.append(merge[b]+"\t");
    }
    area.append("\n.\n.\n.\n");
    for(int c=merge.length-15; c<merge.length; c++)
    {
      area.append(merge[c]+"\t");
    }
    area.append("\n\nTime = "+time_1+" milliseconds");
    area.append("\n\n");
    
    
    // printing the quickSort method
    area.append("\nQuick Sort\n");
    // let's time it woohoo
    long start2 = System.currentTimeMillis();
    quickSort sort_2 = new quickSort(quick);
    sort_2.sort(0, quick.length-1);
    long end2 = System.currentTimeMillis();
    long time_2 = (end2-start2);
    // timing = done
    
    for(int d=0; d<15; d++)
    {
      area.append(quick[d]+"\t");
    }
    area.append("\n.\n.\n.\n");
    
    for(int e=quick.length-15; e<quick.length; e++)
    {
      area.append(quick[e]+"\t");
    }
    area.append("\n\nTime = "+time_2+" milliseconds");
  }
  
  public void buildArrays()
  {     
    Random gen1 = new Random();
    
    for(int f=0; f<merge.length; f++)
    {
      int ins = gen1.nextInt(999);
      merge[f] = ins;
      quick[f] = ins;
    }
  }
}
  
    
    