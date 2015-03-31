// Anthony Pizzimenti
//
// compares sequential and binary search methods
// for AP, my best friend

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U6A3 extends JApplet
{
  private JTextArea area = new JTextArea();
  private int[]first = new int[300];
  private int[]find = {2, 2629, 11176, 27032, 43661};

  public void init()
  {
    Font except = new Font("Monospaced", Font.PLAIN, 12);
    area.setFont(except);
    area.setTabSize(10);
    Container out = getContentPane();
    out.add(area);

    buildArray();

    area.append("The Array\n\n");

    for(int i=0; i<20; i++)
    {
      for(int j=0; j<15; j++)
      {
        area.append(first[j+i*15]+"\t");
      }
      area.append("\n");
    }

    area.append("\n\nSearch Comparisons using # of visits to the Array\n");
    area.append("\nNumber\tSequential\tBinary\n");
    area.append("------\t----------\t------\n");

    String found;
    String done;

    for(int k=0; k<find.length; k++)
    {
      switch(Sequential(find[k]))
      {
        default: found = Sequential(find[k])+"";
        break;

        case -1: found = "Not Found";
        break;
      }

      switch(Binary(find[k]))
      {
        default: done = Binary(find[k])+"";
        break;

        case -1: done = "Not Found";
        break;
      }

      area.append(find[k]+"\t"+found+"\t\t"+done+"\n");

    }
  }

  public void buildArray()
  {
    int uno = 1;
    first[0] = 1;

    for(int i=1; i<first.length; i++)
    {
      first[i] = first[i-1]+uno;
      uno++;
    }
  }

  public int Sequential(int target)
  {
    for(int i=0; i<first.length; i++)
    {
      if(first[i] == target)
        return i+1;
    }
    return -1;
  }

  public int Binary(int target)
  {
    int low = 0;
    int high = first.length-1;
    int mid, dif, count = 0;

    while(low<=high)
    {
      count++;
      mid = (low+high)/2;
      dif = first[mid]-target;

      if(dif==0)
        return count;
      else if (dif<0)
        low = mid+1;
      else
        high = mid-1;
    }
    return -1;
  }
}

