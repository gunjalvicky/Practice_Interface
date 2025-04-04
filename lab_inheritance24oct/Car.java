package lab_inheritance24oct;

public class Car extends Vehicle 
{
	int numberOfDoors;

	public  Car(String make, String model, int year, int numberOfDoors) 
	{
		super(make, model, year);
		this.numberOfDoors=numberOfDoors;
	}
	public void displayDetails()
	{
		if(this.numberOfDoors<=0)
		{
			System.err.printf("Error Invalid Input");
		}
		else {
			System.out.println("Make :"+this.make+" "+"Model :"+this.model+" "+"Year :"+this.year+" "+"Number of doors :"+this.numberOfDoors);
		}
	}
}
