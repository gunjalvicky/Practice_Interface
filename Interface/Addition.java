package Interface;

public class Addition implements Equation
{
	 int x;
	 int y;
	 public Addition(int x,int y)
	 {
		 super();
		 this.x=x;
		 this.y=y;
		 
	 }
	 @Override
	  void sum(int x, int y)
	  {
		 System.out.println("Addition of X+Y"+x+y);
	  }
	

}
