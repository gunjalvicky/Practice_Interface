package lab_inheritance24oct;

public class Cylinder extends Circle
{
	double height;
	public Cylinder() 
	{
		super();
		height=0;
	}
	public Cylinder(double radius,double height)
	{
		super(radius);
		this.height = height;
	}
	public double getVolume()
	{
		
		final double pi=3.14;
		double areaOfTheCylynder=pi*super.radius*radius*this.height;
		if(areaOfTheCylynder<=0)
		{
			System.out.println("Height is Negative");
			return 0;
		}
		
			
			return areaOfTheCylynder;
		
		
		
		
		
	}
	
	

}
