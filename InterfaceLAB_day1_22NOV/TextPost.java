package InterfaceLAB_day1_22NOV;

public class TextPost implements Post 
{
	String textContent;
	int likes;

	public TextPost(String textContent ) 
	{
		super();
		this.textContent = textContent;
		this.likes = 0;
	}

	@Override
	public void publish() 
	{
		System.out.println(textContent);
	}

	@Override
	public void like() 
	{
		likes++;
		System.out.println(likes);

	}

}
