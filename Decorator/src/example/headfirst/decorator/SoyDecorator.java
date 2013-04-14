package example.headfirst.decorator;

public class SoyDecorator  extends CondimentDecorator
{
	Beverage beverage;
	public SoyDecorator(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() 
	{
		return beverage.getDescription() + " " + "Soy";
	}

	@Override
	public int cost() 
	{
		return beverage.cost() + 3;
	}

}
