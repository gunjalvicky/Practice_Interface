package lab_inheritance24oct;

public class ArtsStudent extends Student
{	
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) 
	{
		super(name, rollNumber);
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
	}
	@Override
	public void displayDetails() 
	{
		System.out.println("history Marks" + this.historyMarks);
		System.out.println("geography Marks " + this.geographyMarks);
		System.out.println("english Marks " + this.englishMarks);
	}

	@Override
	public double calculatePercentage() 
	{
		double sub = ((historyMarks + geographyMarks + englishMarks) / 3.0);
		 
		 return sub;

	}

	
	 
}
