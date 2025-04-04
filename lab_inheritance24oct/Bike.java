package lab_inheritance24oct;

public class Bike extends Vehicle 
{
	String type;

	public Bike(String make, String model, int year,String type) {
		super(make, model, year);
		this.type=type;
	}
	public void displayDetails()
	{

	if(this.year<=0)
	{
	 	System.out.println("Error Invalid Input");
    }
	else {
		System.out.println("Make :"+this.make+" "+"Model :"+this.model+" "+"Year :"+this.year+""+"Type :"+this.type);
	}
	
	}
}
