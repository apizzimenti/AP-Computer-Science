//  Anthony Pizzimenti
//
//  Creates and sorts an array of names, as well as finds a name out of the lot.
//  For AP, my best friend.

import javax.swing.JApplet;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.awt.Container;
import java.awt.Font;

public class U6Test extends JApplet
{
    private String[]names = {"Barr", "Chamberlain", "Fullan", "Gertler", "Jones", "Krantzler", "Ferguson",
        "Litchfield", "Johnson", "Sundeen", "Baker", "Celebucki", "Dunagan", "Eckert", "Framke", "Hoekstra",
        "Jackson", "Klupchak", "Kurtz", "Mahler", "Maxwell", "Rothermel", "Tarjan", "Tiller", "Turek"};
    private String[]alphabetical;
    private String[]length;

 public void init()
 {
     JTextArea area = new JTextArea();
     Font except = new Font("Monospaced", Font.PLAIN, 12);
     area.setFont(except);
     area.setTabSize(12);
     Container out = getContentPane();
     out.add(area);

     alphabetical = new String[names.length];
     System.arraycopy(names,0,alphabetical,0,names.length);

     // prints line titles and dashes
     String col_1 = ("Sorted Alphabetically");
     String col_2 = ("Sorted by Length");
     area.append(col_1+"\t"+col_2+"\n");
     for(int i=0; i<col_1.length(); i++)
     {
        area.append("-");
     }
     area.append("\t");

     for(int i=0; i<col_2.length(); i++)
     {
        area.append("-");
     }
     area.append("\n");

     //  sorts first array, and makes a new array based on the sorted one
     alphaSort();
     length = new String[alphabetical.length];
     System.arraycopy(alphabetical,0,length,0,alphabetical.length);

     //  sorts second array
     lengthSort(length);

     //  prints sorted names
     for(int i=0; i<names.length; i++)
     {
        area.append(alphabetical[i]+"\t\t"+length[i]+"\n");
     }

     //  finds the name "Jones" in each array
     area.append("\nJones at index "+binarySort("Jones")+"\tJones at index "+sequentialSort("Jones"));
  }

 public void alphaSort()
 {
    int minpos;
    String temp;

       for(int i=0;i<alphabetical.length-1;i++)
       {
       		minpos = i;

        for(int k=i+1; k<alphabetical.length; k++)
        {
            int a = alphabetical[k].compareTo(alphabetical[minpos]);
            int b = alphabetical[minpos].compareTo(alphabetical[k]);

            if(a<b)
                minpos = k;
        }

        temp = alphabetical[i];
        alphabetical[i] = alphabetical[minpos];
        alphabetical[minpos] = temp;
       }
 }

 public void lengthSort(String[]d)
 {
     String[]ary = d;
     int f, temp, temp_2;
     String orig;

     for(int i=1; i<ary.length; i++)
     {
         temp = ary[i].length();
         orig = ary[i];
         f = i;

         while(f>0 && temp<ary[f-1].length())
         {
             ary[f] = ary[f-1];
             f--;
         }

         ary[f] = orig;
     }
 }

 public int binarySort(String target)
 {
     int low = 0;
     int high = alphabetical.length-1;
     int mid, dif;
     int count = 0;

     while(low<=high)
     {
         count++;
         mid = (low+high)/2;
         dif = alphabetical[mid].compareTo(target);

         if(dif==0)
             return mid;
         else if (dif<0)
             low = mid+ 1;
         else
             high = mid-1;
     }
     return -1;
 }

 public int sequentialSort(String target)
 {
     for(int i=0; i<length.length; i++)
     {
         if (length[i].equals(target))
             return i;
     }
     return -1;
 }
}


