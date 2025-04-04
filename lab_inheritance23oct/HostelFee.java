package lab_inheritance23oct;

class HostelFee extends Student
{
	double hostelFee;

	public HostelFee(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}
	@Override
	public String toString() {
		return "hostelFee [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
}
