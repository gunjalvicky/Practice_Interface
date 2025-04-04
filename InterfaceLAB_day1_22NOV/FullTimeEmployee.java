package InterfaceLAB_day1_22NOV;

public class FullTimeEmployee implements Employee 
{
	private int employeeId ;    
	private String employeeName ;
	private double monthlySalary ;	
	private double benefits ;	

	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
	}

	@Override
	public double calculateSalary() 
	{
		if(monthlySalary<=0 )
		{
			System.out.println(" Monthly salary cannot be negative.");
			System.exit(0);
		}else
		{
			return monthlySalary+benefits;
		}
		return 0;
	}

	@Override
	public void generatePayroll() 
	{
		if(employeeName==null||employeeName.isBlank())
		{
			System.err.println(" Employee name cannot be empty.");System.exit(0);
		}else
		{
		System.out.println("FullTimeEmployee employeeId=" + employeeId + ", employeeName=" + employeeName + ", monthlySalary=\" " + monthlySalary + ", benefits=" + benefits );
		}
	}

	

}
