package lab_inheritance23oct;

public class Tester 
{
	public static void main(String[] args)
	{
		DayScholar day=new DayScholar(1,"john smith",2000,500);
		System.out.println(day);
		
		HostelFee hostel=new HostelFee(111,"Vicky",20000,2500);
		System.out.println(hostel);
		double payFee = day.payFee(15000);
		System.out.println("Remaining Amount to pay is ="+payFee);
	
	}

}
