//	Anthony Pizzimenti
//
//	mergeSort function

public class mergeSort
{
  private int[]a;
  
  public mergeSort(int[]arr)
  {
    a = arr;
  }
  
  public void sort()
  {
    if(a.length<=1)
      return;
    
    int[]prime = new int[a.length/2];
    int[]second = new int[a.length-prime.length];
    
    System.arraycopy(a,0,prime,0,prime.length);
    System.arraycopy(a,prime.length,second,0,second.length);
    
    mergeSort one_sort = new mergeSort(prime);
    mergeSort two_sort = new mergeSort(second);
    
    one_sort.sort();
    two_sort.sort();
    merge(prime,second);
  }
  
  public void merge(int[]prime, int[]second)
  {
    int i=0, j=0, k=0;
    
    while(i<prime.length && j<second.length)
    {
      if(prime[i] < second[j])
      {
        a[k] = prime[i];
        i++;
      }
      else
      {
        a[k] = second[j];
        j++;
      }
      k++;
    }
    
    System.arraycopy(prime,i,a,k,prime.length-i);
    System.arraycopy(second,j,a,k,second.length-j);
  }
}

    