package lab_inheritance25oct2024;

public class StudentTickets2 extends Ticket2

{
	private boolean studentDiscount;
	private int getPrice;

	public StudentTickets2(String evenName, int seatNumber, double price, boolean studentDiscount) 
	{
		super(evenName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	public boolean getStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}
	public void getOutput()
	{
	if(this.getSeatNumber() <=0 && this.getPrice <=0)
	{
		System.out.println("Error Invalid Input");
	}
	else 
	{
		System.out.println("\n  Student Ticket:\n Event: "+this.getEvenName()+"\n Seat Number: "+this.getSeatNumber()+"\n Price: $"+this.getPrice()+"\nStudent Discount:"+this.getStudentDiscount()+"\n");
		
	}
	}
	
	

}
