package example.wiki.factorymethod;

public class Sedan extends Car{

	@Override
	public void addEngine(String engineType)
	{
		System.out.println("making sedan engine type " + engineType);
	}

}
