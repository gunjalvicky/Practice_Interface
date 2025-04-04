package InterfaceLAB_day1_22NOV;

public class EmployeeManagement {

	public static void main(String[] args) 
	{
		FullTimeEmployee fullTimeEmployee =new FullTimeEmployee(111,"Vicky ",34000,2000);
		System.out.println(fullTimeEmployee.calculateSalary()) ;
		fullTimeEmployee.generatePayroll();
 
	}

}
