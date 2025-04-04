package lab_inheritance23oct;

class DayScholar extends Student

{
	protected  double transportFee;
	private double totalFee;
	public DayScholar(int studentId, String name, double examFee, double transportFee) 
	{
		super(studentId, name, examFee);
		this.transportFee = transportFee;
		totalFee=examFee+transportFee;//2000+500=2500
	}
	
	
	public double payFee(double amount)//15000
	{
		if(totalFee>amount)
		{
			totalFee-=amount;
			return totalFee;
		}
		else if(amount>totalFee)
		{
			amount-=totalFee;
			return -amount;
		}
		else return 0;
	}
	

	
}