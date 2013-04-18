package pattern.design.adapter.example;

public class AfricanLion implements Lion 
{

	@Override
	public void hunt()
	{
		System.out.println("hunting for deer");
	}

	@Override
	public void makeSound()
	{
		System.out.println("roar");
	}

	@Override
	public void sleep() 
	{
		System.out.println("sleeping");
	}
	
	public void eat()
	{
		System.out.println("eating meat");
	}

}
