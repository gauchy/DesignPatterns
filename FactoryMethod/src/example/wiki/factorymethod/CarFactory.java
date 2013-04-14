package example.wiki.factorymethod;

public abstract class CarFactory {
	
	
	public Car getCar(String engineType , String color)
	{
		Car car = createCar();
		car.addEngine(engineType);
		car.color(color);
		return car;
		
	}
	
	public abstract Car createCar();

}
