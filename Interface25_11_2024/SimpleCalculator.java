package Interface25_11_2024;

public class SimpleCalculator implements Calculator 
{
	@Override
	public void calculateSum (int... num)
	{
		int sum=0;
		for(int b:num)
		{
	      sum+=b;
		}
		System.out.println(sum);	
		
			
	}
	

}
