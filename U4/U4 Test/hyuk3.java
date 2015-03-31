//dankmemer
//weow
//jwoeigjwoerigjawe

public class hyuk3
{
	private String grades;
	private String gpa = "";
	public hyuk3(String g)
	{
		grades = g;
	}

	public String myGPA()
	{
		int length = grades.length();
		for(int i = 0; i < length; i++)
		{
			String shit = grades.substring(i, i+1);
			switch (shit)
			{
				case "A": gpa += 4;
					break;
				case "B": gpa += 3;
					break;
				case "C": gpa += 2;
					break;
				case "D": gpa += 1;
					break;
				default: gpa += 0;
			}
		}
		return gpa;
	}
}