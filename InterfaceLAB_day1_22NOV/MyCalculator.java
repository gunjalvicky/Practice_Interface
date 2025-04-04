package InterfaceLAB_day1_22NOV;

public class MyCalculator implements AdvancedArithmetic 
{
	int sum=0;

	@Override
	public int divisorSum(int AdvancedArithmetic) 
	{
		
		if(AdvancedArithmetic<0  )
		{
			System.err.println("Input must be a positive integer.");
		}
		else
		{
			
			for(int i=1;i<=AdvancedArithmetic;i++)
			{
				if(AdvancedArithmetic%i==0)
				{
					sum+=i;
				}	
			}
		}
		return sum;	
	}
}
