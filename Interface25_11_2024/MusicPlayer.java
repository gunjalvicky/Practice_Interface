package Interface25_11_2024;

public  class MusicPlayer implements AdvancedmediaPlayer
{
	String title;
	@Override 
	public void play()
	{
			System.out.println("Playing Music:"+title);
		
	}
	@Override 
	public void pause()
	{
		System.out.println("pausing Music :"+title);
	}
	@Override 
	public void stop()
	{
		System.out.println("Stop music  :"+title);
	}
	
	
}
