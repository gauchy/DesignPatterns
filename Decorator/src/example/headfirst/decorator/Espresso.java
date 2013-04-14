package example.headfirst.decorator;

public class Espresso extends Beverage
{

	
	public Espresso()
	{
		description = "Espresso";
	}
	
	@Override
	public int cost() {
		return 21;
	}

}
