package example.wiki.factorymethod;

public class SedanFactory extends CarFactory
{

	@Override
	public Car createCar()
	{
		System.out.println("Creating Sedan");
		return new Sedan();
	}

}
