package lab_inheritance24oct;

public class Test2 
{

	public static void main(String[] args) 
	{
		ScienceStudent std=new ScienceStudent("Anjali",101,85,90,80);
		std.displayDetails();
		double res = std.calculatePercentage();
		System.out.println("Percenetage "+res);
		ArtsStudent art = new ArtsStudent("Bob",102,75,80,85);
//		res.displayDetails();
		double artper =art.calculatePercentage();
		System.out.println("Percentage "+artper);
			
		


	}

}
