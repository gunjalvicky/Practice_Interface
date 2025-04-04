package lab_inheritance24oct;

public class Student 
{
	protected String name;
	protected int rollNumber;
	
	public Student(String name, int rollNumber)
	{
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public double calculatePercentage()
	{
			return 0.0;	
	}
	public void displayDetails() 
	{
		System.out.println("Name of the Student is :"+this.name+" Roll Number of stduent is :"+this.rollNumber);
		 
	}
	
}
	