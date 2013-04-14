package example.wiki.factorymethod;

public class SUVFactory extends CarFactory {

	@Override
	public Car createCar()
	{
		System.out.println("Making SUV");
		return new SUV();
	}

}
