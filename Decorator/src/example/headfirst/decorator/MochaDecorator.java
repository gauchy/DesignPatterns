package example.headfirst.decorator;

public class MochaDecorator extends CondimentDecorator {
	
	Beverage beverage;
	
	public MochaDecorator(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() 
	{
		return beverage.getDescription() + " " + "Mocha";
	}

	@Override
	public int cost() 
	{
		return beverage.cost() + 2;
	}

}
