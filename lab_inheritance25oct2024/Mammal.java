package lab_inheritance25oct2024;

public class Mammal extends Animal
{
	private boolean hasFur;

//	public Mammal(String name, boolean hasFur) 
//	{
//		super(name);
//		this.hasFur = hasFur;
//	}

	public Mammal(String name, boolean hasFur2) {
		// TODO Auto-generated constructor stub.
		super(name);
		this.hasFur = hasFur;

	}

	public boolean isHasFur() 
	{
		return hasFur;
	}

	public void setHasFur(boolean hasFur) 
	{
		this.hasFur = hasFur;
	}
	public void  displayDetails()
	{
		System.out.println("Name: "+this.getName()+" HasFur: "+this.hasFur);
		
	}

	@Override
	public String getName() 
	{
		return super.getName();
	}

	@Override
	public void setName(String name) 
	{
		super.setName(name);
	}
	

}
