package example.headfirst.decorator;

public class HouseBlend extends Beverage {

	HouseBlend()
	{
		description = "House Blend";
	}
	
	
	@Override
	public int cost() 
	{
		return 11;
	}
	

}
