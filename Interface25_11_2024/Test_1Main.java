package Interface25_11_2024;

public class Test_1Main {

	public static void main(String[] args) 
	{
		
		MusicPlayer  m= new MusicPlayer();
		VideoPlayer v= new VideoPlayer();
		m.title="munni badnam hui";
		v.title="munni badnam hui ";
		
			m.play();
			m.pause();
			m.stop();
			v.play();
			v.pause();
			v.stop();
	}

}
