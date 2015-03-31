//	Anthony Pizzimenti
//
//	Finds the average, standard deviation, and correlation between
//	two sets of data.
//
//	For AP, my  best friend.


public class U5A1
{
	public static void main(String[]args)
	{
    	U5A1 x = new U5A1();
  	}

  	public U5A1()
  	{
    	int[] apExam = {4,5,5,5,3,2,5,4,5,4,3,4,5,4,4,5,4};
    	int[] grades = {5,5,5,5,4,4,5,3,5,4,4,5,5,4,4,5,4};

    	System.out.printf("Mean of AP Exams\t = %.2f%n", mean(apExam));
    	System.out.printf("Mean of Grades\t\t = %.2f%n%n", mean(grades));

    	System.out.printf("Standard Deviation of AP Exams\t = %.2f%n", stdDev(apExam));
    	System.out.printf("Standard Deviation of Grades\t = %.2f%n%n", stdDev(grades));

    	System.out.printf("Correlation = %.2f%n%n", correl(apExam, grades));
  	}

 	public double mean(int[]y)
  	{
    	int[]a = y;
    	int sum = 0;
    	double mean = 0.0;

    	for(int i = 0; i < a.length; i++)
    	{
    		sum += a[i];
    	}

    	double b = (double)sum;
    	double c = (double)a.length;
    	mean = b/c;
    	return mean;
  	}

  	public double stdDev(int[]y)
  	{
    	int[]a = y;
    	double loop = 0.0, average;

    	for(int i = 0; i < a.length; i++)
    	{
      		double x = a[i];
      		loop += (x - mean(a)) * (x - mean(a));
    	}

    	double b = (double)a.length;
    	average = loop/b;
    	loop = Math.sqrt(average);
    	return loop;
  	}

  	public double correl(int[]y, int[]z)
  	{
   		int[]a = y;
    	int[]b = z;
    	double loop = 0.0, correl;

    	for(int i = 0; i < a.length; i++)
    	{
     	 	double f = (double)a[i];
     	 	double g = (double)b[i];
     	 	loop += (f - mean(a)) * (g - mean(b));
   		}

    	double h = (double)a.length;
    	correl = loop / ((h - 1.0) * (stdDev(a) * stdDev(b)));
    	return correl;
  	}
}

/* output

Mean of AP Exams         = 4.18
Mean of Grades           = 4.47

Standard Deviation of AP Exams   = 0.86
Standard Deviation of Grades     = 0.61

Correlation = 0.67

*/