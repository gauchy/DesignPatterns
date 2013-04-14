package example.wiki.factorymethod;

public class SUV extends Car{

	@Override
	public void addEngine(String engineType)
	{
		System.out.println("Making sedan engine type " + engineType);
	}

}
