package lab_inheritance25oct2024;

public class VIPTicket2 extends Ticket2
{
	private String SpecialAccess;
	private int getPrice;
	private String getSeatNumber;

	

	public VIPTicket2(String eventName, int seatNumber, double price, String specialAccess) {
		super(eventName, seatNumber, price);
		SpecialAccess = specialAccess;
	}

	public String getSpecialAccess() 
	{
		return SpecialAccess;
	}

	public void setSpecialAccess(String specialAccess) 
	{
		SpecialAccess = specialAccess;
	}
	
	public void getOutput()
	{
	if(this.getSeatNumber() <=0 && this.getPrice <=0)
	{
		System.out.println("Error Invalid Input");
	}
	else 
	{
		System.out.println("\n VIP Tickte:\n Event: "+this.getEvenName()+"\n Seat Number: "+this.getSeatNumber()+"\n Price: $"+this.getPrice()+"\nSpecial Access:"+this.getSpecialAccess()+"\n");
		
	}
	}

}
