package lab_inheritance25oct2024;

public class Ticket2 
{
	private String eventName;
	private int seatNumber;
	private double price;
	public Ticket2(String eventName, int seatNumber, double price) {
		super();
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	public String getEvenName() {
		return eventName;
	}
	public void setEvenName(String evenName) {
		this.eventName = evenName;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void getOutput()
	{
	if(this.seatNumber <=0 && this.price <=0)
	{
		System.out.println("Error Invalid Input");
	}
	else 
	{
		System.out.println("Regular Ticket:\n Event: "+this.eventName+"\n Seat Number: "+this.seatNumber+"\n Price: $"+this.price);
		
	}
	}
}
