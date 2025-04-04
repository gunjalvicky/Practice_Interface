package Interface;

class Customer implements Bank
{
	private double balance;
	public Customer(double balance)
	{
		 this.balance=balance ;
	}
	@Override 
	public void deposit(double deposit)
	{
		if(deposit<=0)
		{
			System.err.println("Amount can't Deposited");
		}
		else 
		{
			this.balance=this.balance+deposit;
			
		}
		System.out.println("Amount after the diposited:"+balance);
	}
	@Override
	public void withdraw(double withdraw)
	{
		if(this.balance<withdraw)
		{
			System.err.println("Amount can't Withdraw");
		}
		else 
		{
			this.balance=this.balance-withdraw;
		}
		System.out.println("Amount after the Withdraw:"+this.getBalance());
	}
	@Override
	public double getBalance()
	{
		return this.balance;
	}
}



