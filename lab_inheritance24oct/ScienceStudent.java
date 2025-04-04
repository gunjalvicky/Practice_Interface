package lab_inheritance24oct;

public class ScienceStudent extends Student {
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;

	public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}

	@Override
	public void displayDetails() {
		System.out.println("Physics Mark " + this.physicsMarks);
		System.out.println("Chemestry Mark " + this.chemistryMarks);
		System.out.println("Math Mark " + this.mathMarks);
	}

	@Override
	public double calculatePercentage() {
		double sub = ((physicsMarks + chemistryMarks + mathMarks) / 3.0);
		 
		 return sub;

	}

}
