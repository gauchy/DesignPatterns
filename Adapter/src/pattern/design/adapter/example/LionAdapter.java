package pattern.design.adapter.example;

public class LionAdapter implements Lion
{
	Cat cat;
	LionAdapter()
	{
		cat = new Cat();
	}
	@Override
	public void hunt() 
	{
		cat.play();
	}

	@Override
	public void makeSound()
	{
		cat.makeSound();
	}

	@Override
	public void sleep() 
	{
		cat.sleep();
	}

	@Override
	public void eat()
	{
		cat.drink();
	}

}
