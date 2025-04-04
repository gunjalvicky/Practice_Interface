package Interface25_11_2024;

public class VideoPlayer implements AdvancedmediaPlayer
{
	String title;
	
	
	@Override 
	public void play()
	{
			System.out.println("Playing Video:"+title);
		
	}
	@Override 
	public void pause()
	{
		System.out.println("pausing video :"+title);
	}
	@Override 
	public void stop()
	{
		System.out.println("Stop video  :"+title);
	}
	
	

}
