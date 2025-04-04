package lab_inheritance25oct2024;

public class MainTicket2 
{

	public static void main(String[] args) 
	{
		Ticket2 regularTicket=new Ticket2("Concert",101,50.0);
		regularTicket.getOutput();
		VIPTicket2 vipTicket=new VIPTicket2("VIP Concert", 201, 100.0, "Backstage Access");
		vipTicket.getOutput();
		StudentTickets2 studentTicket = new StudentTickets2("Student Event", 301, 30.0, true);
		studentTicket.getOutput();
	}

}
