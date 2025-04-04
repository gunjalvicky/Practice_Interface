package lab_inheritance25oct2024;

public class Dog extends Mammal
{
	
	private String breed;


	public Dog(String name, boolean hasFur, String breed) 
	{
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	

	@Override
	public boolean isHasFur() 
	{
		return super.isHasFur();
	}

	@Override
	public void setHasFur(boolean hasFur)
	{
		super.setHasFur(hasFur);
	}
	public void displayDetails()
	{
		System.out.println("Dog Details");
		System.out.println("Animal Name :"+this.getName()+"\n"+"Has Fur :"+this.isHasFur()+"\n"+"Breed :"+this.breed);
		
	}


}
