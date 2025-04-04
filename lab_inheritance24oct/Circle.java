package lab_inheritance24oct;

public class Circle 
{
	double radius;
	double x;

	public Circle() {
		super();
		radius=0;
	}

	public Circle(double radius)
	{
		super();
		this.radius = radius;
		
	}
	public double getArea()
	{
		final double pi=3.14;
		double areOfCircle=pi*this.radius*this.radius;
		if(areOfCircle<=0)
		{
			System.err.printf("radius is negative.");
			return 0;
		}
		
			return  areOfCircle; 
		
		
	}
	

}
